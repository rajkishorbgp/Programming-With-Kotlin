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


} 

/*  
    Output:

    Hello World
    Hi, Raj Kishor
    Raj Kishorraj
    raj

*/