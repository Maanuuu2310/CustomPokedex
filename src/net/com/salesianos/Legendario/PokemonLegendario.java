package net.com.salesianos.Legendario;

import net.com.salesianos.Avistamiento.Pokemon;

public class PokemonLegendario extends Pkemon {

    private String location;

    public PokemonLegendario(String nam, String type, String location) {
        super(name, type);
        this.location = location;
    }

    public PokemonLegendario(String name, String type, Double height, Double weight, String description, String location) {
        super(name, type, height, weight, description);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        String output = "\n ---------- POKEMON LEGENDARIO ---------- \n";
        output += super.toString();
        output += "\n------------------------------------------------- \n";
        output += "LOCATION: " + this.location + "\n";
        return output;
    }

    

    
    
}
