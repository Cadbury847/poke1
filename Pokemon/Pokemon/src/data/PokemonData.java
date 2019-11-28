package data;

import java.util.Dictionary;
import java.util.Hashtable;

public class PokemonData {

	
	public static Dictionary<String, Dictionary<String, Object>> pokemon = new Hashtable<String, Dictionary<String, Object>>();
	
///////////////////////////////////////////////////////////////////0FORMAT///////////////////////////////////////////////////////////////////////	
	
	static String[] secondaryFormat = new String[] {"dexNum","dexEntry","species","height","weight","type","type2","ability","ability2","EVYield","catchRate","baseFriendship",
			"baseExp","growthRate","gender","baseHp","baseAttack","baseDefence","baseSp.Atk","baseSp.Def","baseSpeed",
			"baseTotal","canEvolve","evolveAt","itemEvolve","evolveItem","tradeEvolve","possibleMoves","HMMoves","TMMoves", "backTexture", "frontTexture",
			"shinyBackTexture", "shinyFrontTexture"};
	
///////////////////////////////////////////////////////////////////1 BULBASAUR///////////////////////////////////////////////////////////////////////	

	static String[][] bulbMoveTable = new String[][] {{"^1", "Growl", "Tackle"}, {"^7", "Leech Seed"}, {"^13", "Vine Whip"}, {"^20", "Poison Powder"},
								{"^27", "Razor Leaf"}, {"^34", "Growth"}, {"^41", "Sleep Powder"}, {"^48", "Solar Beam"}};

	static Object[] bulbInfo1 = new Object[] {001, "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon.",
				"Seed Pokémon",0.7,6.9,"Grass","Poison","Overgrow","Chlorophyll", new Object[] {1, "Sp.Atk"}, 45, 70, 64, "medium slow", 87.5, 45, 49, 49, 65, 65, 45,
				318, true, 16, false, "null", false, bulbMoveTable, new int[] {01}, new int[] {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33 ,34, 44, 50}, 
				"bulbasaurBackTexture.PNG", "bulbasaurFrontTexture.PNG", "bulbasaurShinyBackTexture.PNG", "bulbasaurShinyFrontTexture.PNG"};

	static Dictionary<String, Object> bulbInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////2 IVYSAUR///////////////////////////////////////////////////////////////////////	
	
	static String[][] ivyMoveTable = new String[][] {{"^1", "Growl", "Leech Seed", "Tackle"}, {"^7", "Leech Seed"}, {"^13", "Vine Whip"}, {"^22", "Poison Powder"},
						{"^30", "Razor Leaf"}, {"^38", "Growth"}, {"^46", "Sleep Powder"}, {"^54", "Solar Beam"}};

	static Object[] ivyInfo1 = new Object[] {002, "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.",
			"Seed Pokémon",1.0,13.0,"Grass","Poison","Overgrow","Chlorophyll", new Object[] {1, "Sp.Atk", 1, "Sp.Def"}, 45, 70, 141, "medium slow", 87.5, 60, 62, 63, 80, 80,
			60, 405, true, 32, false, "null", false, ivyMoveTable, new int[] {01}, new int[] {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50},
			"ivysaurBackTexture.PNG", "ivysaurFrontTexture.PNG", "ivysaurShinyBackTexture.PNG", "ivysaurShinyFrontTexture.PNG"};
	
	static Dictionary<String, Object> ivyInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////3 VENUSAUR///////////////////////////////////////////////////////////////////////
	
	static String[][] venuMoveTable = new String[][] {{"^1", "Growl", "Leech Seed", "Tackle", "Vine Whip"}, {"^7", "Leech Seed"}, {"^13", "Vine Whip"},
								{"^22", "Poison Powder"}, {"^30", "Razor Leaf"}, {"^43", "Growth"}, {"^55", "Sleep Powder"}, {"^65", "Solar Beam"}};
								
	static Object[] venuInfo1 = new Object[] {003, "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.",
				"Seed Pokémon",2.0,100.0,"Grass","Poison","Overgrow","Chlorophyll", new Object[] {2, "Sp.Atk", 1, "Sp.Def"}, 45, 70, 208, "medium slow",87.5,
				80,82,83,100,100,80,525,false,200,false,"null",false,venuMoveTable, new int[] {01}, new int[] {3, 6, 8, 9, 10, 15, 20, 21, 22, 31, 32, 33, 34, 44, 50},
				"venusaurBackTexture.PNG", "venusaurFrontTexture.PNG", "venusaurShinyBackTexture.PNG", "venusaurShinyFrontTexture.PNG"};
	
	static Dictionary<String, Object> venuInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////4 CHARMANDER///////////////////////////////////////////////////////////////////////
	
	static String[][] charmanderMoveTable = new String[][] {{"^1", "Growl", "Scratch"}, {"^9", "Ember"}, {"^15", "Leer"}, {"^22", "Rage"}, {"^30", "Slash"},
								{"^38", "Flamethrower"}, {"^46", "Fire Spin"}};
								
	static Object[] charmanderInfo1 = new Object[] {004,"Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.",
					"Lizard Pokémon",0.6,8.5,"Fire","null","Blaze","Solar Power", new Object[] {1, "Speed"}, 45, 70, 65, "medium slow",87.5,39,52,43,60,
					50,65,309,true,16,false,"null",false,charmanderMoveTable, new int[] {01, 04}, new int[] {1,3,5,6,8,9,10,17,18,19,20,23,28,31,32,33,34,
					38,39,40,44,50},"charmanderBackTexture.PNG", "charmanderFrontTexture.PNG", "charmanderShinyBackTexture.PNG", 
					"charmanderShinyFrontTexture.PNG"};
	
	static Dictionary<String, Object> charmanderInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////5 CHARMELEON///////////////////////////////////////////////////////////////////////
	
	static String[][] charmeleonMoveTable = new String[][] {{"^1", "Ember", "Growl", "Scratch"}, {"^9", "Ember"}, {"^15", "Leer"}, {"^24", "Rage"},
								{"^33", "Slash"}, {"^42", "Flamethrower"}, {"^56", "Fire Spin"}};
								
	static Object[] charmeleonInfo1 = new Object[] {005, "When it swings its burning tail, it elevates the temperature to unbearably high levels.",
				"Flame Pokémon",1.1,19.0,"Fire","null","Blaze","Solar Power", new Object[] {1, "Sp.Atk", 1, "Speed"},45,70,142,"medium slow",87.5,
				58,64,58,80,65,80,405,true,36,false,"null",false,charmeleonMoveTable, new int[] {01, 04}, new int[] {1,3,5,6,8,9,10,17,18,19,20,23,28,31,
				32,33,34,38,39,40,44,50},"charmanderBackTexture.PNG", "charmanderFrontTexture.PNG", "charmanderShinyBackTexture.PNG", 
				"charmanderShinyFrontTexture.PNG"};
	
	static Dictionary<String, Object> charmeleonInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////6 CHARIZARD///////////////////////////////////////////////////////////////////////	
	
	static String[][] charizardMoveTable = new String[][] {{"^1", "Ember", "Growl", "Leer", "Scratch"}, {"^9", "Ember"}, {"^15", "Leer"},
								{"^24", "Rage"}, {"^36", "Slash"}, {"^46", "Flamethrower"}, {"^55", "Fire Spin"}};
								
	static Object[] charizardInfo1 = new Object[] {};
	
	static Dictionary<String, Object> charizardInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////7 SQUIRTLE///////////////////////////////////////////////////////////////////////	
	
	static String[][] squirtleMoveTable = new String[][] {};
	
	static Object[] squirtleInfo1 = new Object[] {};
	
	static Dictionary<String, Object> squirtleInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////8 WARTORTLE///////////////////////////////////////////////////////////////////////	

	static String[][] wartortleMoveTable = new String[][] {};
	
	static Object[] wartortleInfo1 = new Object[] {};
	
