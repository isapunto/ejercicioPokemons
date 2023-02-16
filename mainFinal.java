import java.util.Scanner;
import java.util.ArrayList;

public class mainFinal {
	//	Ejercicio 4.
	public static void main(String[] args) {
    //cambiar de ruta.
    Scanner sc = new Scanner(System.in);
    String entrenador;
		ArrayList<Ruta> arrayDeRutas = new ArrayList<Ruta>();
		int numeroRuta;
		Ruta rutaElegida;
		int eleccion;
		boolean salir = false;
		Pokemon pokeSalvaje, pokeHuido;
		int huirOCapt;

		//Creamos los pokemons
		Pokemon bulbasaur = new Pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
		Pokemon ivysaur = new Pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
		Pokemon venusaur = new Pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
		Pokemon charmander = new Pokemon("Charmander",4,"Es un Charmander","Fuego");
		Pokemon charmeleon = new Pokemon ("Charmeleon",5, "Es un Charmeleon","Fuego");
		Pokemon charizard = new Pokemon ("Charizard",6, "Es un Charizard","Fuego y Volador");
		Pokemon squirtle = new Pokemon ("Squirtle",7, "Es un Squirtle","Agua");
		Pokemon pikachu = new Pokemon("Pikachu",25,"Es un Pikachu","Electrico");
		// Creamos las rutas
		ArrayPokemon arrayRutaUno= new ArrayPokemon();
		arrayRutaUno.aniadirPokemon(bulbasaur);
		arrayRutaUno.aniadirPokemon(charmander);
		arrayRutaUno.aniadirPokemon(squirtle);
		Ruta rutaInicial = new Ruta ("Ruta Inicial",arrayRutaUno);
		//System.out.println(rutaInicial);
		ArrayPokemon arrayRutaDos= new ArrayPokemon();
		arrayRutaDos.aniadirPokemon(charmander);
		arrayRutaDos.aniadirPokemon(charmeleon);
		arrayRutaDos.aniadirPokemon(charizard);
		Ruta rutaFuego = new Ruta ("Ruta Fuego",arrayRutaDos);
		//System.out.println(rutaFuego);
		ArrayPokemon arrayRutaTres= new ArrayPokemon();
		arrayRutaTres.aniadirPokemon(bulbasaur);
		arrayRutaTres.aniadirPokemon(ivysaur);
		arrayRutaTres.aniadirPokemon(venusaur);
		Ruta rutaPlanta = new Ruta ("Ruta Planta",arrayRutaTres);
		//System.out.println(rutaPlanta);
		arrayDeRutas.add(rutaInicial);
		arrayDeRutas.add(rutaFuego);
		arrayDeRutas.add(rutaPlanta);

    Pokedex pokedex = new Pokedex();
		//System.out.println("Nuestra Pokedex:\n " + pokedex);

		System.out.println("Empieza el juego!");
		System.out.println("Bienvenido entrenador! Indica tu nombre: ");
		entrenador = sc.nextLine();
		System.out.println(	"Elige una ruta:\n" +
												"1. Ruta Inicial \n" +
												"2. Ruta Fuego \n" +
												"3. Ruta Planta \n" +
												"(Presiona 1, 2 o 3)");
    numeroRuta = Integer.parseInt(sc.nextLine());
		rutaElegida = arrayDeRutas.get(numeroRuta - 1);
		System.out.println("La ruta elegida es: " + rutaElegida);

		while (!salir){
			System.out.println(	"Elige:\n" +
													"0. Cambiar de ruta \n" +
													"1. Consultar Pokedex \n" +
													"2. Capturar Pokemon \n" +
													"3. Salir \n" +
													"(Presiona 1, 2 o 3)");
			eleccion = Integer.parseInt(sc.nextLine());
			if(eleccion==0){
				System.out.println(	"Elige una ruta:\n" +
														"1. Ruta Inicial \n" +
														"2. Ruta Fuego \n" +
														"3. Ruta Planta \n" +
														"(Presiona 1, 2 o 3)");
		    numeroRuta = Integer.parseInt(sc.nextLine());
				rutaElegida = arrayDeRutas.get(numeroRuta - 1);
				System.out.println("La ruta elegida es: " + rutaElegida);
			}else if(eleccion==1){
				System.out.println(pokedex);
			}else if (eleccion==2) {
				System.out.println("Pokemon salvaje aparecio! Es un: ");
				// Guardamos en numAleatorio el resultado de generar un número aleatorio
				// [Math.random] entre dos valores y transformarlo a int [(int)Math.round]
				// El número mayor tiene que ser igual al número de Pokemons que hay en
				// la ruta. La ruta contiene un ArrayPokemon [lo conseguimos con getPokes],
				// cuyo tamaño es el del ArrayList que contiene.
				// Para saber el tamaño de ese primer ArrayList, usamos el método
				// [sizePokes] de la clase ArrayPokemon.
				int numAleatorio = (int)Math.round(Math.random()*(rutaElegida.getPokes().sizePokes()-1)+0);
				pokeSalvaje = rutaElegida.getPokes().consultarPokemon(numAleatorio);
				System.out.println(pokeSalvaje);
				System.out.println(	"Elige una opcion:\n" +
														"1. Huir \n" +
														"2. Capturar \n" +
														"(Presiona 1 o 2)");
		    huirOCapt = Integer.parseInt(sc.nextLine());
				if(huirOCapt==1){
					System.out.println("Huimos!!!");
					pokeHuido = new Pokemon(pokeSalvaje.getNombre(), pokeSalvaje.getId(), "", pokeSalvaje.getTipo());
					pokedex.aniadirhPokemon(pokeHuido);
				}else if (huirOCapt==2) {
					System.out.println("Capturado!!!");
					pokedex.aniadirhPokemon(pokeSalvaje);
				}else{
					System.out.println("Valor invalido -> presiona 1 o 2:");
				}
			}else if (eleccion==3){
				System.out.println("Adios");
				salir = true;
			}else{
				System.out.println("Valor invalido -> presiona 1, 2 o 3:");
			}
		}

	}

}
