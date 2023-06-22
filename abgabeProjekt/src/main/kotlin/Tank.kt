import kotlin.random.Random
import kotlin.random.nextInt

class Tank (name: String, hp: Int, mana: Int) : Held(name, hp, mana) {

    override fun toString(): String {
        return("${this.name} ${this.mana}Mana ${this.hp}HP") }
    override fun attack(ziel: Gegner){
        println("$name greift ${ziel.name} an.")
        ziel.schadenerleiden(5)}

    override fun block(): Int {
        val blockSchaden = Random.nextInt(21.. 110)
        val gesamt = blockSchaden
        hp -= (gesamt)
        println("$name wehrt ab und schwächt den Angriff.")
        return blockSchaden
    }
    var provoziert = false
     fun schadenerleiden(schaden: Int){
        if (provoziert){
            provoziert = false
            println("$name macht ***** Sachen")
        }else {
            schadenerleiden(schaden)//stackOverflowError
        }
    }
}