import kotlin.random.Random
import kotlin.random.nextInt

open class Held (var name: String,var mana: Int ,var hp: Int ){
    override fun toString(): String {
        return ("${this.name} ${this.mana} Mana ${this.hp} HP")
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
    open fun gegnerWaehlen(ziel: Gegner){
        println("${this.name} ist dran.Leg los:")
        println("1.Angriff")
        println("2.Blocken")
        val auswahl = readln()
        when (auswahl){
            "1" -> this.attack(ziel)
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

    open var Heiltrank = 3
    open var puderzucker = 2
    open fun rausch(ziel: Held){
        if (puderzucker > 0) {
            ziel.mana += 20
            puderzucker = -1
            println("${ziel.name} macht sich wuschig")
        }else {
            println(" Ey Magier wir haben keinen Stoff mehr!!")
        }
}
}


/*var Heiltrank = 3
  var kokain = 2
  fun rausch(ziel: Held){
      if (kokain > 0) {
          ziel.mana += 20
          kokain = -1
          println("${ziel.name} macht sich wuschig")
      }else {
          println(" Ey Magier wir haben keinen Stoff mehr!!")
      }
  }*/
