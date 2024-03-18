fun main(args: Array<String>) {
    var myarr= arrayOf("Portia","Jane", true, 59, 78,87, 'e')
    myarr[0]="John"
    println("My name is  ${myarr[0]}")
    var myintarr= arrayOf<Int>(12,56,0,3,-1)

    println(myintarr.sorted())

}