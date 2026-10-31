## Detyra: BankApp - Menaxhimi i Llogarise Bankare

Te krijohet nje aplikacion interaktiv ne Java me emrin **BankApp**, i cili mundeson menaxhimin e nje llogarie bankare dhe regjistrimin e transaksioneve.

Aplikacioni duhet te mundesoje perdoruesit te vendose dhe perditesoje te dhenat e llogarise, te depozitoje dhe terheqe para, si dhe te shoh historikun e transaksioneve te kryera.

### Menuja kryesore

```text
======= BANK APP =======

1. Perditeso te dhenat e llogarise
2. Depozito para
3. Terhiq para
4. Shfaq detajet e llogarise
5. Shfaq historikun e transaksioneve
0. Dil nga aplikacioni

Zgjedh opsionin:
```

### Funksionalitetet

**1. Perditeso te dhenat e llogarise**

Perdoruesi duhet te kete mundesi te vendose ose perditesoje:
- Emrin dhe mbiemrin e pronarit.
- Numrin e llogarise bankare.

**2. Depozito para**

Perdoruesi duhet te kete mundesi te depozitoje nje shume te caktuar parash ne llogarine e tij.

- Shuma duhet te jete me e madhe se 0.
- Pas depozitimit, bilanci duhet te rritet.
- Depozitimi i suksesshem duhet te regjistrohet automatikisht ne historikun e transaksioneve.

**3. Terhiq para**

Perdoruesi duhet te kete mundesi te terheqe para nga llogaria e tij.

- Shuma duhet te jete me e madhe se 0.
- Nuk lejohet terheqja e nje shume me te madhe se bilanci aktual.
- Pas terheqjes, bilanci duhet te zvogelohet.
- Terheqja e suksesshme duhet te regjistrohet automatikisht ne historikun e transaksioneve.

**4. Shfaq detajet e llogarise**

Aplikacioni duhet te shfaqe:
- Emrin dhe mbiemrin e pronarit.
- Numrin e llogarise.
- Bilancin aktual.
- Numrin total te transaksioneve te suksesshme.

**5. Shfaq historikun e transaksioneve**

Aplikacioni duhet te shfaqe te gjitha depozitimet dhe terheqjet e kryera me sukses.

Per secilin transaksion duhet te shfaqen:
- Numri i references (numer i rastesishem me 6 shifra).
- Lloji i transaksionit (Depozitim / Terheqje).
- Shuma e transaksionit.

**Shembull:**

```text
======= TRANSACTION HISTORY =======

Ref: 583291 | Depozitim | +500.00 EUR
Ref: 729184 | Terheqje  | -100.00 EUR
Ref: 391825 | Depozitim | +200.00 EUR

-----------------------------------
Bilanci aktual: 600.00 EUR
Total transaksione: 3
```

### Kerkesa shtese

- Aplikacioni duhet te funksionoje permes konsoles duke perdorur `Scanner`.
- Te perdoren konceptet e Programimit te Orientuar ne Objekte (POO).
- Bilanci fillestar i llogarise duhet te jete 0 EUR.
- Te dhenat e llogarise duhet te mbrohen nga ndryshimet e pakontrolluara.
- Cdo depozitim dhe terheqje e suksesshme duhet te ruhet ne historikun e transaksioneve.
- Transaksionet e deshtuara nuk duhet te regjistrohen ne historik dhe nuk duhet te ndryshojne bilancin.
- Pas cdo operacioni, menuja duhet te shfaqet perseri.
- Aplikacioni duhet te vazhdoje ekzekutimin derisa perdoruesi te zgjedhe opsionin `0`.