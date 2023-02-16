//package ED1302;

public class mainPokemon {
//	Ejercicio 1 y 2.
	public static void main(String[] args) {
		Pokemon bulbasaur = new Pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
		Pokemon ivysaur = new Pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
		Pokemon venusaur = new Pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
		Pokemon charmander = new Pokemon("Charmander",4,"Es un Charmander","Fuego");
		Pokemon charmeleon = new Pokemon ("Charmeleon",5, "Es un Charmeleon","Fuego");
		Pokemon charizard = new Pokemon ("Charizard",6, "Es un Charizard","Fuego y Volador");
		ArrayPokemon arra= new ArrayPokemon();
		arra.aniadirPokemon(bulbasaur);
		arra.aniadirPokemon(ivysaur);
		arra.aniadirPokemon(venusaur);
		arra.aniadirPokemon(charmander);
		arra.aniadirPokemon(charmeleon);
		//arra.aniadirPokemon(charizard);
		System.out.println("Mostrar todos los Pokemons: ");
		System.out.println(arra);
		System.out.println("Mostrar informacion completa de Venusaur: ");
		System.out.println(arra.consultarPokemon(2));
		System.out.println("Mostrar tipo de Charmeleon: ");
		System.out.println(arra.consultarTipo(4));
		System.out.println("Creamos la primera ruta y la mostramos:");
		Ruta ruta1 = new Ruta("Ruta Uno",arra);
		System.out.println(ruta1);
		System.out.println("Añadimos el Pokemon Charizard a la Ruta Uno: ");
		// En vez del array arra -> arra.aniadirPokemon(charizard);
		// Tenemos el array pokes que está dentro de ruta1 ->
		ruta1.getPokes().aniadirPokemon(charizard);
		System.out.println(ruta1);
		System.out.println("Creamos una segunda ruta y la mostramos: ");
		ArrayPokemon arra2 = new ArrayPokemon();
		arra2.aniadirPokemon(bulbasaur);
		arra2.aniadirPokemon(ivysaur);
		Ruta ruta2 = new Ruta ("Ruta Dos", arra2);
		System.out.println(ruta2);


	}

}
