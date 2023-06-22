import kotlin.random.Random
import kotlin.random.nextInt

class Tank (name: String, mana: Int,hp: Int) : Held(name, mana, hp) {

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
     override fun schadenerleiden(schaden: Int){
        if (provoziert){
            provoziert = false
            println("$name macht ***** Sachen")
        }else {
            super.schadenerleiden(schaden)//stackOverflowError
        }
    }
    override fun lebendig(): Boolean{
        return hp > 0
    }
    override fun tot(): Boolean{
        return hp <= 0
    }
    override var Heiltrank = 3
    override var puderzucker = 2
    override fun rausch(ziel: Held){
        if (puderzucker > 0) {
            ziel.mana += 20
            puderzucker = -1
            println("${ziel.name} macht sich wuschig")
        }else {
            println(" Ey Magier wir haben keinen Stoff mehr!!")
        }
}}