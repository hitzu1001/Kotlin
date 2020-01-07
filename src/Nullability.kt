fun main(args: Array<String>) {

    var name: String = "Rusty"
//    name = null

    var nullableName: String? = "Do I really exist?"
    println(nullableName)
//    println(nullableName.length)

    nullableName = null

    //Null Check
    var  length = 0
    if(nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val length2 = if(nullableName != null) nullableName.length else -1
    println(length2)

    //Second method: Safe Call Operator ?
    println(nullableName?.length)

    //Third method: Elvis Operator
    val length3 = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me..."
    println(noName)

    //!!: crash the app with a NullPointerException
    println(nullableName!!.length)

}