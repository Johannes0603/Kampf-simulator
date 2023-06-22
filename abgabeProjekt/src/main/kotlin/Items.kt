class Item(val name: String, val effect: String)

var Heiltrank = 3
var kokain = 2
fun rausch(ziel: Held){
    if (kokain > 0) {
        ziel.mana += 20
        kokain = -1
        println("${ziel.name} macht sich wuschig")
    }else {
        println(" Ey Magier wir haben keinen Stoff mehr!!")
    }
}