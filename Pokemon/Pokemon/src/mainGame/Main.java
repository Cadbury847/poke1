package mainGame;

import data.DataHandler;
import data.MoveData;

//import java.util.Dictionary;
//import java.util.Hashtable;

import data.PokemonData;
import data.TypeData;


public class Main {
	public static void main(String[] args) {
		
		
		String[] test1 = new String[] {"1","2","3","4","5","6","7"};
		String[] test2 = new String[] {"6","7","8","Carrot","1"};
		
		String[] testResult = DataHandler.concatenate(test1, test2);
		for (String i : testResult) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		TypeData.Initialize();
		//PokemonData.Initialize();
		MoveData.Initialize();
		
		System.out.println(MoveData.getEffect("Ember"));
		
		
		String[][] tempDict =  (String[][]) PokemonData.pokemon.get("Pikachu").get("possibleMoves");

		for (Object[] i : tempDict) {
			for (Object j : i) {
				String tempStr = j.toString();
				if (tempStr.contains("^")) {
					System.out.println(tempStr.substring(1));
					//System.out.println(i.length);
				}
				
			}
		}
		
		
		
		
	}
}
