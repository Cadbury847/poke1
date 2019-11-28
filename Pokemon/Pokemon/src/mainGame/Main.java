package mainGame;

//import java.util.Dictionary;
//import java.util.Hashtable;

import data.PokemonData;
import data.TypeData;



public class Main {
	public static void main(String[] args) {
		
		TypeData.Initialize();
		PokemonData.Initialize();
		
		String[][] tempDict =  (String[][]) PokemonData.pokemon.get("Bulbasaur").get("possibleMoves");

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
