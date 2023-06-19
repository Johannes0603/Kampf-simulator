import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {



    val gut1 = Magier("testbernd", 20, 50)
    val gut2 = Held("Peter", 100)
    val eigeneEinheiten = listOf(gut1, gut2)
    val bös1 = Lichtbringer("dolf", 1000, 100)
    var round = 1
    // loop
    while (gut1.lebendig() && gut2.lebendig() && bös1.lebendig()) {
        println("runde: $round")
        println("$eigeneEinheiten treffen auf $bös1\n")
        round++
    bös1.aktion(eigeneEinheiten)

        if (eigeneEinheiten.all { it.tot() }){
        println("Das böse siegt")
        break }
        eigeneEinheiten.forEach { Held ->
        println("${Held.name} ist an der Reihe.Was möchtest du tun?:")
        println("1. Angriff")
        println("2. blocken")
        val auswahl = readln()
        when (auswahl) {
            "1"-> Held.attack(bös1)
            "2"-> {
                val blockSchaden = Held.block()
                val gesamt = blockSchaden
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
