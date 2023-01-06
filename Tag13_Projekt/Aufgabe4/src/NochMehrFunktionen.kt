// TODO: Hier sollst du nun deine eigene Funktion selbst entwerfen!
//  Gib der Funktion den Namen printCity. Lege in der Funktion jetzt eine MutableList mit Städtenamen vom Typ String an.
//  Zu Begin hat die MutableList die Werte "Köln" und "Hamburg". Die Funktion bekommt als Parameter einen Stadtnamen
//  übergeben und fügt den Stadtnamen der Liste hinzu. Am Ende gibt die Funktion die Liste aus. Benutzt dazu die
//  println()-Funktion.
//  Ruf jetzt die Funktion in der main-Funktion dreimal auf. Einmal mit dem Parameter "Berlin", einmal mit dem
//  Parameter "Duisburg" und einmal mit dem Parameter "Frankfurt".
//  Du hast die Funktion richtig erstellt, wenn in der Konsole das ausgegeben wird.

// [Köln, Hamburg, Berlin]
// [Köln, Hamburg, Duisburg]
// [Köln, Hamburg, Frankfurt]

fun main() {
    printCity("Berlin")
    printCity("Duisburg")
    printCity("Frankfurt")
}

fun printCity(city: String) {
    var cities = mutableListOf(
        "Köln",
        "Hamburg",
        city)
    println(cities)
}