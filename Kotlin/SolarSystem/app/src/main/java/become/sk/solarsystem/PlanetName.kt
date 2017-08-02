package become.sk.solarsystem

/**
 * Created by peterdruska on 02/08/2017.
 */

enum class PlanetName {
    MERCURY {
        override fun toString(): String {
            return "Mercury"
        }
    },
    VENUS {
        override fun toString(): String {
            return "Venus"
        }
    },
    EARTH {
        override fun toString(): String {
            return "Earth"
        }
    },
    MARS {
        override fun toString(): String {
            return "Mars"
        }
    },
    JUPITER {
        override fun toString(): String {
            return "Jupiter"
        }
    },
    SATURN {
        override fun toString(): String {
            return "Saturn"
        }
    },
    URAN {
        override fun toString(): String {
            return "Uran"
        }
    },
    NEPTUNE {
        override fun toString(): String {
            return "Neptune"
        }
    },
    PLUTO {
        override fun toString(): String {
            return "Pluto"
        }
    }
}
