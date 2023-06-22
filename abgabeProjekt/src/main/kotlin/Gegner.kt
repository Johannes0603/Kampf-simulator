// return("${this.name} ${this.hp}LP")
open class Gegner (val name: String, var hp: Int){
    override fun toString(): String {
       return "$name ($hp HP)" }


    open fun aktion(ziel: List<Held>){
        var provoziertVon: Tank? = null
        if (provoziertVon != null){
            println("$name attackiert ${provoziertVon!!.name}")
            provoziertVon!!.schadenerleiden(10)
        }else{
        var zufälligerAngriff = (1..2).random()
        when (zufälligerAngriff){
            1 -> attack(ziel)
            2 -> attackAll(ziel)
        }}
    }
    open fun attack(ziel: List<Held>){
        var randomHeld = ziel.random()
        println("$name greift ${randomHeld.name} an")
        randomHeld.schadenerleiden(20)
    }
    open fun attackAll(ziel: List<Held>){
        ziel.forEach {Held -> println(
            "$name fügt der Gruppe Schaden zu")
        Held.schadenerleiden(10)}
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