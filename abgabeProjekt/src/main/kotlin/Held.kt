import kotlin.random.Random
import kotlin.random.nextInt

open class Held (var name: String, var hp: Int){
    override fun toString(): String {
        return("${this.name} ${this.hp}LP")
    }
    open fun attack(ziel: Gegner){
        println("$name greift ${ziel.name} an.")
        ziel.schadenerleiden(10)
    }
    open fun heal(allies: List<Held>){
        println("$name heilt $")
        var ziel = allies.random()
        ziel.hp += 15
        println("${ziel.name} wurde geheilt")
    }
    open fun block(): Int {
        val blockSchaden = Random.nextInt(1.. 11)
        println("$name wehrt ab und schwächt den Angriff.")
        return blockSchaden
    }
    open fun schadenerleiden(schaden: Int){
        hp -= schaden
        if (hp < 0){
            hp = 0
        }
    }
    open fun lebendig(): Boolean{
        return hp > 0
    }
    open fun tot(): Boolean{
        return hp <= 0
    }
}