/*
    @Data type in kotlin
*/

fun main() {
    println("Hello World")

    var name = "Raj Kishor"

    println("Hi, $name")
    print(name)
    name="raj"
    println(name);

    val name1="raj";
    // name1="rajkishor"    //   ->  error: val cannot be reassigned
    println(name1);

    var str : String
    str="raja"
    println(str)

    var myInteger : Int
    myInteger=100000
    println(myInteger)

    var myByte : Byte
    myByte = 127
    println(myByte)

    var myShort : Short
    myShort = 100
    println(myShort);

    var myLong : Long

    myLong = 7739249804L
    println(myLong);

    /*
        Flooting Types
        
        1. Floot  Holds 32 Bits
        2. Double Holds 32 Bits
    */

    val myFloat : Float
    myFloat = 3122.143467F
    println(myFloat)

    val myDouble : Double
    myDouble = 129873.34898966699
    println(myDouble)

    val myChar : Char
    myChar='A'
    println("char: $myChar");

    val wannaCoffe : Boolean
    wannaCoffe = false
    println("wanna Coffe ?: $wannaCoffe")

}

/*  
    Output:
    Hello World
    Hi, Raj Kishor
    Raj Kishorraj
    raj
    raja
    100000
    127
    Hi, Raj Kishor
    Raj Kishorraj
    raj
    raja
    100000
    127
    1007739249804
    3122.1436
    129873.34898966699
    char: A
    wanna Coffe ?: false

*/