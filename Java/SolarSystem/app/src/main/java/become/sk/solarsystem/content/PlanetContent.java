package become.sk.solarsystem.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Source: https://sk.wikipedia.org/wiki/Slnečná_sústava
 */
public class PlanetContent {

    /**
     * An array of Planet items.
     */
    public static final List<Planet> ITEMS = new ArrayList<Planet>();

    /**
     * A map of Planet items, by ID.
     */
    public static final Map<String, Planet> ITEM_MAP = new HashMap<String, Planet>();

    static {
        // Add some sample items.
        for (int i = 0; i < PlanetName.values().length; i++) {
            addItem(createPlanet(i));
        }
    }

    private static void addItem(Planet item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        Planet planet = ITEMS.get(position);
        builder.append("Details about ").append(planet.name);
        builder.append(planet.distanceFromSun).append(" AU");
        return builder.toString();
    }

    private static Planet createPlanet(int position) {
        PlanetName name = PlanetName.EARTH;
        Double distanceFromSun = 0.0;
        Double inhabitants = 0.0;
        switch (position) {
            case 1:
                name = PlanetName.MERCURY;
                distanceFromSun = 1.0;
                inhabitants = 0.0;
            case 2:
                name = PlanetName.VENUS;
                distanceFromSun = 2.0;
                inhabitants = 0.0;
            case 3:
                name = PlanetName.EARTH;
                distanceFromSun = 3.0;
                inhabitants = 7.442; // in year of 2016
            case 4:
                name = PlanetName.MARS;
                distanceFromSun = 4.0;
                inhabitants = 0.0;
            case 5:
                name = PlanetName.JUPITER;
                distanceFromSun = 5.0;
                inhabitants = 0.0;
            case 6:
                name = PlanetName.SATURN;
                distanceFromSun = 6.0;
                inhabitants = 0.0;
            case 7:
                name = PlanetName.URAN;
                distanceFromSun = 7.0;
                inhabitants = 0.0;
            case 8:
                name = PlanetName.NEPTUNE;
                distanceFromSun = 8.0;
                inhabitants = 0.0;
            case 9:
                name = PlanetName.PLUTO;
                distanceFromSun = 9.0;
                inhabitants = 0.0;
            default:
                name = PlanetName.SUN;
                distanceFromSun = 0.0;
                inhabitants = 0.0;
        }

        return new Planet(String.valueOf(position), name.toString(), distanceFromSun, inhabitants);
    }

    public enum PlanetName {
        SUN {
            public String toString() {
                return "Sun";
            }
        },
        MERCURY {
            public String toString() {
                return "Mercury";
            }
        },
        VENUS {
            public String toString() {
                return "Venus";
            }
        },
        EARTH {
            public String toString() {
                return "Earth";
            }
        },
        MARS {
            public String toString() {
                return "Mars";
            }
        },
        JUPITER {
            public String toString() {
                return "Jupiter";
            }
        },
        SATURN {
            public String toString() {
                return "Saturn";
            }
        },
        URAN {
            public String toString() {
                return "Uran";
            }
        },
        NEPTUNE {
            public String toString() {
                return "Neptune";
            }
        },
        PLUTO {
            public String toString() {
                return "Pluto";
            }
        }
    }

    public static class Planet {
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
            String planetDescription = "[" + name + " with " + inhabitants +" inhabitants]";
            return planetDescription;
        }
    }
}
