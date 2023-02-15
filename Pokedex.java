//package ED1302;

import java.util.HashMap;

public class Pokedex {
	private HashMap<String, Pokemon> hPokemons;

	public Pokedex() {
		Pokemon bulbasaur = new Pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
		Pokemon charmander = new Pokemon("Charmander",4,"Es un Charmander","Fuego");
		Pokemon squirtle = new Pokemon ("Squirtle",7, "Es un Squirtle","Agua");
		this.hPokemons = new HashMap<String, Pokemon>();
		this.hPokemons.put(bulbasaur.getNombre(),bulbasaur);
		this.hPokemons.put(charmander.getNombre(),charmander);
		this.hPokemons.put(squirtle.getNombre(),squirtle);
	}
	public HashMap<String, Pokemon> gethPokemons() {
		return this.hPokemons;
	}
	public void sethPokemons(HashMap<String, Pokemon> hPokemons) {
		this.hPokemons = hPokemons;
	}
	public void aniadirhPokemon(Pokemon p) {
		this.hPokemons.put(p.getNombre(),p);
	}
	public void borrarhPokemon(Pokemon p) {
		this.hPokemons.remove(p.getNombre());
	}
	public Pokemon consultarhPokemon(String nombre) {
		return this.hPokemons.get(nombre);
	}

	@Override
	public String toString() {
		return this.hPokemons.toString();
	}
}