	static Dictionary<String, Object> wartortleInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////9 BLASTOISE///////////////////////////////////////////////////////////////////////	

	static String[][] blastoiseMoveTable = new String[][] {};
	
	static Object[] blastoiseInfo1 = new Object[] {};
	
	static Dictionary<String, Object> blastoiseInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////10 CATERPIE///////////////////////////////////////////////////////////////////////	

	static String[][] caterpieMoveTable = new String[][] {};
	
	static Object[] caterpieInfo1 = new Object[] {};
	
	static Dictionary<String, Object> caterpieInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////11 METAPOD///////////////////////////////////////////////////////////////////////	

	static String[][] metapodMoveTable = new String[][] {};
	
	static Object[] metapodInfo1 = new Object[] {};
	
	static Dictionary<String, Object> metapodInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////12 BUTTERFREE///////////////////////////////////////////////////////////////////////	

	static String[][] butterfreeMoveTable = new String[][] {};
	
	static Object[] butterfreeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> butterfreeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////13 WEEDLE///////////////////////////////////////////////////////////////////////	

	static String[][] weedleMoveTable = new String[][] {};
	
	static Object[] weedleInfo1 = new Object[] {};
	
	static Dictionary<String, Object> weedleInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////14 KAKUNA///////////////////////////////////////////////////////////////////////	

	static String[][] kakunaMoveTable = new String[][] {};
	
	static Object[] kakunaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kakunaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////15 BEEDRILL///////////////////////////////////////////////////////////////////////	

	static String[][] beedrillMoveTable = new String[][] {};
	
	static Object[] beedrillInfo1 = new Object[] {};
	
	static Dictionary<String, Object> beedrillInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////16 PIDGEY///////////////////////////////////////////////////////////////////////	

	static String[][] pidgeyMoveTable = new String[][] {};
	
	static Object[] pidgeyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> pidgeyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////17 PIDGEOTTO///////////////////////////////////////////////////////////////////////	

	static String[][] pidgeottoMoveTable = new String[][] {};
	
	static Object[] pidgeottoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> pidgeottoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////18 PIDGEOT///////////////////////////////////////////////////////////////////////	

	static String[][] pidgeotMoveTable = new String[][] {};
	
	static Object[] pidgeotInfo1 = new Object[] {};
	
	static Dictionary<String, Object> pidgeotInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////19 RATTATA///////////////////////////////////////////////////////////////////////	

	static String[][] rattataMoveTable = new String[][] {};
	
	static Object[] rattataInfo1 = new Object[] {};
	
	static Dictionary<String, Object> rattataInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////20 RATICATE///////////////////////////////////////////////////////////////////////	

	static String[][] raticateMoveTable = new String[][] {};
	
	static Object[] raticateInfo1 = new Object[] {};
	
	static Dictionary<String, Object> raticateInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////21 SPEAROW///////////////////////////////////////////////////////////////////////	

	static String[][] spearowMoveTable = new String[][] {};
	
	static Object[] spearowInfo1 = new Object[] {};
	
	static Dictionary<String, Object> spearowInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////22 FEAROW///////////////////////////////////////////////////////////////////////	

	static String[][] fearowMoveTable = new String[][] {};
	
	static Object[] fearowInfo1 = new Object[] {};
	
	static Dictionary<String, Object> fearowInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////23 EKANS///////////////////////////////////////////////////////////////////////	

	static String[][] ekansMoveTable = new String[][] {};
	
	static Object[] ekansInfo1 = new Object[] {};
	
	static Dictionary<String, Object> ekansInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////24 ARBOK///////////////////////////////////////////////////////////////////////	

	static String[][] arbokMoveTable = new String[][] {};
	
	static Object[] arbokInfo1 = new Object[] {};
	
	static Dictionary<String, Object> arbokInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////25 PIKACHU///////////////////////////////////////////////////////////////////////	

	static String[][] pikachuMoveTable = new String[][] {};
	
	static Object[] pikachuInfo1 = new Object[] {};
	
	static Dictionary<String, Object> pikachuInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////26 RAICHU///////////////////////////////////////////////////////////////////////	

	static String[][] raichuMoveTable = new String[][] {};
	
	static Object[] raichuInfo1 = new Object[] {};
	
	static Dictionary<String, Object> raichuInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////27 SANDSHREW///////////////////////////////////////////////////////////////////////	
	
	static String[][] sandshrewMoveTable = new String[][] {};
	
	static Object[] sandshrewInfo1 = new Object[] {};
	
	static Dictionary<String, Object> sandshrewInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////28 SANDSLASH///////////////////////////////////////////////////////////////////////	

	static String[][] sandslashMoveTable = new String[][] {};
	
	static Object[] sandslashInfo1 = new Object[] {};
	
	static Dictionary<String, Object> sandslashInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////29 NIDORAN(F)///////////////////////////////////////////////////////////////////////	

	static String[][] nidoranfMoveTable = new String[][] {};
	
	static Object[] nidoranfInfo1 = new Object[] {};
	
	static Dictionary<String, Object> nidoranfInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////30 NIDORINA///////////////////////////////////////////////////////////////////////	

	static String[][] nidorinaMoveTable = new String[][] {};
	
	static Object[] nidorinaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> nidorinaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////31 NIDOQUEEN///////////////////////////////////////////////////////////////////////	

	static String[][] nidoqueenMoveTable = new String[][] {};
	
	static Object[] nidoqueenInfo1 = new Object[] {};
	
	static Dictionary<String, Object> nidoqueenInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////32 NIDORAN(M)///////////////////////////////////////////////////////////////////////	

	static String[][] nidoranmMoveTable = new String[][] {};
	
	static Object[] nidoranmInfo1 = new Object[] {};
	
	static Dictionary<String, Object> nidoranmInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////33 NIDORINO///////////////////////////////////////////////////////////////////////	

	static String[][] nidorinoMoveTable = new String[][] {};
	
	static Object[] nidorinoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> nidorinoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////34 NIDOKING///////////////////////////////////////////////////////////////////////	

	static String[][] nidokingMoveTable = new String[][] {};
	
	static Object[] nidokingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> nidokingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////35 CLEFAIRY///////////////////////////////////////////////////////////////////////	

	static String[][] clefairyMoveTable = new String[][] {};
	
	static Object[] clefairyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> clefairyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////36 CLEFABLE///////////////////////////////////////////////////////////////////////	

	static String[][] clefableMoveTable = new String[][] {};
	
	static Object[] clefableInfo1 = new Object[] {};
	
	static Dictionary<String, Object> clefableInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////37 VULPIX///////////////////////////////////////////////////////////////////////	

	static String[][] vulpixMoveTable = new String[][] {};
	
	static Object[] vulpixInfo1 = new Object[] {};
	
	static Dictionary<String, Object> vulpixInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////38 NINETALES///////////////////////////////////////////////////////////////////////	

	static String[][] ninetalesMoveTable = new String[][] {};
	
	static Object[] ninetalesInfo1 = new Object[] {};
	
	static Dictionary<String, Object> ninetalesInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////39 JIGGLYPUFF///////////////////////////////////////////////////////////////////////	
	
	static String[][] jigglypuffMoveTable = new String[][] {};
	
	static Object[] jigglypuffInfo1 = new Object[] {};
	
	static Dictionary<String, Object> jigglypuffInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////40 WIGGLYTUFF///////////////////////////////////////////////////////////////////////	
	
	static String[][] wigglytuffMoveTable = new String[][] {};
	
	static Object[] wigglytuffInfo1 = new Object[] {};
	
	static Dictionary<String, Object> wigglytuffInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////41 ZUBAT///////////////////////////////////////////////////////////////////////	

	static String[][] zubatMoveTable = new String[][] {};
	
	static Object[] zubatInfo1 = new Object[] {};
	
	static Dictionary<String, Object> zubatInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////42 GOLBAT///////////////////////////////////////////////////////////////////////	

