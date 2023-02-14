import java.util.ArrayList;

public class Ruta {
  private String nombreRuta;
  private ArrayPokemon pokes;

  public Ruta (String nombreRuta, ArrayPokemon pokes){
    this.nombreRuta = nombreRuta;
    this.pokes = pokes;
  }
  public String getNombreRuta(){
    return this.nombreRuta;
  }
  public void setNombreRuta(String nombreRuta){
    this.nombreRuta = nombreRuta;
  }
  public ArrayPokemon getPokes(){
    return this.pokes;
  }
  public void setPokes(ArrayPokemon pokes){
    this.pokes = pokes;
  }
  @Override
  public String toString() {
		return "\nEn la ruta: " + this.nombreRuta + " podemos encontrar los siguientes Pokemons: " + this.pokes;
	}

}
