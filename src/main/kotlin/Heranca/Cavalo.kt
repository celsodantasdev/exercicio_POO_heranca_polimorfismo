package Heranca;

class Cavalo(nome: String, tipo: String, cor: String, var olhosDoCavalo: String) : Animal(nome, tipo, cor) {

    override fun som() {
        println("iiirrrrĂ­")
    }

    fun correr() {
        println("correndo")
    }
}