	static String[][] golbatMoveTable = new String[][] {};
	
	static Object[] golbatInfo1 = new Object[] {};
	
	static Dictionary<String, Object> golbatInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////43 ODDISH///////////////////////////////////////////////////////////////////////	

	static String[][] oddishMoveTable = new String[][] {};
	
	static Object[] oddishInfo1 = new Object[] {};
	
	static Dictionary<String, Object> oddishInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////44 GLOOM///////////////////////////////////////////////////////////////////////	

	static String[][] gloomMoveTable = new String[][] {};
	
	static Object[] gloomInfo1 = new Object[] {};
	
	static Dictionary<String, Object> gloomInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////45 VILEPLUME///////////////////////////////////////////////////////////////////////	

	static String[][] vileplumeMoveTable = new String[][] {};
	
	static Object[] vileplumeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> vileplumeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////46 PARAS///////////////////////////////////////////////////////////////////////	

	static String[][] parasMoveTable = new String[][] {};
	
	static Object[] parasInfo1 = new Object[] {};
	
	static Dictionary<String, Object> parasInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////47 PARASECT///////////////////////////////////////////////////////////////////////	

	static String[][] parasectMoveTable = new String[][] {};
	
	static Object[] parasectInfo1 = new Object[] {};
	
	static Dictionary<String, Object> parasectInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////48 VENONAT///////////////////////////////////////////////////////////////////////	

	static String[][] venonatMoveTable = new String[][] {};
	
	static Object[] venonatInfo1 = new Object[] {};
	
	static Dictionary<String, Object> venonatInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////49 VENOMOTH///////////////////////////////////////////////////////////////////////	

	static String[][] venomothMoveTable = new String[][] {};
	
	static Object[] venomothInfo1 = new Object[] {};
	
	static Dictionary<String, Object> venomothInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////50 DIGLETT///////////////////////////////////////////////////////////////////////	

	static String[][] diglettMoveTable = new String[][] {};
	
	static Object[] diglettInfo1 = new Object[] {};
	
	static Dictionary<String, Object> diglettInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////51 DUGTRIO///////////////////////////////////////////////////////////////////////	

	static String[][] dugtrioMoveTable = new String[][] {};
	
	static Object[] dugtrioInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dugtrioInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////52 MEOWTH///////////////////////////////////////////////////////////////////////	

	static String[][] meowthMoveTable = new String[][] {};
	
	static Object[] meowthInfo1 = new Object[] {};
	
	static Dictionary<String, Object> meowthInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////53 PERSIAN///////////////////////////////////////////////////////////////////////	

	static String[][] persianMoveTable = new String[][] {};
	
	static Object[] persianInfo1 = new Object[] {};
	
	static Dictionary<String, Object> persianInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////54 PSYDUCK///////////////////////////////////////////////////////////////////////	

	static String[][] psyduckMoveTable = new String[][] {};
	
	static Object[] psyduckInfo1 = new Object[] {};
	
	static Dictionary<String, Object> psyduckInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////55 GOLDUCK///////////////////////////////////////////////////////////////////////	

	static String[][] golduckMoveTable = new String[][] {};
	
	static Object[] golduckInfo1 = new Object[] {};
	
	static Dictionary<String, Object> golduckInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////56 MANKEY///////////////////////////////////////////////////////////////////////	

	static String[][] mankeyMoveTable = new String[][] {};
	
	static Object[] mankeyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mankeyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////57 PRIMEAPE///////////////////////////////////////////////////////////////////////	

	static String[][] primeapeMoveTable = new String[][] {};
	
	static Object[] primeapeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> primeapeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////58 GROWLITHE///////////////////////////////////////////////////////////////////////	

	static String[][] growlitheMoveTable = new String[][] {};
	
	static Object[] growlitheInfo1 = new Object[] {};
	
	static Dictionary<String, Object> growlitheInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////59 ARCANINE///////////////////////////////////////////////////////////////////////	

	static String[][] arcanineMoveTable = new String[][] {};
	
	static Object[] arcanineInfo1 = new Object[] {};
	
	static Dictionary<String, Object> arcanineInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////60 POLIWAG///////////////////////////////////////////////////////////////////////	
	
	static String[][] poliwagMoveTable = new String[][] {};
	
	static Object[] poliwagInfo1 = new Object[] {};
	
	static Dictionary<String, Object> poliwagInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////61 POLIWHIRL///////////////////////////////////////////////////////////////////////	

	static String[][] poliwhirlMoveTable = new String[][] {};
	
	static Object[] poliwhirlInfo1 = new Object[] {};
	
	static Dictionary<String, Object> poliwhirlInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////62 POLIWRATH///////////////////////////////////////////////////////////////////////	

	static String[][] poliwrathMoveTable = new String[][] {};
	
	static Object[] poliwrathInfo1 = new Object[] {};
	
	static Dictionary<String, Object> poliwrathInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////63 ABRA///////////////////////////////////////////////////////////////////////	

	static String[][] abraMoveTable = new String[][] {};
	
	static Object[] abraInfo1 = new Object[] {};
	
	static Dictionary<String, Object> abraInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////64 KADABRA///////////////////////////////////////////////////////////////////////	

	static String[][] kadabraMoveTable = new String[][] {};
	
	static Object[] kadabraInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kadabraInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////65 ALAKAZAM///////////////////////////////////////////////////////////////////////	

	static String[][] alakazamMoveTable = new String[][] {};
	
	static Object[] alakazamInfo1 = new Object[] {};
	
	static Dictionary<String, Object> alakazamInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////66 MACHOP///////////////////////////////////////////////////////////////////////	

	static String[][] machopMoveTable = new String[][] {};
	
	static Object[] machopInfo1 = new Object[] {};
	
	static Dictionary<String, Object> machopInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////67 MACHOKE///////////////////////////////////////////////////////////////////////	

	static String[][] machokeMoveTable = new String[][] {};
	
	static Object[] machokeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> machokeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////68 MACHAMP///////////////////////////////////////////////////////////////////////	

	static String[][] machampMoveTable = new String[][] {};
	
	static Object[] machampInfo1 = new Object[] {};
	
	static Dictionary<String, Object> machampInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////69 BELLSPROUT///////////////////////////////////////////////////////////////////////	

	static String[][] bellsproutMoveTable = new String[][] {};
	
	static Object[] bellsproutInfo1 = new Object[] {};
	
	static Dictionary<String, Object> bellsproutInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////70 WEEPINBELL///////////////////////////////////////////////////////////////////////	

	static String[][] weepinbellMoveTable = new String[][] {};
	
	static Object[] weepinbellInfo1 = new Object[] {};
	
	static Dictionary<String, Object> weepinbellInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////71 VICTREEBEL///////////////////////////////////////////////////////////////////////	

	static String[][] victreebelMoveTable = new String[][] {};
	
	static Object[] victreebelInfo1 = new Object[] {};
	
	static Dictionary<String, Object> victreebelInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////72 TENTACOOL///////////////////////////////////////////////////////////////////////	

	static String[][] tentacoolMoveTable = new String[][] {};
	
	static Object[] tentacoolInfo1 = new Object[] {};
	
	static Dictionary<String, Object> tentacoolInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////73 TENTACRUEL///////////////////////////////////////////////////////////////////////	

	static String[][] tentacruelMoveTable = new String[][] {};
	
	static Object[] tentacruelInfo1 = new Object[] {};
	
	static Dictionary<String, Object> tentacruelInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////74 GEODUDE///////////////////////////////////////////////////////////////////////	

	static String[][] geodudeMoveTable = new String[][] {};
	
	static Object[] geodudeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> geodudeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////75 GRAVELER///////////////////////////////////////////////////////////////////////	

	static String[][] gravelerMoveTable = new String[][] {};
	
	static Object[] gravelerInfo1 = new Object[] {};
	
