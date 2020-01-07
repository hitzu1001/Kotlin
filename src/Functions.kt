fun main(args: Array<String>) {

    //no arg and no return
    fun forceChoke() {
        println("You have failed me for the last time Admiral...")
    }
    forceChoke()

    //one arg and no return
    fun makeAnEntrance(line: String) {
        println(line)
    }
    makeAnEntrance("I find your lack of faith disturbing.")

    //multiple args and return Int
    fun addition(rebels: Int, ewoks: Int): Int {
        return rebels + ewoks
    }
    val rebels = addition(5, 7)
    println("Darth Vader faced off against $rebels rebel scum.")
    println("Darth Vader faced off against ${addition(5, 7)} rebel scum.")

    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }
    vaderIsFeeling()
    vaderIsFeeling("meh")


    val lukeReturns: String = "I am back!"
    makeAnEntrance(lukeReturns)
}
