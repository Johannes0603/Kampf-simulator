import kotlin.random.Random
import kotlin.random.nextInt
// loop(gut1.lebendig() or gut2.lebendig() or gut3.lebendig()
// val bös2 = beschworener("grässlicher", 50)
//while (eigeneEinheiten.any { it.lebendig() } && bös1.lebendig()) {


fun main(args: Array<String>) {
    val held1 = (Magier("magieBernd", 20, 10))
    val held2 = (Held("peterHeld", 100,  10))
    val held3 = (Tank("tankBernd", 200, 10))
    val eigeneEinheiten = mutableListOf<Held>()
    eigeneEinheiten.add(held1)
    eigeneEinheiten.add(held2)
    eigeneEinheiten.add(held3)

    val bös1 = Lichtbringer("dolf", 1000, 110)

    val gegner = mutableListOf<beschworener>()
    var round = 1

    while(held1.hp > 0 && held2.hp > 0 && held3.hp > 0 && bös1.lebendig()) {
        println()
        println("runde: $round")
        println("$eigeneEinheiten treffen auf $bös1 $gegner\n")
        round++

        eigeneEinheiten.forEach() { Held ->
            if (Held.tot()){
                println("${Held.name} ist tot")
                return@forEach
            }
            //Held.gegnerWaehlen(Gegner(readln()))
            println("${Held.name} ist an der Reihe.Was möchtest du tun?:")
            println("1. Angriff")
            println("2. blocken")
            if (Held is Tank) {
                println("3. Provozieren")
            } else if (Held is Magier) {
                println("3. Heal")
            }
            println("4. berauschen")
            val auswahl = readln()
            when (auswahl) {
                "1" -> { Held.attack(bös1) }
                "2" -> { val blockSchaden = Held.block()
                    val gesamt = blockSchaden }
                "3" -> {
                    if (Held is Tank) {
                        Held.provoziert = true } }
                "4" ->  Held.rausch(Held)
                else -> println("ungültige Auswahl")
            }
        }
        bös1.aktion(eigeneEinheiten)

        if (eigeneEinheiten.any { it.tot() }) {
            println()
            println("Gut wurde besiegt")
            break
        }

        if (bös1.tot()){
            println()
            println("das böse wurde besiegt")
            break}

    }
}
       /*
        (eigeneEinheiten.all { it.tot() }) {
            println("Gut wurde besiegt")
            break

    if (bös1.tot()) {
        println("das böse wurde besiegt")
        break }
        println()
        if (!eigeneEinheiten.any{it.lebendig()}){
        println("${bös1.name} wurde besiegt")
    }else if (!bös1.lebendig()){
        println("$eigeneEinheiten wurde besiegt")
    break}
if (held1.hp <= 0 && held2.hp <= 0 && held3.hp <= 0) {
            println("Das Heldenteam wurde besiegt.")
        break}
        else if(bös1.hp <= 0) {
            println("Der Endgegner wurde besiegt. Das Heldenteam gewinnt!")
            break}
    }

        */

