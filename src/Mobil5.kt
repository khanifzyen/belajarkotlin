class Mobil5(val mesin: Int){
    constructor(roda:Int,body: Int):this(1){
        println("dicetak dari secondary constructor")
        println("Mesin: ${this.mesin}, Roda: $roda, Body: $body")
    }
}

fun main(args: Array<String>) {
    var mobilku = Mobil5(4,1)
}