# Automatsko testiranje - projekt
 Ovaj projekt implementira okvir za automatsko testiranje programske podrške koristeći Selenium WebDriver. Projekt je napravljen u IntelliJ s programskim jezikom Java i sadrži pet testnih slučajeva: testiranje prijave, odjave, pretraživanja stranice, spremanje "pin-a" i odabiranje "pin-a".

 ## Alati
- **Selenium WebDriver** -> otvoreni alat za automatizaciju web aplikacija koji omogućuje testiranje različitih funkcionalnosti
- **JUnit** -> okvir za testiranje koji podržava automatsko izvođenje testova i prikazivanje rezultata
- **WebDriverManager** -> alat za automatsko upravljanje WebDriver verzijama, što olakšava konfiguraciju
- **Wait naredba u Selenium WebDriveru** -> upotrebljava se za precizno upravljanje vremenom čekanja kako bi se izbjegli problemi s asinkronim elementima
![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/b236d642-1bd3-4c86-b0c7-5dc992192fb1)

 ## Struktura projekta
 ![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/08221abf-bc24-46b0-9a0e-5bfe8875a067)

 ## Pokrenuti testovi
 ![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/9928d741-f9a6-4981-8414-80dfafa739da)

## Testiranje prijave i odjave
- **LoginTest.java:** -> test provjerava funkcionalnost prijave korisnika na stranicu www.pinterest.com. 
![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/7317a36d-8031-41f9-a662-1a026e68222d)

- **LogOutTest.java:** -> test provjerava funkcionalnost odjave korisnika s računa na stranici www.pinterest.com.
![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/98ed1a78-2f3f-4876-8de4-6b95d735cb6d)

## Testiranje odabiranja "pin-a" i spremanja "pin-a"

- **SelectPinTest.java:** -> test odabire određeni "pin" nakon što se korisnik prijavi u svoj račun.
![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/2806fb30-b6df-45f8-901f-83062c358527)

- **SavePinTest.java:** -> test, nakon odabira određenog "pin-a", provjerava funkcionalnost spremanja tog "pin-a".
![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/137d9029-aaf3-4c73-8379-ca25167984f7)

## Testiranje pretraživanja stranice

- **SearchPageTest.java:** -> test provjerava funkcionalnost pretraživanja stranice www.pinterest.com nakon što se korisnik prijavi u svoj račun.
![image](https://github.com/katarinajukic/testiranje_projekt/assets/133279741/5d26e46b-8295-4856-83ad-2dc7d2cdfcbb)
