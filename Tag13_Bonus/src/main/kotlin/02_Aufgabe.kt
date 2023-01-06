// TODO: Erstelle zwei Funktionen, die jeweils Meter in Kilometer bzw. Kilometer in Meter umwandeln.
//  Dabei gilt: Der Parameter wird in Double angegeben und die Funktion darf keine println-Ausgabe beinhalten.
//  Stattdessen gibt sie den Wert über ein return zurück und wird über die main()-Funktion ausgegeben.


fun main(){
    println("Nenne mir eine Meterangabe, die du in Km umgewandelt haben möchtest! (bitte als Double angeben)")
    val meter = readln().toDouble()
    val meterToKm = convertFromMeterToKM(meter)
    println("$meter Meter sind $meterToKm Kilometer.")
    println("Nenne mir eine Kilometerangabe, die du in Meter umgewandelt haben möchtest! (bitte als Double angeben)")
    val kilometer = readln().toDouble()
    val kmToMeter = convertFromKMToMeter(kilometer)
    println("$kilometer Kilometer sind $kmToMeter Meter.")
}

fun convertFromMeterToKM(meter: Double): Double{
    return meter / 1000
}

fun convertFromKMToMeter(kilometer: Double): Double{
    return kilometer * 1000
}