	static Dictionary<String, Object> gravelerInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////76 GOLEM///////////////////////////////////////////////////////////////////////	

	static String[][] golemMoveTable = new String[][] {};
	
	static Object[] golemInfo1 = new Object[] {};
	
	static Dictionary<String, Object> golemInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////77 PONYTA///////////////////////////////////////////////////////////////////////	

	static String[][] ponytaMoveTable = new String[][] {};
	
	static Object[] ponytaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> ponytaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////78 RAPIDASH///////////////////////////////////////////////////////////////////////	

	static String[][] rapidashMoveTable = new String[][] {};
	
	static Object[] rapidashInfo1 = new Object[] {};
	
	static Dictionary<String, Object> rapidashInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////79 SLOWPOKE///////////////////////////////////////////////////////////////////////	

	static String[][] slowpokeMoveTable = new String[][] {};
	
	static Object[] slowpokeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> slowpokeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////80 SLOWBRO///////////////////////////////////////////////////////////////////////	

	static String[][] slowbroMoveTable = new String[][] {};
	
	static Object[] slowbroInfo1 = new Object[] {};
	
	static Dictionary<String, Object> slowbroInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////81 MAGNEMITE///////////////////////////////////////////////////////////////////////	

	static String[][] magnemiteMoveTable = new String[][] {};
	
	static Object[] magnemiteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> magnemiteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////82 MAGNETON///////////////////////////////////////////////////////////////////////	

	static String[][] magnetonMoveTable = new String[][] {};
	
	static Object[] magnetonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> magnetonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////83 FARFETCH'D///////////////////////////////////////////////////////////////////////	

	static String[][] farfetchMoveTable = new String[][] {};
	
	static Object[] farfetchInfo1 = new Object[] {};
	
	static Dictionary<String, Object> farfetchInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////84 DODUO///////////////////////////////////////////////////////////////////////	

	static String[][] doduoMoveTable = new String[][] {};
	
	static Object[] doduoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> doduoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////85 DODRIO///////////////////////////////////////////////////////////////////////	

	static String[][] dodrioMoveTable = new String[][] {};
	
	static Object[] dodrioInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dodrioInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////86 SEEL///////////////////////////////////////////////////////////////////////	

	static String[][] seelMoveTable = new String[][] {};
	
	static Object[] seelInfo1 = new Object[] {};
	
	static Dictionary<String, Object> seelInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////87 DEWGONG///////////////////////////////////////////////////////////////////////	

	static String[][] dewgongMoveTable = new String[][] {};
	
	static Object[] dewgongInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dewgongInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////88 GRIMER///////////////////////////////////////////////////////////////////////	

	static String[][] grimerMoveTable = new String[][] {};
	
	static Object[] grimerInfo1 = new Object[] {};
	
	static Dictionary<String, Object> grimerInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////89 MUK///////////////////////////////////////////////////////////////////////	

	static String[][] mukMoveTable = new String[][] {};
	
	static Object[] mukInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mukInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////90 SHELLDER///////////////////////////////////////////////////////////////////////	

	static String[][] shellderMoveTable = new String[][] {};
	
	static Object[] shellderInfo1 = new Object[] {};
	
	static Dictionary<String, Object> shellderInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////91 CLOYSTER///////////////////////////////////////////////////////////////////////	

	static String[][] cloysterMoveTable = new String[][] {};
	
	static Object[] cloysterInfo1 = new Object[] {};
	
	static Dictionary<String, Object> cloysterInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////92 GASTLY///////////////////////////////////////////////////////////////////////	

	static String[][] gastlyMoveTable = new String[][] {};
	
	static Object[] gastlyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> gastlyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////93 HAUNTER///////////////////////////////////////////////////////////////////////	

	static String[][] haunterMoveTable = new String[][] {};
	
	static Object[] haunterInfo1 = new Object[] {};
	
	static Dictionary<String, Object> haunterInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////94 GENGAR///////////////////////////////////////////////////////////////////////	

	static String[][] gengarMoveTable = new String[][] {};
	
	static Object[] gengarInfo1 = new Object[] {};
	
	static Dictionary<String, Object> gengarInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////95 ONIX///////////////////////////////////////////////////////////////////////	

	static String[][] onixMoveTable = new String[][] {};
	
	static Object[] onixInfo1 = new Object[] {};
	
	static Dictionary<String, Object> onixInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////96 DROWZEE///////////////////////////////////////////////////////////////////////	

	static String[][] drowzeeMoveTable = new String[][] {};
	
	static Object[] drowzeeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> drowzeeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////97 HYPNO///////////////////////////////////////////////////////////////////////	

	static String[][] hypnoMoveTable = new String[][] {};
	
	static Object[] hypnoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> hypnoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////98 KRABBY///////////////////////////////////////////////////////////////////////	

	static String[][] krabbyMoveTable = new String[][] {};
	
	static Object[] krabbyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> krabbyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////99 KINGLER///////////////////////////////////////////////////////////////////////	

	static String[][] kinglerMoveTable = new String[][] {};
	
	static Object[] kinglerInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kinglerInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////100 VOLTORB///////////////////////////////////////////////////////////////////////	

	static String[][] voltorbMoveTable = new String[][] {};
	
	static Object[] voltorbInfo1 = new Object[] {};
	
	static Dictionary<String, Object> voltorbInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////101 ELECTRODE///////////////////////////////////////////////////////////////////////	

	static String[][] electrodeMoveTable = new String[][] {};
	
	static Object[] electrodeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> electrodeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////102 EXEGGCUTE///////////////////////////////////////////////////////////////////////	
	
	static String[][] exeggcuteMoveTable = new String[][] {};
	
	static Object[] exeggcuteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> exeggcuteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////103 EXEGGUTOR///////////////////////////////////////////////////////////////////////	

	static String[][] exeggutorMoveTaable = new String[][] {};
	
	static Object[] exeggutorInfo1 = new Object[] {};
	
	static Dictionary<String, Object> exeggutorInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////104 CUBONE///////////////////////////////////////////////////////////////////////	

	static String[][] cuboneMoveTable = new String[][] {};
	
	static Object[] cuboneInfo1 = new Object[] {};
	
	static Dictionary<String, Object> cuboneInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////105 MAROWAK///////////////////////////////////////////////////////////////////////	

	static String[][] marowakMoveTable = new String[][] {};
	
	static Object[] marowakInfo1 = new Object[] {};
	
	static Dictionary<String, Object> marowakInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////106 HITMONLEE///////////////////////////////////////////////////////////////////////	

	static String[][] hitmonleeMoveTable = new String[][] {};
	
	static Object[] hitmonleeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> hitmonleeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////107 HITMONCHAN///////////////////////////////////////////////////////////////////////	
	
	static String[][] hitmonchanMoveTable = new String[][] {};
	
	static Object[] hitmonchanInfo1 = new Object[] {};
	
	static Dictionary<String, Object> hitmonchanInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////108 LICKITUNG///////////////////////////////////////////////////////////////////////	

	static String[][] lickitungMoveTable = new String[][] {};
	
	static Object[] lickitungInfo1 = new Object[] {};
	
	static Dictionary<String, Object> lickitungInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////109 KOFFING///////////////////////////////////////////////////////////////////////	

	static String[][] koffingMoveTable = new String[][] {};
	
	static Object[] koffingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> koffingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////110 WEEZING///////////////////////////////////////////////////////////////////////	

	static String[][] weezingMoveTable = new String[][] {};
	
	static Object[] weezingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> weezingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////111 RHYHORN///////////////////////////////////////////////////////////////////////	

	static String[][] rhyhornMoveTable = new String[][] {};
	
	static Object[] rhyhornInfo1 = new Object[] {};
	
	static Dictionary<String, Object> rhyhornInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////112 RHYDON///////////////////////////////////////////////////////////////////////	

	static String[][] rhydonMoveTable = new String[][] {};
	
