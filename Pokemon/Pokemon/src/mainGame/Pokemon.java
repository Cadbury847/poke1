package mainGame;

import java.util.*;

import data.*;

public class Pokemon {

	String name;
	String nature;
	String[] type;
	String[] weaknesses;
	String[] strengths;
	String[] noEffect;
	public Dictionary<String, Integer> currentMoveSet = new Hashtable<String, Integer>();
	Dictionary<Integer,String> possibleMoves;
	boolean alive = false;
	boolean captured = false;
	boolean multiType = false;
	public int currentHealth;
	int maxHealth;
	
	public Pokemon(String name, String nature, String[] type,  Dictionary<String, Integer> currentMoveSet, 
			Dictionary<Integer,String> possibleMoves, boolean alive, boolean captured, boolean multiType) {
		this.name = name;
		this.nature = nature;
		this.type = type;
		this.currentMoveSet = currentMoveSet;
		this.possibleMoves = possibleMoves;
		this.alive = alive;
		this.captured = captured;
		this.multiType = multiType;
		
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
}
