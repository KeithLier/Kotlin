import java.time.Instant

/**
 * Created by keith on 2017/7/11.
 */

fun main(args: Array<String>) {

//    println("Hello Kotlin!")
//
//    for (i in 1..10)
//        println(i)
//
//    println("\n----------------------------")
//
//    for (i in 1..10 step 2)
//        println(i)
//
//    println("\n----------------------------")
//
//    for (i in 10 downTo 1 step 3)
//        print(i)
//
//    println("\n----------------------------")
//
//    for (i in 1 until 10)
//        print(i)
//
//    println("\n----------------------------")
//
//
//    var a : Int = 10000
//    println( a === a )
//
//    var boxedA : Int? = a
//    var boxedB : Int? = a
//
//    println(boxedA == boxedB)
//
//    println(boxedA === boxedB)

    val arr = arrayOf(1,2,3,4)

    for (item in arr) {
        println(item)
    }

    val b = Array(4, { i -> (i * 2) })

    println(arr[0])
    println(b[1])


    val x = 5
    when(x) {
        in 1..10 -> println("x is in the range")
        else -> println("")
    }


    var person : Person = Person()

    person.lastName = "Keith"
    person.no = 9

    println(person.lastName + person.no)
}
