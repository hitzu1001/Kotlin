fun main(args: Array<String>) {

    val printMessage = { message: String -> println(message) }

//    fun printMessage(message: String) {
//        println(message)
//    }

    printMessage("Hello World!")

    //method 1
    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))
    //method 2
    val sumB: (Int, Int) -> Int = {x, y -> x + y}

    fun downloadData(url: String, completion: () -> Unit) {
        //sent a download request
        //got back data
        //there is no network error
        completion()
    }
    //call downloadData
    downloadData("fakeUrl.com", {
        println("The code in this block will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //sent a download request
        //got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com") { car ->
        println("Brand: ${car.brand} \nModel: ${car.model} \nColor: ${car.color}")
    }
    //use it
    downloadCarData("fakeUrl.com") {
        println("Brand: ${it.brand} \nModel: ${it.model} \nColor: ${it.color}")
    }


//    fun completion(truck: Truck?, success: Boolean) {
//        if(success) {
//            //do something with the truck
//            truck?.tow()
//        } else {
//            //handle the web request failure
//            println("Something went wrong")
//        }
//    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //make the web request
        //get the results back
        val webRequestSuccess = false
        if(webRequestSuccess) {
            //received truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if(success) {
            //do something with the truck
            truck?.tow()
        } else {
            //handle the web request failure
            println("Something went wrong")
        }

    }
}