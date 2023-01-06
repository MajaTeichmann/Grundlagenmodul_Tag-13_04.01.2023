// TODO: In dieser Aufgabe erstellen wir eine Funktion mit Parametern.
//  In der Datei "FunktionAnleitung.kt", außerhalb der main()-Funktion, schreibe das Keyword für Funktionen “fun”.
//  Schreibe jetzt den Namen der Funktion “deinName”.
//  Schreibe die Klammern für die Parameter "()".
//  Schreibe in die Klammer deinen Parameter “name” vom Typ String.
//  Gebe jetzt den Rumpf der Funktion mit "{}" an.
//  Gebe im Rumpf deiner Funktion deinen Namen aus:
//  Schreibe die println() Funktion.
//  Schreibe in die Klammern "Hallo, mein Name is $name.".
//  rufe “deinName()” in der Main-Funktion auf und schreibe den Namen "Daniel" als String in die Klammern.
//  Führe jetzt dein Programm aus und überprüfe, ob der Text "Hallo, mein Name is Daniel." ausgegeben wird.
//  Wenn ja, hast du die Funktion richtig erstellt und aufgerufen.

fun main() {
    deinName("Daniel")
}

fun deinName(name: String){
    println("Hallo, mein Name is $name.")
}