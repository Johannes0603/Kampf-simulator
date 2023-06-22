class Magier(name: String,mana:Int, hp: Int) : Held(name, hp, mana) {
    override fun toString(): String {
        return("${this.name} ${this.mana}Mana ${this.hp}HP")
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
    fun heal(allies: List<Held>){
        println("$name heilt $")
        var ziel = allies.random()
        ziel.hp += 15
        println("${ziel.name} wurde geheilt")
    }
    override fun rausch(ziel: Held){
        if (puderzucker > 0) {
            ziel.mana += 20
            puderzucker = -1
            println("${ziel.name} macht sich wuschig")
        }else {
            println(" Ey Magier wir haben keinen Stoff mehr!!")
        }
    }
}
