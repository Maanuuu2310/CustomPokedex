import java.util.Scann;

import net.com.salesianos.Avistamiento.Pokemon;
import net.com.salesianos.Legendario.PokemonLegendario;
import net.com.salesianos.Lista.ListaPokemon; 

public class App {

    private static ListaPokemon foundPokemons = new ListaPokemon();
    private static ListaPokemon ownedPokemons = new ListaPokemon();

    private static Scanner textInput = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {

        Boolean notClosed = true;

        while (notClosed) {

        
        System.out.println("\nBienvenida/o a la Pokedex, creada por Adrisoft y asociados.");
        System.out.println("Por favor, selecciona una de las siguientes opciones: ");

        System.out.println("\n a) Añadir un pokemon avistado.");
        System.out.println("\n b) Añadir un pokemon legendario avistado.");
        System.out.println("\n c) Pasar de avistado a capturado.");
        System.out.println("\n d) Mostrar lista de avistados.");
        System.out.println("\n e) Mostrar lista de capturados.");
        System.out.println("\n f) Salir.");

        System.out.print("\n\n Tu selección: ");

        char[] result = textInput.nextLine().toCharArray();

        System.out.println("\n");
            
        notClosed = optionManager(result[0]);

        }

    }

    private static boolean optionManager(Character option) {
        switch(option) {
            case 'a':
                
                System.out.print("\n- Dime el nombre del pokemon avistado: ");
                String pokeName = textInput.nextLine();  
                System.out.print("\n- Dime el tipo de pokemon que era: ");
                String pokeType = textInput.nextLine();
                System.out.println(" ");

                foundPokemons.addPokemon(new Pokemon(pokeName, pokeType));

                return true;
            case 'b':
                
                System.out.println("WOW ¿Has encontrado un pokemon legendario?");
                System.out.print("Dime el nombre de ese pokemon para registrarlo: ");
                String legenPokeName = textInput.nextLine();
                System.out.print("Dime su tipo: ");
                String legenPokeType = textInput.nextLine();
                System.out.print("¿Donde lo encontraste?: ");
                String legenPokeLocation = textInput.nextLine();

                foundPokemons.addPokemon(new PokemonLegendario(legenPokeName, legenPokeType, legenPokeLocation));

                return true;
            case 'c':

                System.out.println("Escribe el nombre del pokémon que quieres cambiar de avistado a capturado: ");
                String pokeCaptured = textInput.nextLine();
                System.out.println("\n");
                Pokemon pokemonCaptured = foundPokemons.deletePokemon(pokeCaptured);
                
                if (pokeCaptured != null) {
                    ownedPokemons.addPokemon(pokemonCaptured);
                    System.out.println("\n - Se ha cambiado correctamente -");
                } 

                return true;
            case 'd':
                foundPokemons.showLista();
                return true;
            case 'e':
                ownedPokemons.showLista();
                return true;
            case 'f':
                System.out.println("Saliendo...");
                return false;
            default:
                System.out.println("ERROR: OPCIÓN INCORRECTA, SALIENDO...");
                return false;
        }
    }

}
