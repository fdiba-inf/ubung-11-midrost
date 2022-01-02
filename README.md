# Übung 11
Quellcode der Vorlesung: https://github.com/fdiba-inf/vorlesung
## Repl.it öffnen
Bevor Sie die Taste _"Work in Repl.it"_ klicken, öffnen Sie https://repl.it/auth/github/get, um sicherzustellen, dass Sie in repl.it angemeldet sind.
## Aufgabe 1. Dynamischer Stapel
Ändern Sie die Klasse _LinkedStack_ im Paket _exercise11_. 
Sie soll einen dynamischen Stapel (LIFO, Last-In-First-Out) auf Basis von Referenzen definieren. 
Benutzen Sie dabei die _Node_ Klasse im Paket _exercise11_.
Implementieren Sie die folgenden Methoden:
* **boolean isEmpty()** – Überprüfen, ob der Stapel leer ist.
* **void push(String data)** – Ein neues Element im Stapel einfügen.
* **String pop()** – Das nächste Element vom Stapel entfernen und zurückliefern (_null_, wenn leer).

Erwartete Ausgabe der Klasse _LinkedStackDemo_ im Paket _exercise11_:
``` 
Stack: 
Pop: null
Stack: D->C->B->A
Pop: D
Stack: C->B->A
Pop: C
Stack: B->A
```
## Aufgabe 2. Dynamische Warteschlange
Ändern Sie die Klasse _LinkedQueue_ im Paket _exercise11_.
Sie soll eine dynamische Warteschlange (FIFO, First-In-First-Out) auf Basis von Referenzen definieren.
Benutzen Sie dabei die _Node_ Klasse im Paket _exercise11_.
Implementieren Sie die folgenden Methoden:
* **boolean isEmpty()** – Überprüfen, ob die Warteschlange leer ist.
* **void offer(String data)** – Ein neues Element am Ende der Warteschlange einfügen.
* **String poll()** – Das nächste Element vom Anfang der Warteschlange entfernen und zurückliefern (_null_, wenn leer).

Erwartete Ausgabe der Klasse _LinkedQueueDemo_ im Paket _exercise11_:
``` 
Queue: 
Poll: null
Queue: A->B->C->D->E
Poll: A
Poll: B
Queue: C->D->E
Queue: C->D->E->F
Poll: C
Poll: D
Queue: E->F
Queue: E->F->G
Poll: E
Queue: F->G
```
## Achtung! Achtung! Achtung!
Wenn Sie alle Aufgaben gemacht haben, sollen Sie die Lösungen in _GitHub_ hochladen. 
Wenn "Version Control" nicht verfügbar ist, geben Sie die folgenden Befehle in die Konsole ein:
``` 
git pull
git add .
git commit -m "Some message"
git push
``` 
