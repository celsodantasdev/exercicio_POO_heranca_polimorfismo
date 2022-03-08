package Heranca;

class Preguica(nome: String, tipo: String, cor: String, var olhosDaPreguica: String) : Animal(nome, tipo, cor) {

    override fun som() {
        println("*som de bocejo*")

    }
    fun dormir(){
        println("a mimir")
    }

}