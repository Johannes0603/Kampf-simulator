class beschworener (name: String, hp: Int) : Gegner(name, hp){
    override fun toString(): String {
        return("${this.name} ${this.hp}HP")
    }

    override fun attack(ziel: List<Held>) {
        super.attack(ziel)
    }
    override fun aktion(ziel: List<Held>){
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

}