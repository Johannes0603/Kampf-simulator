import kotlin.random.Random
import kotlin.random.nextInt

open class Held (var name: String, var hp: Int, var mana: Int){
    override fun toString(): String {
        return("${this.name} ${this.hp}LP")
    }
    open fun attack(ziel: Gegner){
        println("$name greift ${ziel.name} an.")
        ziel.schadenerleiden(15)
    }
    open fun block(): Int {
        val blockSchaden = Random.nextInt(1.. 11)
        val gesamt = blockSchaden
        hp -= (gesamt)
        println("$name wehrt ab und schwächt den Angriff.")
        return blockSchaden
    }
    open fun gegnerWaehlen(gegner: Gegner){
        println("${this.name} ist dran.Leg los:")
        println("1.Angriff")
        println("2.Blocken")
        val auswahl = readln()
        when (auswahl){
            "1" -> this.attack(gegner)
            "2" -> { this.block()
            }
            else -> println("Ungültige Auswahl")
        }
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