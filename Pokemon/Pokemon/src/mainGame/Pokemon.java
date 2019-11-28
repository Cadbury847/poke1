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
	String[] currentMoveSet;
	Dictionary<Integer,String> possibleMoves;
	boolean alive = false;
	boolean captured = false;
	boolean multiType = false;
	
	
	public Pokemon(String name, String nature, String[] type,  String[] currentMoveSet, 
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
			this.weaknesses = DataHandler.Concatenate(TypeData.WEAKNESSES.get(type[0]), TypeData.WEAKNESSES.get(type[1]));
			this.strengths = DataHandler.Concatenate(TypeData.STRENGTHS.get(type[0]), TypeData.STRENGTHS.get(type[1]));
			this.noEffect = DataHandler.Concatenate(TypeData.NOEFFECT.get(type[0]), TypeData.NOEFFECT.get(type[1]));
		} else {
			this.weaknesses = TypeData.WEAKNESSES.get(type[0]);
			this.strengths = TypeData.STRENGTHS.get(type[0]);
			this.noEffect = TypeData.NOEFFECT.get(type[0]);
		}
		
	}
}