	static Object[] rhydonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> rhydonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////113 CHANSEY///////////////////////////////////////////////////////////////////////	

	static String[][] chanseyMoveTable = new String[][] {};
	
	static Object[] chanseyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> chanseyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////114 TANGELA///////////////////////////////////////////////////////////////////////	

	static String[][] tangelaMoveTable = new String[][] {};
	
	static Object[] tangelaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> tangelaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////115 KANGASKHAN///////////////////////////////////////////////////////////////////////	

	static String[][] kangaskhanMoveTable = new String[][] {};
	
	static Object[] kangaskhanInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kangaskhanInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////116 HORSEA///////////////////////////////////////////////////////////////////////	

	static String[][] horseaMoveTable = new String[][] {};
	
	static Object[] horseaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> horseaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////117 SEADRA///////////////////////////////////////////////////////////////////////	

	static String[][] seadraMoveTable = new String[][] {};
	
	static Object[] seadraInfo1 = new Object[] {};
	
	static Dictionary<String, Object> seadraInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////118 GOLDEEN///////////////////////////////////////////////////////////////////////	

	static String[][] goldeenMoveTable = new String[][] {};
	
	static Object[] goldeenInfo1 = new Object[] {};
	
	static Dictionary<String, Object> goldeenInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////119 SEAKING///////////////////////////////////////////////////////////////////////	

	static String[][] seakingMoveTable = new String[][] {};
	
	static Object[] seakingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> seakingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////120 STARYU///////////////////////////////////////////////////////////////////////	

	static String[][] staryuMoveTable = new String[][] {};
	
	static Object[] staryuInfo1 = new Object[] {};
	
	static Dictionary<String, Object> staryuInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////121 STARMIE///////////////////////////////////////////////////////////////////////	

	static String[][] starmieMoveTable = new String[][] {};
	
	static Object[] starmieInfo1 = new Object[] {};
	
	static Dictionary<String, Object> starmieInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////122 MR. MIME///////////////////////////////////////////////////////////////////////	

	static String[][] mimeMoveTable = new String[][] {};
	
	static Object[] mimeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mimeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////123 SCYTHER///////////////////////////////////////////////////////////////////////	

	static String[][] scytherMoveTable = new String[][] {};
	
	static Object[] scytherInfo1 = new Object[] {};
	
	static Dictionary<String, Object> scytherInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////124 JYNX///////////////////////////////////////////////////////////////////////	

	static String[][] jynxMoveTable = new String[][] {};
	
	static Object[] jynxInfo1 = new Object[] {};
	
	static Dictionary<String, Object> jynxInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////125 ELECTABUZZ///////////////////////////////////////////////////////////////////////	

	static String[][] electabuzzMoveTable = new String[][] {};
	
	static Object[] electabuzzInfo1 = new Object[] {};
	
	static Dictionary<String, Object> electabuzzInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////126 MAGMAR///////////////////////////////////////////////////////////////////////	

	static String[][] magmarMoveTable = new String[][] {};
	
	static Object[] magmarInfo1 = new Object[] {};
	
	static Dictionary<String, Object> magmarInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////127 PINSIR///////////////////////////////////////////////////////////////////////	

	static String[][] pinsirMoveTable = new String[][] {};
	
	static Object[] pinsirInfo1 = new Object[] {};
	
	static Dictionary<String, Object> pinsirInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////128 TAUROS///////////////////////////////////////////////////////////////////////	

	static String[][] taurosMoveTable = new String[][] {};
	
	static Object[] taurosInfo1 = new Object[] {};
	
	static Dictionary<String, Object> taurosInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////129 MAGIKARP///////////////////////////////////////////////////////////////////////	

	static String[][] magikarpMoveTable = new String[][] {};
	
	static Object[] magikarpInfo1 = new Object[] {};
	
	static Dictionary<String, Object> magikarpInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////130 GYARADOS///////////////////////////////////////////////////////////////////////	

	static String[][] gyaradosMoveTable = new String[][] {};
	
	static Object[] gyaradosInfo1 = new Object[] {};
	
	static Dictionary<String, Object> gyaradosInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////131 LAPRAS///////////////////////////////////////////////////////////////////////	

	static String[][] laprasMoveTable = new String[][] {};
	
	static Object[] laprasInfo1 = new Object[] {};
	
	static Dictionary<String, Object> laprasInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////132 DITTO///////////////////////////////////////////////////////////////////////	

	static String[][] dittoMoveTable = new String[][] {};
	
	static Object[] dittoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dittoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////133 EEVEE///////////////////////////////////////////////////////////////////////	

	static String[][] eeveeMoveTable = new String[][] {};
	
	static Object[] eeveeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> eeveeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////134 VAPOREON///////////////////////////////////////////////////////////////////////	

	static String[][] vaporeonMoveTable = new String[][] {};
	
	static Object[] vaporeonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> vaporeonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////135 JOLTEON///////////////////////////////////////////////////////////////////////	

	static String[][] jolteonMoveTable = new String[][] {};
	
	static Object[] jolteonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> jolteonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////136 FLAREON///////////////////////////////////////////////////////////////////////	

	static String[][] flareonMoveTable = new String[][] {};
	
	static Object[] flareonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> flareonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////137 PORYGON///////////////////////////////////////////////////////////////////////	

	static String[][] porygonMoveTable = new String[][] {};
	
	static Object[] porygonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> porygonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////138 OMANYTE///////////////////////////////////////////////////////////////////////	

	static String[][] omanyteMoveTable = new String[][] {};
	
	static Object[] omanyteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> omanyteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////139 OMASTAR///////////////////////////////////////////////////////////////////////	

	static String[][] omastarMoveTable = new String[][] {};
	
	static Object[] omastarInfo1 = new Object[] {};
	
	static Dictionary<String, Object> omastarInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////140 KABUTO///////////////////////////////////////////////////////////////////////	
	
	static String[][] kabutoMoveTable = new String[][] {};
	
	static Object[] kabutoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kabutoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////141 KABUTOPS///////////////////////////////////////////////////////////////////////	
	
	static String[][] kabutopsMoveTable = new String[][] {};
	
	static Object[] kabutopsInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kabutopsInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////142 AERODACTYL///////////////////////////////////////////////////////////////////////	

	static String[][] aerodactylMoveTable = new String[][] {};
	
	static Object[] aerodactylInfo1 = new Object[] {};
	
	static Dictionary<String, Object> aerodactylInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////143 SNORLAX///////////////////////////////////////////////////////////////////////	
	
	static String[][] snorlaxMoveTable = new String[][] {};
	
	static Object[] snorlaxInfo1 = new Object[] {};
	
	static Dictionary<String, Object> snorlaxInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////144 ARTICUNO///////////////////////////////////////////////////////////////////////	

	static String[][] articunoMoveTable = new String[][] {};
	
	static Object[] articunoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> articunoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////145 ZAPDOS///////////////////////////////////////////////////////////////////////	

	static String[][] zapdosMoveTable = new String[][] {};
	
	static Object[] zapdosInfo1 = new Object[] {};
	
	static Dictionary<String, Object> zapdosInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////146 MOLTRES///////////////////////////////////////////////////////////////////////	

	static String[][] moltresMoveTable = new String[][] {};
	
	static Object[] moltresInfo1 = new Object[] {};
	
	static Dictionary<String, Object> moltresInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////147 DRATINI///////////////////////////////////////////////////////////////////////	

	static String[][] dratiniMoveTable = new String[][] {};
	
	static Object[] dratiniInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dratiniInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////148 DRAGONAIR///////////////////////////////////////////////////////////////////////	

	static String[][] dragonairMoveTable = new String[][] {};
	
	static Object[] dragonairInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dragonairInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////149 DRAGONITE///////////////////////////////////////////////////////////////////////	

	static String[][] dragoniteMoveTable = new String[][] {};
	
	static Object[] dragoniteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dragoniteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////150 MEWTWO///////////////////////////////////////////////////////////////////////	
	
