Názov: Projekt do predmetu java
Autori: Jozef Čásar
	    Slavomír Svorada

Zadanie:
- Navrhnite a implementujte aplikáciu pre zobrazenie vozíkov vo veľkom
  sklade a sledovanie ich pohybu

Vypracovanie projektu:
- pre realizáciu je použitá Java SE 8
- pre realizáciu grafického uživateľského rozhrania sa používa JavaFx

Specifikácia požiadaviek:
1. Základné požiadavky
    - aplikácia zobrazí mapový podklad skladu, na ktorý sa potom
      prenášajú informácie o pohybe vozíkov
        - základný mapový podklad je tvorený cestami, regálmi a výdejným/nákladným miestom
        - mapový podklad se načíta po spuštění zo súboru
        - mapový podklad je možné přibližovat a oddalovat (zoom)

    - systém regálov
        - každý regál musí obsahovať aspoň jeden typ tovaru (vč. informácie o počte kusov, môže být aj
          prázdny)
        - aplikácia umožní inicializáciu skladu načítaním dát ze súboru (formát je na vás)
        - aplikácia bude podporovat minimálne 50 druhov tovaru
        - po najetí/kliknutí na pozíciu regálu se zobrazí jeho aktuálny obsah

    - systém požiadaviek
        - požiadavka je súpis tovaru a počet kusov, ktoré se majú previesť na výdejné miesto
        - aplikácia umožňuje načítanie požiadaviek zo súboru aj ručné zadávanie

    - systém vozíkov
        - vozíky si sami určujú (pokiaľ možno efektívnu) cestu ku splneniu požadavky
        - každá cesta je definovaná zoznamom regálov k nakladaniu tovaru (výdajné miesto – regál 1 - … -
          regál x - výdajné miesto)
        - je treba zohladniť kapacitu vozíka (napr. počet kusov, váha ...)
        - naloženie tovaru na vozík trvá rovnakú dobu

2. Pohyb vozíkov
    - systém obsahuje vlastné hodiny, ktorú je možné nastaviť na východziu hodnotu a rôznu rýchlosť
    - po načítaní mapy a obsahu skladu začne systém zobrazovať zpracovávanie jednotlivých požiadaviek
      (spôsob zobrazenia je na vašej invencii, postačí značka, kolečko, ...)
    - symbol vozíka se postupne posúva podľa aktuálneho času a požadavky (aktualizácia zobrazenia
      môže byť napr. každých N sekúnd); pohyb spoja na trase je teda simulovaný
    - po najetí/kliknutí na symbol vozíku sa zvýrazní trasa v mape a zobrazí jeho aktuálny náklad

3. Interaktívne zásahy
    - Je možné definovať možnosť uzavretia uličky
        - vozík si automaticky zvolí objazdnú trasu (a aktualizuje ju aj vo vizualizácii trasy)
        - objazdná trasa môže vynechat niektorú zo zastávok, pokiaľ nie je možné požadavku obslúžiť inak

Preloženie aplikácie:
- prevedie sa príkazom ant compile
- zkompilujú sa zdrojové texty, class súbory sa uložia do adresáru build
- vytvorí sa jar archív s názvom ija-app.jar v adresáry dest, do tohto adresáru
  sa vytvoria/nakopírujú daľšie potrebné súbory a archívy

Spustenie aplikácie:
- spúšťať sa bude vytvorený archív jar
- prevedie sa príkazom ant run