# 4. kisbeadandó

Készítsd el egy RMI alkalmazás kliens oldalát! 
A teljes program működése: a program bejegyez objektumokat a registry-be, amik az angol ábécé egyes betűit tárolják és egy hozzájuk készített számot (ez nem egyezik meg a karakter ASCII kódjával). A kliens feladata a paraméterül kapott szöveg elkódolása a szerver oldal által adott számkódok szerint.

Készíts olyan klienst (Client.java), ami a parancssori argumentumként megkapott szöveget kiírja a képernyőre, majd pedig a betűnként 
elkódolt változatát is (az egyes karaktereket jelölő számokat szóközzel elválasztva).
Tipp: nézd meg a Java dokumentációban, milyen függvények vannak a Registry interface-ben!

A KodInterface egy függvényt tartalmaz: public int getCode(char c). Ez megadja a paraméterként kapott karakterhez tartozó számot, amennyiben ezt a karaktert tárolta el az adott objektum, egyébként -1-et ad vissza. A mellékelt KodDeploy program az 12345 porton elindítja a registry-t és bejegyzi különböző nevekre az ábécé betűit és a hozzájuk készített számot.

A feladathoz szükséges szerverhez a kódok innen View in a new windowletölthetők. A program futtatása: a letöltött .class fájlok és a Client.java fájl ugyanabba a könyvtárba kerüljön, a Client.java-ban ne legyen megadva package. A class fájlok már le vannak fordítva, a "java KodDeploy" paranccsal lehet elindítani a szervert, a klienst pedig ugyanúgy kell fordítani és futtatni, mint általában.

Eredményül 1 db java forrásfájlt tölts fel!
