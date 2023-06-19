class Lichtbringer(name: String, private var mana: Int, hp: Int) : Gegner(name, hp) {
    override fun toString(): String {
        return("${this.name} ${this.mana}Mana ${this.hp}LP")
    }
    override open fun aktion(held: List<Held>){
        var zufälligerAngriff = (1..4).random()
        when (zufälligerAngriff){
            1 -> attack(held)
            2 -> attackAll(held)
            3 -> beschwörung()
            4 -> ultimate(held)
        }
    }
    override fun attack(ziel: List<Held>){
        var randomHeld = ziel.random()
        println("$name greift ${randomHeld.name} an")
        randomHeld.schadenerleiden(20)
    }

    override fun attackAll(ziel: List<Held>) {
        ziel.forEach {held -> println(
            "$name fügt der Gruppe Schaden zu")
            held.schadenerleiden(20)}
        mana -= 30
    }
    var beschworener: beschworener? = null
    private fun beschwörung(){
        if(mana >= 100) {
        println("$name beschwört einen grässlichen.")
        val grässlicher = beschworener("grässlicher", 100)
             fun toString(): String {
                return("${this.name} ${this.hp}LP")
            }
        this.beschworener = grässlicher
            mana -= 100
        }else{
            println("$name hat die Hölle leergeräumt")
        }
    }
    private fun ultimate(ziel: List<Held>){
        if(mana >= 200) {
            ziel.forEach { held ->
                println(
                    " $name macht ernst"
                )
                held.schadenerleiden(40)
            }
            mana -= 200
        }else{
            println("$name ist wohl zu erschöpft")
        }
    }
}