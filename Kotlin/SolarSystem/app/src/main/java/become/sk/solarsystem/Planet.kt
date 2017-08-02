package become.sk.solarsystem

/**
 * Created by peterdruska on 02/08/2017.
 */

class Planet(val id: String,
             val name: String,
             val distanceFromSun: Double?, // in AU
             val inhabitants: Double? // in bilions
) {

    override fun toString(): String {
        val planetDescription = "$name has $inhabitants billions of inhabitants."
        return planetDescription
    }
}