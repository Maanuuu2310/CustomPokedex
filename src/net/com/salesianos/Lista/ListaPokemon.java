package net.com.salesianos.Lista;

import net.com.salesianos.Avistamiento.Pokemon;

public class ListaPokemon {
    
    private Pokemon[] lista; 
    private int size; 

    public ListaPokemon() {
        lista = new Pokemon[1];  
        size = 0; 
    }

    public void addPokemon(Pokemon pokemon) {
        if (size == lista.length) { 
            Pokemon[] nuevaLista = new Pokemon[2 * lista.length]; 
            for (int i = 0; i < size; i++) {
                nuevaLista[i] = lista[i]; 
            }
            lista = nuevaLista; 
        }
        lista[size] = pokemon; 
        size++; 
        System.out.println("Se ha agregado el pokemon " + pokemon.getName() + " correctamente.");
    }

    public Pokemon deletePokemon(String nombre) {
        int index = seekPokemon(nombre);
        if (index == -1) { 
            System.out.println("No se ha encontrado el pokemon " + nombre + ".");
            return null;
        } else {
            Pokemon deletedPokemon = getPokemon(index);
            for (int i = index; i < size-1; i++) {
                lista[i] = lista[i+1]; 
            }
            lista[size-1] = null; 
            size--; 
            System.out.println("Se ha eliminado el pokemon " + nombre + " correctamente.");
            return deletedPokemon;
        }
    }

    public void showLista() {
        if (size == 0) { 
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de pokemons:");
            for (int i = 0; i < size; i++) {
                System.out.println(lista[i].toString()); 
            }
        }
    }

    public Pokemon getPokemon(int posicion) {
        if (posicion < 0 || posicion >= size) { 
            System.out.println("La posición indicada no existe.");
            return null;
        } else {
            return lista[posicion];
        }
    }

    private int seekPokemon(String nombre) {
        for (int i = 0; i < size; i++) {
            if (lista[i].getName().equalsIgnoreCase(nombre)) { 
                return i; 
            }
        }
        return -1; 
    }

}
