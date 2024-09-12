fun main() {
    // Conversions
    val poundToKg = 0.453592
    val mileToKm = 1.60934
    val fahrenheitToCelsius = { f: Double -> (f - 32) * 5 / 9 }

    // Variables
    val weightInPounds = 300.0
    val weightInKilograms = weightInPounds * poundToKg

    val lengthInMiles = 21.0
    val lengthInKilometers = lengthInMiles * mileToKm

    val tempInFahrenheit = 9900.0
    val tempInCelsius = fahrenheitToCelsius(tempInFahrenheit)

    // Display results
    println("Weight in Pounds (lbs): $weightInPounds")
    println("Weight converted to Kilograms (kg): %.2f".format(weightInKilograms))
    println("===============================")
    println("Length in Miles (mi): $lengthInMiles")
    println("Length in Kilometers (km): %.2f".format(lengthInKilometers))
    println("===============================")
    println("Temperature in Fahrenheit (°F): $tempInFahrenheit")
    println("Temperature in Celsius (°C): %.2f".format(tempInCelsius))
    println("===============================")

    // Student ages
    val studentAges = listOf(17, 21, 16, 10, 18, 21, 23, 13, 25, 19)
    val averageAge = studentAges.average()

    // Display student ages and average
    for ((index, age) in studentAges.withIndex()) {
        println("Age of Student ${index + 1}: $age")
    }
    println("The average age of the students is: %.1f".format(averageAge))
    println("===============================")

    //Story
    val demonKing = "~Lazarro the Dream Weaver~"
    val heroWeapon = "<The Compass of Lost Realms>"
    val demonArmor = "<Veil of Forgotten Memories>"
    val demonSkill = "<Song of Eternal Slumber>"
    val ultimateSkill = "<The Mirage of Infinity>"

    val story = """
        In the mystical land of Zephyros, the demon king $demonKing reigned over the realm of dreams. His kingdom was not of fire or destruction, 
        but of endless sleep, where time had no meaning, and memories faded like whispers in the wind.

        The people of Zephyros lived in fear, for once they drifted into slumber, they would be trapped in his domain, never to wake again. 
        The heroes of the land, led by the brave and curious Arlo, embarked on a perilous journey to stop the Dream Weaver. Armed with $heroWeapon,
        they ventured into the Maze of Forgotten Memories, where the demon king hid, guarded by the impenetrable $demonArmor.
        
        As they traveled deeper, the air grew heavy with the weight of forgotten dreams. Suddenly, the demon king appeared, his eyes glowing 
        with ancient power. With a haunting melody, he invoked his dreaded $demonSkill, casting the heroes into a deep sleep. One by one, 
        they fell, trapped in nightmares of their own making.
        
        But Arlo, guided by $heroWeapon, resisted the spell and confronted the demon king. The final battle began. As the Dream Weaver prepared 
        his final move, $ultimateSkill, which would plunge the entire world into an endless illusion, Arlo knew that only the light of truth 
        could shatter the mirage and bring an end to $demonKing's reign.
    """.trimIndent()

    println(story)
}