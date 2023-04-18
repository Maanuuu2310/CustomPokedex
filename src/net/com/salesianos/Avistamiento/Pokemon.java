package net.com.salesianos.Avistamiento;

public class Pokemon {
    
    private String name;
    private String type;
    private Double height;
    private Double weight;
    private String descriptio
 
    public Pokemon() {
        
    }
    
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pokemon(String name, String type, Double height, Double weight, String description) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    // Setters

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object checkIfNull(Object stringToCheck) {
        return stringToCheck != null ? stringToCheck : "???";
    }

    @Override
    public String toString() {
        String output = "\n   " + this.name.toUpperCase();
        output += "\n   " + this.type.toUpperCase();
        output += "\n\n\tHT   " + checkIfNull(this.height).toString();
        output += "\n\tWT   " + checkIfNull(this.weight).toString() + "lb\n";
        output += "\n-------------------------------------------------\n\n";
        output += checkIfNull(this.description) + "\n";

        return output;
    }


}
