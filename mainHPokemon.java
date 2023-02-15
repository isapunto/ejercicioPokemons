public class mainHPokemon {
	//	Ejercicio 3.
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon pikachu = new Pokemon("Pikachu",25,"Es un Pikachu","Electrico");

		System.out.println("Mostrar los Pokemons hardcodeados de la Pokedex: ");
		System.out.println(pokedex);
		System.out.println("Mostrar informacion completa de Charmander: ");
		System.out.println(pokedex.consultarhPokemon("Charmander"));
		System.out.println("Aniadimos a Pikachu y mostramos la pokedex: ");
		pokedex.aniadirhPokemon(pikachu);
		System.out.println(pokedex);
	}

}
