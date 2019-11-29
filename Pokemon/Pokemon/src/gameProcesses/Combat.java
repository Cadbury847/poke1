package gameProcesses;

import data.MoveData;
import mainGame.Pokemon;

public class Combat {
	
	//method for every move

	
	static String[] ember(Pokemon userMon, Pokemon target){
		
		int currentPP = userMon.currentMoveSet.get("Ember");

		userMon.currentMoveSet.put("Ember", currentPP - 1);
		String hit = attack(userMon, target, "Ember");
		boolean burn;
		String[] returner;
		//do randint for burn, set boolean burn = true;
		/* randint:
		 * Random random = new Random();
		 * int randint = random.nextInt(5); //randint between 0 and 4 (inc)*/
		//apply burn effect
		
		String[] retStr = new String[] {userMon.getName()+" used Ember!", hit};
		
		if (burn){
			returner = new String[] {retStr[0], retStr[1], "Enemy "+target.getName()+" was burned!"};
		} else {
			returner = retStr;
		}
		
		return returner;
	}


	private static String attack(Pokemon userMon, Pokemon target, String move){

		String moveType = MoveData.getType(move);
		float hitChance = data.MoveData.getAccuracy(move);
		hitChance = hitChance + userMon.getAccuracyMod() -target.getEvasionMod();
		int superEff = 1;
		boolean noEff = false;
		float halfEff = 1;
		boolean hit;
		
		for (String i : target.getWeaknesses()){
			if (i == moveType){
				superEff = superEff * 2;
			}
		}
		
		for (String i : target.getNoEffect()){
			if (i == moveType){
				noEff = true;
			}
		}
		
		for (String i : target.getStrengths()){
			if (i == moveType){
				halfEff = halfEff / 2;
			}
		}
		
		if (hitChance != 100){
			//gonna have to randint it
			hit = false;
		} else { 
			hit = true;
		}
		
		if (hit){
			if ((superEff > 1) & (halfEff == 1)){
				target.currentHealth = target.currentHealth - (data.MoveData.getPower(move) * userMon.getStat(MoveData.moves.get(move)[2])) * superEff;
				return "It's super effective!";
			} else if (noEff){
				return "No effect!";
			} else if ((halfEff < 1) & (superEff == 1)){
				target.currentHealth = target.currentHealth - (data.MoveData.getPower(move) * userMon.getStat(MoveData.moves.get(move)[2])) * halfEff;
				return "It's not very effective.";
			} else {
				target.currentHealth = target.currentHealth - data.MoveData.getPower(move) * userMon.getStat(MoveData.moves.get(move)[2]);
				//getStat is trying to get SpAtk/Atk of attacking pokemon
				//need to - foes SpDef/Def
				return "null";
			}
		}
	}
}
