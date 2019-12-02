package mainGame;

import java.util.*;

import data.*;

public class Pokemon {

	String name, nature;
	String[] type, weaknesses, strengths, noEffect;
	
	public Dictionary<String, Integer> currentMoveSet = new Hashtable<String, Integer>();
	Dictionary<Integer,String> possibleMoves;
	boolean alive, captured, multiType, confused, paralyzed, burned, asleep, poisoned, strongPoison = false;
	public int currentHealth, level, HP, attack, defence, specialAttack, specialDefence, speed;
	private int oldAtk, oldDef, oldSpAtk, oldSpDef, oldSpeed, oldHp = 0;
	int maxHealth;
	
	public Pokemon(String name, String nature, String[] type,  Dictionary<String, Integer> currentMoveSet, 
			Dictionary<Integer,String> possibleMoves, boolean alive, boolean captured, boolean multiType, int level) {
		this.name = name;
		this.nature = nature;
		this.type = type;
		this.currentMoveSet = currentMoveSet;
		this.possibleMoves = possibleMoves;
		this.alive = alive;
		this.captured = captured;
		this.multiType = multiType;
		this.level = level;
		this.oldAtk = 0;
		
		if (multiType) {
			this.weaknesses = DataHandler.concatenate(TypeData.WEAKNESSES.get(type[0]), TypeData.WEAKNESSES.get(type[1]));
			this.strengths = DataHandler.concatenate(TypeData.STRENGTHS.get(type[0]), TypeData.STRENGTHS.get(type[1]));
			this.noEffect = DataHandler.concatenate(TypeData.NOEFFECT.get(type[0]), TypeData.NOEFFECT.get(type[1]));
		} else {
			this.weaknesses = TypeData.WEAKNESSES.get(type[0]);
			this.strengths = TypeData.STRENGTHS.get(type[0]);
			this.noEffect = TypeData.NOEFFECT.get(type[0]);
		}
		
	}

	public boolean[] levelUp() {
		level += 1;
		oldAtk = attack;
		oldDef = defence;
		oldSpeed = speed;
		oldHp = HP;
		oldSpDef = specialDefence;
		oldSpAtk = specialAttack;
		
		attack = Maths.getNewStat(getBaseAtk(), getAttackIV(), getAttackXP(), level, "Atk");
		defence = Maths.getNewStat(getBaseDef(), getDefenceIV(), getDefenceXP(), level, "Def");
		speed = Maths.getNewStat(getBaseSpeed(), getSpeedIV(), getSpeedXP(), level, "Spd");
		specialDefence = Maths.getNewStat(getBaseSpDef(), getSpDefIV(), getSpDefXP(), level, "Sp.Def");
		specialAttack = Maths.getNewStat(getBaseSpAtk(), getSpAtkIV(), getSpAtkXP(), level, "Sp.Atk");
		HP = Maths.getNewStat(getBaseHP(), getHPIV(), getHPXP(), level, "HP");
		
		boolean[] retList = new boolean[] {attack > oldAtk, defence > oldDef, speed > oldSpeed, specialDefence > oldSpDef, specialAttack > oldSpAtk, HP > oldHp};
		
		return retList;
	}

	

	private int getHPXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getSpAtkXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getSpDefXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getSpeedXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getDefenceXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getAttackXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getWeaknesses() {
		return weaknesses;
	}


	public String[] getNoEffect() {
		return noEffect;
	}


	public String[] getStrengths() {
		return strengths;
	}


	public float getAccuracyMod() {
		// TODO return accuracy mod
		return 0;
	}


	public float getEvasionMod() {
		// TODO return evasion mod
		return 0;
	}


	public String getName() {
		return name;
	}


	public int getAttackIV() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getDefenceIV() {
		return 0;
	}
	
	public int getSpeedIV() {
		return 0;
	}
	
	public int getSpAtkIV() {
		return 0;
	}
	
	public int getSpDefIV() {
		return 0;
	}
	
	private int getHPIV() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getBaseAtk() {
		return (int) PokemonData.pokemon.get(name).get("baseAttack");
	}
	
	public int getBaseDef() {
		return (int) PokemonData.pokemon.get(name).get("baseDefence");
	}
	
	public int getBaseSpeed() {
		return (int) PokemonData.pokemon.get(name).get("baseSpeed");
	}
	
	public int getBaseHP() {
		return (int) PokemonData.pokemon.get(name).get("baseHp");
	}
	
	public int getBaseSpAtk() {
		return (int) PokemonData.pokemon.get(name).get("baseSp.Atk");
	}
	
	public int getBaseSpDef() {
		return (int) PokemonData.pokemon.get(name).get("baseSp.Def");
	}

	public int getStat(Object object) {
		if (object == "Special") {
			return specialAttack;
		} else {
			return attack;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
