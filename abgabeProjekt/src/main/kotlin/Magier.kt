class Magier(name: String, private var mana: Int, hp: Int) : Held(name, hp) {
    override fun toString(): String {
        return("${this.name} ${this.mana}Mana ${this.hp}LP")
    }

    override fun attack(ziel: Gegner) {
        if (mana >= 20){
            println("$name schiesst einen Feuerball auf ${ziel.name}")
            ziel.schadenerleiden(30)
            mana -= 20
        }else{
            println("$name hat keine power mehr")
        }
    }

}
