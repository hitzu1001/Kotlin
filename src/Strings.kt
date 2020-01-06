fun main(args: Array<String>) {
    val str = "May the force be with you."
    //\: escape, \n: new line, \t: tab, \b: back space
    //\r: carriage return
    println(str)

//    val rawCrawl = """A long time ago,
//        in a galaxy
//        far, far, away...
//        BUMM BUMM BUMMMM""".trimMargin()
//    println(rawCrawl)
//
//    val adjustedRawCrawl = """|A long time ago,
//        |in a galaxy
//        |far, far, away...
//        |BUMM BUMM BUMMMM""".trimMargin()
//    println(adjustedRawCrawl)
//
//    val prefixRawCrawl = """>A long time ago,
//        >in a galaxy
//        >far, far, away...
//        >BUMM BUMM BUMMMM""".trimMargin(marginPrefix = ">")
//    println(prefixRawCrawl)
//
//    for(char in str) {
//        println(char)
//    }
    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    val num = 6
    val stringNum = num.toString()

    //num is Int

    val subSequence = str.subSequence(4, 13) //substring
    println(subSequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle.")
    println("Luke's full name $luke has ${luke.length} characters.")

}
