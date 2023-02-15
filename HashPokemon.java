//package ED1302;

import java.util.HashMap;

public class HashPokemon {
	private HashMap<String, Pokemon> hPokemons;

	public HashPokemon() {
		this.hPokemons = new HashMaps<String, Pokemon>();
	}
	public HashMaps<String, Pokemon> getHPokemons() {
		return this.hPokemons;
	}
	public void setHPokemons(HashMap<String, Pokemon> hPokemons) {
		this.hPokemons = hPokemons;
	}
	public void aniadirhPokemon(Pokemon p) {
		this.hPokemons.put(p.getNombre(),p.getDescripcion());
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
