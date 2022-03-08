package Heranca;

class Cachorro(nome: String, tipo: String, cor: String, var olhosDoCachorro: String) : Animal(nome, tipo, cor) {


    override fun som() {
        println("rowwftt")
    }

    fun latir() {
        println("correndo")

    }
}
