class Item(val name: String, val effect: String)

var Heiltrank = 3
var puderzucker = 2
fun rausch(ziel: Held){
    if (puderzucker > 0) {
        ziel.mana += 20
        puderzucker = -1
        println("${ziel.name} macht sich wuschig")
    }else {
        println(" Ey Magier wir haben keinen Stoff mehr!!")
    }
}