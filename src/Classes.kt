//class Car(val brand: String, val model: String, val color: String) {
//
//    fun accelerate() {
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $brand $model.")
//    }
//}
//
//class Truck(val brand: String, val model: String, val towingCapacity: Int) {
//
//    fun tow() {
//        println("taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("This $brand $model has a towing capacity of $towingCapacity lbs.")
//    }
//}

open class Vehicle(val brand: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(brand: String, model: String, val color: String): Vehicle(brand, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
        super.accelerate()
    }
}

class Truck(brand: String, model: String, val towingCapacity: Int): Vehicle(brand, model) {
    fun tow() {
        println("headed out to the mountains!")
    }
}

class SUV(brand: String, model: String, val color: String): Vehicle(brand, model)

//fun main(args: Array<String>) {
//
//    val tesla = Car("Tesla", "ModelS", "Red")
//    tesla.accelerate()
//
//    val ford = Truck("Ford", "F-150", 10000)
//
////    val car = Car("Toyota", "Avalon", "Red")
////    println(car.brand)
////    println(car.model)
////    car.accelerate()
////    car.details()
////
////    val truck = Truck("Ford", "F-150", 10000)
////    truck.tow()
////    truck.details()
//}

open class Champion(val name: String, var nation: String, val health: Int) {
    fun attack() {
        println("Fight!")
    }

    fun defend() {
        println("Defend!")
    }

    fun walk() {
        println("...")
    }
}

class marksman(name: String, nation: String, health: Int, val attackSpeed: Double): Champion(name, nation, health) {
    fun flash() {
        println("Flash!")
    }
}

class catcher(name: String, nation: String, health: Int, val crowdControl: Int): Champion(name, nation, health) {
    fun exhaust() {
        println("Exhaust...")
    }
}

fun main(args: Array<String>) {
    val Caitlyn = marksman("Caitlyn", "Piltover", 481, 0.625)
    val Zyra = catcher("Zyra", "Thorns", 504, 2)

    Caitlyn.attack()
    Caitlyn.flash()
    Zyra.walk()
    Zyra.exhaust()
}
