package become.sk.solarsystem;

/**
 * Created by peterdruska on 02/08/2017.
 */

public class Planet {
    public final String id;
    public final String name;
    public final Double distanceFromSun; // in AU
    public final Double inhabitants; // in bilions

    public Planet(String id, String name, Double distanceFromSun, Double inhabitants) {
        this.id = id;
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        String planetDescription = name + " has " + inhabitants +" billions of inhabitants.";
        return planetDescription;
    }
}