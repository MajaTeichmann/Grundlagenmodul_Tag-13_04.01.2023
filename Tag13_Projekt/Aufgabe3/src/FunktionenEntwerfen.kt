// TODO: In dieser Aufgabe wirst du ein paar in der Praxis oft verwendete Funktionen erstellen.
//
//  TODO: a) Erstelle eine Funktion, die zwei Zahlen vom Typ Double als Parameter erhält,
//   die zwei Zahlen addiert und das Ergebnis zurückgibt.
//   Teste deine Funktion, indem du sie in der main()-Funktion mit den zwei Werten 123.45 und 76.55 aufrufst.
//   Lege den Rückgabewert der Funktion in einer Variable ab und gebe den Wert der Variable in der Konsole mit der
//   println()-Funktion aus.
//   Wird 200.0 ausgegeben?
//   Du hast die Funktion richtig erstellt, wenn 200.0 ausgegeben wird.

//fun main() {
//    a(zahl1 = 123.45, zahl2 = 76.55)
//}
//
fun a(zahl1: Double, zahl2: Double){
    var ergebnis = zahl1 + zahl2
    println(ergebnis)
}

// TODO: b) Erstelle eine Funktion, die zwei Zahlen vom Typ Int als Parameter erhält,
//  die zweite Zahl von der ersten Zahl abzieht und das Ergebnis zurückgibt.
//  Teste deine Funktion, indem du sie in der main()-Funktion mit den zwei Werten 7 und 4 aufrufst.
//  Lege den Rückgabewert der Funktion in einer Variable ab und gebe den Wert der Variable in der Konsole mit der
//  println()-Funktion aus.
//  Wird 3 ausgeben?
//  Du hast die Funktion richtig erstellt, wenn 3 ausgegeben wird.

//fun main(){
//    b(4,7)
//}
//
fun b(zahl1: Int, zahl2: Int){
    var ergebnis= zahl2-zahl1
    println(ergebnis)
}

// TODO: c) Erstelle eine Funktion.
//  Die Funktion bekommt drei Zahlen vom Typ Int.
//  Die Funktion multipliziert dann die ersten zwei Zahlen vom Typ Int und speichert das Ergebnis in einer Variable.
//  Die Funktion zieht von dem Ergebnis die dritte Zahl ab.
//  Die Funktion gibt dann das Ergebnis zurück.
//  Teste deine Funktion, indem du sie in der main()-Funktion mit den drei Werten 25, 40 und 100 aufrufst.
//  Lege den Rückgabewert der Funktion in einer Variable ab und gebe den Wert der Variable in der Konsole mit der
//  println()-Funktion aus.
//  Wird 900 ausgegeben?
//  Du hast die Funktion richtig erstellt, wenn 900 ausgegeben wird.

//fun main(){
//    c(zahl1 = 25, zahl2 = 40, zahl3 = 100)
//}
//
fun c(zahl1: Int, zahl2: Int, zahl3: Int){
    var erstenZweiZahlen = zahl1*zahl2
    var abziehen = erstenZweiZahlen - zahl3
    println(abziehen)
}

fun main(){
    a(123.45,76.55)
    b(4,7)
    c(25,40,100)
}