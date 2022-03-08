import Heranca.Animal
import Heranca.Cachorro
import Heranca.Cavalo
import Heranca.Preguica

fun main() {

/*

1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
(observe a tabela), utilize os seus conhecimentos e distribua as características de forma que
tudo o que for comum a todos os animais fique na classe Animal


2- Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior
e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
*/

    var cachorro = Cachorro("tutu","salsicha", "caramelo", "pretos")

    cachorro.som()

    var cavalo = Cavalo("epona", "cavalo de corrida", "marrom", "pretos")

    cavalo.som()

    var preguica = Preguica("vigoroth", "Bradypus variegatus", "marrom", "castanhos")

    preguica.som()

}