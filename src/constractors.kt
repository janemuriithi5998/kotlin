class safaristudents(val jina:String, val miaka:Int, val jinsia:String){


}

fun main(args: Array<String>) {
    val myobj=safaristudents("Portia",12, "female")
    println("My name is ${myobj.jina}")
    println("I am  ${myobj.miaka} years")
    println("I am a  ${myobj.jinsia}")

    val myobj1=safaristudents("Philip",23, "male")
    println("My name is ${myobj.jina}")
    println("I am ${myobj.miaka} years")
    println("I am a ${myobj.jinsia}")

    val myobj2=safaristudents("Erick",34,"male")
    println("My name is ${myobj.jina}")
    println("I am  ${myobj.miaka} years")
    println("I am ${myobj.jinsia}")
}