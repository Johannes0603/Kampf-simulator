import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {



    val gut1 = Magier("testbernd", 20, 500)
    val gut2 = Held("Peter", 100, mana = 20)
    val gut3 = Tank("tankbernd",200, 10)
    val eigeneEinheiten = listOf(gut1, gut2, gut3)
    val bös1 = Lichtbringer("dolf", 1000, 10001)
   // val bös2 = beschworener("grässlicher", 50)
    val gegner = mutableListOf<beschworener>()
    var round = 1
    // loop
    while (gut1.lebendig() or gut2.lebendig() or gut3.lebendig()
        && bös1.lebendig()) {
        println("runde: $round")
        println("$eigeneEinheiten treffen auf $bös1 $gegner\n")
        round++

    bös1.aktion(eigeneEinheiten)
        if (eigeneEinheiten.all { it.tot() }){
        println("Das böse siegt")
        break }

        eigeneEinheiten.forEach() { Held ->
        println("${Held.name} ist an der Reihe.Was möchtest du tun?:")
        println("1. Angriff")
        println("2. blocken")
            if (Held is Tank){
                println("3. Provozieren")
            }

        val auswahl = readln()
        when (auswahl) {
            "1"-> {Held.attack(bös1)}
            "2"-> { val blockSchaden = Held.block()
                val gesamt = blockSchaden}
            "3"->{ if (Held is Tank){
                Held.provoziert = true
            }
            }else -> println("ungültige Auswahl") } }
    if (bös1.tot()) {
        println("das böse wurde besiegt")
        break }
        println()
        if (!eigeneEinheiten.any{it.lebendig()}){
        println("${bös1.name} wurde besiegt")
    }else if (!bös1.lebendig()){
        println("$eigeneEinheiten wurde besiegt")
    break}
}}
