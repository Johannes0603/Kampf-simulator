class beschworener (name: String, hp: Int) : Gegner(name, hp){
    override fun toString(): String {
        return("${this.name} ${this.hp}LP")
    }


}