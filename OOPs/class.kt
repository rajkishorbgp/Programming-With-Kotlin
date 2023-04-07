class Raj{

    fun ready(){
        println("i am ready..");
    }
    fun study(){
        println("studying in college.");
    }
}

fun main(args: Array<String>) {
    val r1=Raj()
    r1.ready()
    System.out.println("Java.. ");
    println("Raj Kishor")
    r1.study()
}

/*
    Output:
    i am ready..
    Java..
    Raj Kishor
    studying in college.
*/