class Mobil4(val mesin: Int, val roda: Int, val body: Int) {

    init {
        println("Mesin: $mesin, Roda: $roda, Body: $body")
    }

    fun maju(){
        println("maju...")
    }

    fun mundur(){
        println("mundur...")
    }

    fun belok(){
        println("belok...")
    }

    fun cetakMesin(){
        println("Mesin mobil: ${this.mesin}")
    }

}

fun main(args: Array<String>) {
    var mobilku = Mobil4(2,1,3)

}