	static String[][] mewtwoMoveTable = new String[][] {};
	
	static Object[] mewtwoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mewtwoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////151 MEW///////////////////////////////////////////////////////////////////////	

	static String[][] mewMoveTable = new String[][] {};
	
	static Object[] mewInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mewInfo2 = new Hashtable<String, Object>();
	
	
	
	
	
	
	public static void Initialize() {

		
		for (int i = 0; i < secondaryFormat.length; i++) {
			bulbInfo2.put(secondaryFormat[i], bulbInfo1[i]);			//1
			ivyInfo2.put(secondaryFormat[i], ivyInfo1[i]);				//2
			venuInfo2.put(secondaryFormat[i], venuInfo1[i]);			//3
			charmanderInfo2.put(secondaryFormat[i], charmanderInfo1[i]);//4
			charmeleonInfo2.put(secondaryFormat[i], charmeleonInfo1[i]);//5
			charizardInfo2.put(secondaryFormat[i], charizardInfo1[i]);	//6
			squirtleInfo2.put(secondaryFormat[i], squirtleInfo1[i]);	//7
			wartortleInfo2.put(secondaryFormat[i], wartortleInfo1[i]);	//8
			blastoiseInfo2.put(secondaryFormat[i], blastoiseInfo1[i]);	//9
			caterpieInfo2.put(secondaryFormat[i], caterpieInfo1[i]);	//10
			metapodInfo2.put(secondaryFormat[i], metapodInfo1[i]);		//11
			butterfreeInfo2.put(secondaryFormat[i], butterfreeInfo1[i]);//12
			weedleInfo2.put(secondaryFormat[i], weedleInfo1[i]);		//13
			kakunaInfo2.put(secondaryFormat[i], kakunaInfo1[i]);		//14
			beedrillInfo2.put(secondaryFormat[i], beedrillInfo1[i]);	//15
			pidgeyInfo2.put(secondaryFormat[i], pidgeyInfo1[i]);		//16
			pidgeottoInfo2.put(secondaryFormat[i], pidgeottoInfo1[i]);	//17
			pidgeotInfo2.put(secondaryFormat[i], pidgeotInfo1[i]);		//18
			rattataInfo2.put(secondaryFormat[i], rattataInfo1[i]);		//19
			raticateInfo2.put(secondaryFormat[i], raticateInfo1[i]);	//20
			spearowInfo2.put(secondaryFormat[i], spearowInfo1[i]);		//21
			fearowInfo2.put(secondaryFormat[i], fearowInfo1[i]);		//22
			ekansInfo2.put(secondaryFormat[i], ekansInfo1[i]);			//23
			arbokInfo2.put(secondaryFormat[i], arbokInfo1[i]);			//24
			pikachuInfo2.put(secondaryFormat[i], pikachuInfo1[i]);		//25
			raichuInfo2.put(secondaryFormat[i], raichuInfo1[i]);		//26
			sandshrewInfo2.put(secondaryFormat[i], sandshrewInfo1[i]);	//27
			sandslashInfo2.put(secondaryFormat[i], sandslashInfo1[i]);	//28
			nidoranfInfo2.put(secondaryFormat[i], nidoranfInfo1[i]);	//29
			nidorinaInfo2.put(secondaryFormat[i], nidorinaInfo1[i]);	//30
			nidoqueenInfo2.put(secondaryFormat[i], nidoqueenInfo1[i]);	//31
			nidoranmInfo2.put(secondaryFormat[i], nidoranmInfo1[i]);	//32
			nidorinoInfo2.put(secondaryFormat[i], nidorinoInfo1[i]);	//33
			nidokingInfo2.put(secondaryFormat[i], nidokingInfo1[i]);	//34
			clefairyInfo2.put(secondaryFormat[i], clefairyInfo1[i]);	//35
			clefableInfo2.put(secondaryFormat[i], clefableInfo1[i]);	//36
			vulpixInfo2.put(secondaryFormat[i], vulpixInfo1[i]);		//37
			ninetalesInfo2.put(secondaryFormat[i], ninetalesInfo1[i]);	//38
			jigglypuffInfo2.put(secondaryFormat[i], jigglypuffInfo1[i]);//39
			wigglytuffInfo2.put(secondaryFormat[i], wigglytuffInfo1[i]);//40
			zubatInfo2.put(secondaryFormat[i], zubatInfo1[i]);			//41
			golbatInfo2.put(secondaryFormat[i], golbatInfo1[i]);		//42
			oddishInfo2.put(secondaryFormat[i], oddishInfo1[i]);		//43
			gloomInfo2.put(secondaryFormat[i], gloomInfo1[i]);			//44
			vileplumeInfo2.put(secondaryFormat[i], vileplumeInfo1[i]);	//45
			parasInfo2.put(secondaryFormat[i], parasInfo1[i]);			//46
			parasectInfo2.put(secondaryFormat[i], parasectInfo1[i]);	//47
			venonatInfo2.put(secondaryFormat[i], venonatInfo1[i]);		//48
			venomothInfo2.put(secondaryFormat[i], venomothInfo1[i]);	//49
			diglettInfo2.put(secondaryFormat[i], diglettInfo1[i]);		//50
			dugtrioInfo2.put(secondaryFormat[i], dugtrioInfo1[i]);		//51
			meowthInfo2.put(secondaryFormat[i], meowthInfo1[i]);		//52
			persianInfo2.put(secondaryFormat[i], persianInfo1[i]);		//53
			psyduckInfo2.put(secondaryFormat[i], psyduckInfo1[i]);		//54
			golduckInfo2.put(secondaryFormat[i], golduckInfo1[i]);		//55
			mankeyInfo2.put(secondaryFormat[i], mankeyInfo1[i]);		//56
			primeapeInfo2.put(secondaryFormat[i], primeapeInfo1[i]);	//57
			growlitheInfo2.put(secondaryFormat[i], growlitheInfo1[i]);	//58
			arcanineInfo2.put(secondaryFormat[i], arcanineInfo1[i]);	//59
			poliwagInfo2.put(secondaryFormat[i], poliwagInfo1[i]);		//60
			poliwhirlInfo2.put(secondaryFormat[i], poliwhirlInfo1[i]);	//61
			poliwrathInfo2.put(secondaryFormat[i], poliwrathInfo1[i]);	//62
			abraInfo2.put(secondaryFormat[i], abraInfo1[i]);			//63
			kadabraInfo2.put(secondaryFormat[i], kadabraInfo1[i]);		//64
			alakazamInfo2.put(secondaryFormat[i], alakazamInfo1[i]);	//65
			machopInfo2.put(secondaryFormat[i], machopInfo1[i]);		//66
			machokeInfo2.put(secondaryFormat[i], machokeInfo1[i]);		//67
			machampInfo2.put(secondaryFormat[i], machampInfo1[i]);		//68
			bellsproutInfo2.put(secondaryFormat[i], bellsproutInfo1[i]);//69
			weepinbellInfo2.put(secondaryFormat[i], weepinbellInfo1[i]);//70
			victreebelInfo2.put(secondaryFormat[i], victreebelInfo1[i]);//71
			tentacoolInfo2.put(secondaryFormat[i], tentacoolInfo1[i]);	//72
			tentacruelInfo2.put(secondaryFormat[i], tentacruelInfo1[i]);//73
			geodudeInfo2.put(secondaryFormat[i], geodudeInfo1[i]);		//74
			gravelerInfo2.put(secondaryFormat[i], gravelerInfo1[i]);	//75
			golemInfo2.put(secondaryFormat[i], golemInfo1[i]);			//76
			ponytaInfo2.put(secondaryFormat[i], ponytaInfo1[i]);		//77
			rapidashInfo2.put(secondaryFormat[i], rapidashInfo1[i]);	//78
			slowpokeInfo2.put(secondaryFormat[i], slowpokeInfo1[i]);	//79
			slowbroInfo2.put(secondaryFormat[i], slowbroInfo1[i]);		//80
			magnemiteInfo2.put(secondaryFormat[i], magnemiteInfo1[i]);	//81
			magnetonInfo2.put(secondaryFormat[i], magnetonInfo1[i]);	//82
			farfetchInfo2.put(secondaryFormat[i], farfetchInfo1[i]);	//83
			doduoInfo2.put(secondaryFormat[i], doduoInfo1[i]);			//84
			dodrioInfo2.put(secondaryFormat[i], dodrioInfo1[i]);		//85
			seelInfo2.put(secondaryFormat[i], seelInfo1[i]);			//86
			dewgongInfo2.put(secondaryFormat[i], dewgongInfo1[i]);		//87
			grimerInfo2.put(secondaryFormat[i], grimerInfo1[i]);		//88
			mukInfo2.put(secondaryFormat[i], mukInfo1[i]);				//89
			shellderInfo2.put(secondaryFormat[i], shellderInfo1[i]);	//90
			cloysterInfo2.put(secondaryFormat[i], cloysterInfo1[i]);	//91
			gastlyInfo2.put(secondaryFormat[i], gastlyInfo1[i]);		//92
			haunterInfo2.put(secondaryFormat[i], haunterInfo1[i]);		//93
			gengarInfo2.put(secondaryFormat[i], gengarInfo1[i]);		//94
			onixInfo2.put(secondaryFormat[i], onixInfo1[i]);			//95
			drowzeeInfo2.put(secondaryFormat[i], drowzeeInfo1[i]);		//96
			hypnoInfo2.put(secondaryFormat[i], hypnoInfo1[i]);			//97
			krabbyInfo2.put(secondaryFormat[i], krabbyInfo1[i]);		//98
			kinglerInfo2.put(secondaryFormat[i], kinglerInfo1[i]);		//99
			voltorbInfo2.put(secondaryFormat[i], voltorbInfo1[i]);		//100
			electrodeInfo2.put(secondaryFormat[i], electrodeInfo1[i]);	//101
			exeggcuteInfo2.put(secondaryFormat[i], exeggcuteInfo1[i]);	//102
			exeggutorInfo2.put(secondaryFormat[i], exeggutorInfo1[i]);	//103
			cuboneInfo2.put(secondaryFormat[i], cuboneInfo1[i]);		//104
			marowakInfo2.put(secondaryFormat[i], marowakInfo1[i]);		//105
			hitmonleeInfo2.put(secondaryFormat[i], hitmonleeInfo1[i]);	//106
			hitmonchanInfo2.put(secondaryFormat[i], hitmonchanInfo1[i]);//107
			lickitungInfo2.put(secondaryFormat[i], lickitungInfo1[i]);	//108
			koffingInfo2.put(secondaryFormat[i], koffingInfo1[i]);		//109
			weezingInfo2.put(secondaryFormat[i], weezingInfo1[i]);		//110
			rhyhornInfo2.put(secondaryFormat[i], rhyhornInfo1[i]);		//111
			rhydonInfo2.put(secondaryFormat[i], rhydonInfo1[i]);		//112
			chanseyInfo2.put(secondaryFormat[i], chanseyInfo1[i]);		//113
			tangelaInfo2.put(secondaryFormat[i], tangelaInfo1[i]);		//114
			kangaskhanInfo2.put(secondaryFormat[i], kangaskhanInfo1[i]);//115
			horseaInfo2.put(secondaryFormat[i], horseaInfo1[i]);		//116
			seadraInfo2.put(secondaryFormat[i], seadraInfo1[i]);		//117
			goldeenInfo2.put(secondaryFormat[i], goldeenInfo1[i]);		//118
			seakingInfo2.put(secondaryFormat[i], seakingInfo1[i]);		//119
			staryuInfo2.put(secondaryFormat[i], staryuInfo1[i]);		//120
			starmieInfo2.put(secondaryFormat[i], starmieInfo1[i]);		//121
			mimeInfo2.put(secondaryFormat[i], mimeInfo1[i]);			//122
			scytherInfo2.put(secondaryFormat[i], scytherInfo1[i]);		//123
			jynxInfo2.put(secondaryFormat[i], jynxInfo1[i]);			//124
			electabuzzInfo2.put(secondaryFormat[i], electabuzzInfo1[i]);//125
			magmarInfo2.put(secondaryFormat[i], magmarInfo1[i]);		//126
			pinsirInfo2.put(secondaryFormat[i], pinsirInfo1[i]);		//127
			taurosInfo2.put(secondaryFormat[i], taurosInfo1[i]);		//128
			magikarpInfo2.put(secondaryFormat[i], magikarpInfo1[i]);	//129
			gyaradosInfo2.put(secondaryFormat[i], gyaradosInfo1[i]);	//130
			laprasInfo2.put(secondaryFormat[i], laprasInfo1[i]);		//131
			dittoInfo2.put(secondaryFormat[i], dittoInfo1[i]);			//132
			eeveeInfo2.put(secondaryFormat[i], eeveeInfo1[i]);			//133
			vaporeonInfo2.put(secondaryFormat[i], vaporeonInfo1[i]);	//134
			jolteonInfo2.put(secondaryFormat[i], jolteonInfo1[i]);		//135
			flareonInfo2.put(secondaryFormat[i], flareonInfo1[i]);		//136
			porygonInfo2.put(secondaryFormat[i], porygonInfo1[i]);		//137
			omanyteInfo2.put(secondaryFormat[i], omanyteInfo1[i]);		//138
			omastarInfo2.put(secondaryFormat[i], omastarInfo1[i]);		//139
			kabutoInfo2.put(secondaryFormat[i], kabutoInfo1[i]);		//140
			kabutopsInfo2.put(secondaryFormat[i], kabutopsInfo1[i]);	//141
			aerodactylInfo2.put(secondaryFormat[i], aerodactylInfo1[i]);//142
			snorlaxInfo2.put(secondaryFormat[i], snorlaxInfo1[i]);		//143
			articunoInfo2.put(secondaryFormat[i], articunoInfo1[i]);	//144
			zapdosInfo2.put(secondaryFormat[i], zapdosInfo1[i]);		//145
			moltresInfo2.put(secondaryFormat[i], moltresInfo1[i]);		//146
			dratiniInfo2.put(secondaryFormat[i], dratiniInfo1[i]);		//147
			dragonairInfo2.put(secondaryFormat[i], dragonairInfo1[i]);	//148
			dragoniteInfo2.put(secondaryFormat[i], dragoniteInfo1[i]);	//149
			mewtwoInfo2.put(secondaryFormat[i], mewtwoInfo1[i]);		//150
			mewInfo2.put(secondaryFormat[i], mewInfo1[i]);				//151
		}
		
		pokemon.put("Bulbasaur", bulbInfo2);
		pokemon.put("Ivysaur", ivyInfo2);
		pokemon.put("Venusaur", venuInfo2);
		pokemon.put("Charmander", charmanderInfo2);
		pokemon.put("Charmeleon", charmeleonInfo2);
		pokemon.put("Charizard", charizardInfo2);
		pokemon.put("Squirtle", squirtleInfo2);
		pokemon.put("Wartortle", wartortleInfo2);
		pokemon.put("Blastoise", blastoiseInfo2);
		pokemon.put("Caterpie", caterpieInfo2);
		pokemon.put("Metapod", metapodInfo2);
		pokemon.put("Butterfree", butterfreeInfo2);
		pokemon.put("Weedle", weedleInfo2);
		pokemon.put("Kakuna", kakunaInfo2);
		pokemon.put("Beedrill", beedrillInfo2);
		pokemon.put("Pidgey", pidgeyInfo2);
		pokemon.put("Pidgeotto", pidgeottoInfo2);
		pokemon.put("Pidgeot", pidgeotInfo2);
		pokemon.put("Rattata", rattataInfo2);
		pokemon.put("Raticate", raticateInfo2);
		pokemon.put("Spearow", spearowInfo2);
		pokemon.put("Fearow", fearowInfo2);
		pokemon.put("Ekans", ekansInfo2);
		pokemon.put("Arbok", arbokInfo2);
		pokemon.put("Pikachu", pikachuInfo2);
		pokemon.put("Raichu", raichuInfo2);
		pokemon.put("Sandshrew", sandshrewInfo2);
		pokemon.put("Sandslash", sandslashInfo2);
		pokemon.put("NidoranF", nidoranfInfo2);
		pokemon.put("Nidorina", nidorinaInfo2);
		pokemon.put("Nidoqueen", nidoqueenInfo2);
		pokemon.put("NidoranM", nidoranmInfo2);
		pokemon.put("Nidorino", nidorinoInfo2);
		pokemon.put("Nidoking", nidokingInfo2);
		pokemon.put("Clefairy", clefairyInfo2);
		pokemon.put("Clefable", clefableInfo2);
		pokemon.put("Vulpix", vulpixInfo2);
		pokemon.put("Ninetales", ninetalesInfo2);
		pokemon.put("Jigglypuff", jigglypuffInfo2);
		pokemon.put("Wigglytuff", wigglytuffInfo2);
		pokemon.put("Zubat", zubatInfo2);
		pokemon.put("Golbat", golbatInfo2);
		pokemon.put("Oddish", oddishInfo2);
		pokemon.put("Gloom", gloomInfo2);
		pokemon.put("Vileplume", vileplumeInfo2);
		pokemon.put("Paras", parasInfo2);
		pokemon.put("Parasect", parasectInfo2);
		pokemon.put("Venonat", venonatInfo2);
		pokemon.put("Venomoth", venomothInfo2);
		pokemon.put("Diglett", diglettInfo2);
		pokemon.put("Dugtrio", dugtrioInfo2);
		pokemon.put("Meowth", meowthInfo2);
		pokemon.put("Persian", persianInfo2);
		pokemon.put("Psyduck", psyduckInfo2);
		pokemon.put("Golduck", golduckInfo2);
		pokemon.put("Mankey", mankeyInfo2);
		pokemon.put("Primeape", primeapeInfo2);
		pokemon.put("Growlithe", growlitheInfo2);
		pokemon.put("Arcanine", arcanineInfo2);
		pokemon.put("Poliwag", poliwagInfo2);
		pokemon.put("Poliwhirl", poliwhirlInfo2);
		pokemon.put("Poliwrath", poliwrathInfo2);
		pokemon.put("Abra", abraInfo2);
		pokemon.put("Kadabra", kadabraInfo2);
		pokemon.put("Alakazam", alakazamInfo2);
		pokemon.put("Machop", machopInfo2);
		pokemon.put("Machoke", machokeInfo2);
		pokemon.put("Machamp", machampInfo2);
		pokemon.put("Bellsprout", bellsproutInfo2);
		pokemon.put("Weepinbell", weepinbellInfo2);
		pokemon.put("Victreebel", victreebelInfo2);
		pokemon.put("Tentacool", tentacoolInfo2);
		pokemon.put("Tentacruel", tentacruelInfo2);
		pokemon.put("Geodude", geodudeInfo2);
		pokemon.put("Graveler", gravelerInfo2);
		pokemon.put("Golem", golemInfo2);
		pokemon.put("Ponyta", ponytaInfo2);
		pokemon.put("Rapidash", rapidashInfo2);
		pokemon.put("Slowpoke", slowpokeInfo2);
		pokemon.put("Slowbro", slowbroInfo2);
		pokemon.put("Magnemite", magnemiteInfo2);
		pokemon.put("Magneton", magnetonInfo2);
		pokemon.put("Farfetch'd", farfetchInfo2);
		pokemon.put("Doduo", doduoInfo2);
		pokemon.put("Dodrio", dodrioInfo2);
		pokemon.put("Seel", seelInfo2);
		pokemon.put("Dewgong", dewgongInfo2);
		pokemon.put("Grimer", grimerInfo2);
		pokemon.put("Muk", mukInfo2);
		pokemon.put("Shellder", shellderInfo2);
		pokemon.put("Cloyster", cloysterInfo2);
		pokemon.put("Gastly", gastlyInfo2);
		pokemon.put("Haunter", haunterInfo2);
		pokemon.put("Gengar", gengarInfo2);
		pokemon.put("Onix", onixInfo2);
		pokemon.put("Drowzee", drowzeeInfo2);
		pokemon.put("Hypno", hypnoInfo2);
		pokemon.put("Krabby", krabbyInfo2);
		pokemon.put("Kingler", kinglerInfo2);
		pokemon.put("Voltorb", voltorbInfo2);
		pokemon.put("Electrode", electrodeInfo2);
		pokemon.put("Exeggcute", exeggcuteInfo2);
		pokemon.put("Exeggutor", exeggutorInfo2);
		pokemon.put("Cubone", cuboneInfo2);
		pokemon.put("Marowak", marowakInfo2);
		pokemon.put("Hitmonlee", hitmonleeInfo2);
		pokemon.put("Hitmonchan", hitmonchanInfo2);
		pokemon.put("Lickitung", lickitungInfo2);
		pokemon.put("Koffing", koffingInfo2);
		pokemon.put("Weezing", weezingInfo2);
		pokemon.put("Rhyhorn", rhyhornInfo2);
		pokemon.put("Rhydon", rhydonInfo2);
		pokemon.put("Chansey", chanseyInfo2);
		pokemon.put("Tangela", tangelaInfo2);
		pokemon.put("Kangaskhan", kangaskhanInfo2);
		pokemon.put("Horsea", horseaInfo2);
		pokemon.put("Seadra", seadraInfo2);
		pokemon.put("Goldeen", goldeenInfo2);
		pokemon.put("Seaking", seakingInfo2);
		pokemon.put("Staryu", staryuInfo2);
		pokemon.put("Starmie", starmieInfo2);
		pokemon.put("Mr. Mime", mimeInfo2);
		pokemon.put("Scyther", scytherInfo2);
		pokemon.put("Jynx", jynxInfo2);
		pokemon.put("Electabuzz", electabuzzInfo2);
		pokemon.put("Magmar", magmarInfo2);
		pokemon.put("Pinsir", pinsirInfo2);
		pokemon.put("Tauros", taurosInfo2);
		pokemon.put("Magikarp", magikarpInfo2);
		pokemon.put("Gyarados", gyaradosInfo2);
		pokemon.put("Lapras", laprasInfo2);
		pokemon.put("Ditto", dittoInfo2);
		pokemon.put("Eevee", eeveeInfo2);
		pokemon.put("Vaporeon", vaporeonInfo2);
		pokemon.put("Jolteon", jolteonInfo2);
		pokemon.put("Flareon", flareonInfo2);
		pokemon.put("Porygon", porygonInfo2);
		pokemon.put("Omanyte", omanyteInfo2);
		pokemon.put("Omastar", omastarInfo2);
		pokemon.put("Kabuto", kabutopsInfo2);
		pokemon.put("Kabutops", kabutopsInfo2);
		pokemon.put("Aerodactyl", aerodactylInfo2);
		pokemon.put("Snorlax", snorlaxInfo2);
		pokemon.put("Articuno", articunoInfo2);
		pokemon.put("Zapdos", zapdosInfo2);
		pokemon.put("Moltres", moltresInfo2);
		pokemon.put("Dratini", dratiniInfo2);
		pokemon.put("Dragonair", dragonairInfo2);
		pokemon.put("Dragonite", dragoniteInfo2);
		pokemon.put("Mewtwo", mewtwoInfo2);
		pokemon.put("Mew", mewInfo2);
	}
	
	/* MoveData Class:
	 * moves Format:
	 * 
	 * Dictionary<String, Object>
	 * "Growl" : new Object[] {"type", "category", int power, int accuracy}
	 * 
	 */
}
