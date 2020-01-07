fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials.last())
    println(imperials.contains("Luke"))

    val rebels = arrayListOf("Leia", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehicleMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehicleMap["Solo"])
    println(rebelVehicleMap.get("Solo"))
    println(rebelVehicleMap.getOrDefault("Leia", "This ship doesn't exist"))
    println(rebelVehicleMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon",
        "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leia", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())

}