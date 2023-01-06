//TODO: Mathematik, mathematik, immer diese mathematik. Aber an der Mathematik führt kein Weg vorbei. Deswegen
// akzeptiere einfach meine Anforderung und komm doch meiner Bitte nach.
// Ich wollte meiner Klasse heute geometrische Formen näher bringen. Aber mir sind die Formeln entwischen.
// Kannst du mir dabei helfen die Formel wieder zusammenzukriegen?
// Schreibe eine Funktion, welche mir den Flächeninhalt und den Umfang eines Quadrates ausgibt.
// Flächeninhalt: A = a2
// Umfang: U = 4 * a
// Schreibe eine Funktion, welche mir den Flächeninhalt und den Umfang eines Rechtecks ausgibt.
// Flächeninhalt: A = a * b
// Umfang: U = 2 * a + 2 * b
// Schreibe eine Funktion, welche mir den Flächeninhalt und den Umfang eines Kreises ausgibt.
// Flächeninhalt: A = π * r2
// Umfang: U = 2 * r * π
// Rufe die Funktionen in der main()-Funktion auf um deine Ergebnisse zu überprüfen.

fun main() {
    quadrat(String(),String())
    println("")
    rechteck(String(),String())
    println("")
    kreis(String(),String())
}

fun quadrat(flaechenInhaltQuadrat: String, umfangQuadrat: String){
    val flaechenInhaltQuadrat = "A = a2"
    val umfangQuadrat = "U = 4*a"
    println("Die Formel für die Berechnung des Flächeninhalts eines Quadrates lautet: $flaechenInhaltQuadrat")
    println("Die Formel für die Berechnung des Umfangs eines Quadrates lautet: $umfangQuadrat")
}
fun rechteck(flaechenInhaltRechteck: String, umfangRechteck: String){
    val flaechenInhaltRechteck = "A = a*b"
    val umfangRechteck = "U = 2*a + 2*b"
    println("Die Formel für die Berechnung des Flächeninhalts eines Rechtecks lautet: $flaechenInhaltRechteck")
    println("Die Formel für die Berechnung des Umfangs eines Rechtecks lautet: $umfangRechteck")
}

fun kreis(flaechenInhaltKreis: String, umfangKreis: String){
    val flaechenInhaltKreis = "A = π * r2"
    val umfangKreis = "U = 2 * r * π"
    println("Die Formel für die Berechnung des Flächeninhalts eines Kreises lautet: $flaechenInhaltKreis")
    println("Die Formel für die Berechnung des Umfangs eines Kreises lautet: $umfangKreis")
}