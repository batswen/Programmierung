a = 0
b = 1
text = ""

# Hinter IF muss eine Bedingung angegeben werden.
# Ist diese Wahr wird der folgende Block ausgeführt,
# ist sie falsch wird das Programm nach dem IF fortgesetzt.

if a < b:
    print("Wahr")

# Gibt es ein ELSE, so kann auch der Falsch-Fall abgefangen
# werden.
# Es wird immer nur ein Block ausgeführt

if a > b:
    print("Wahr")
else:
    print("Falsch")


# Den Bedingungsoperator gibt es in ähnlicher Form

if b == 1:
    a = 1
else:
    a = 0
# ist gleichbedeutent mit:
a = 1 if b == 1 else 0


text = "a ist kleiner" if a < b else "b ist kleiner oder beide sind gleich"
print("Hallo, Welt!" if a == 0 else "Hello, world!")


passwort = input("Bitte geben Sie das Passwort ein: ")
if passwort == "12345":
    print("Richtiges Passwort! Willkommen!")
else:
    print("Alaaaaarm!")

# oder

print("Richtig" if passwort == "12345" else "Alarm!")
