## Ushtrimi 4 - Porosite ne nje kafene

Nje kafene do nje program ne Java qe mban porosine e klientit dhe pergatit faturen. Porosia fillon e zbrazet.
Kamarieri mund te shtoje artikuj dhe te heqe nje artikull nga porosia. Dy artikuj me te njejtin emer mund te jene ne te njejten porosi.
Kur hiqet nje prej tyre, tjetri mbetet ne fature.

Kafeneja shet keto artikuj.

| Artikulli | Rregulli i cmimit |
| --- | --- |
| Pije e zakonshme | Cmimi i shenuar ne menu |
| Pije me shtesa | Cmimi i pijes plus 0.50 euro per secilen shtese |
| Meny fikse | Sanduiç dhe pije per 4.00 euro gjithsej. Ne fature shfaqet si nje artikull. |

Fatura i shfaq artikujt sipas rendit ne te cilin jane shtuar, me emrin dhe cmimin e secilit. Pas listes shfaqet totali. Kur porosia eshte bosh, totali eshte 0.00 euro. Nese kamarieri tenton te heqe nje artikull qe nuk gjendet ne porosi, programi e njofton dhe e ruan porosine siç ishte.

**Skenari qe duhet te funksionoje**

1. Shto nje çaj qe kushton 1.00 euro.
2. Shto nje kafe me dy shtesa. Kafeja ne menu kushton 1.50 euro.
3. Shto nje meny fikse.
4. Shfaq faturen. Totali i pritur eshte **7.50 euro**.
5. Hiqe çajin dhe shfaq faturen perseri. Totali i pritur eshte **6.50 euro**.

Paraqit edhe nje rast me dy artikuj me te njejtin emer dhe demonstro se mund te hiqet vetem njeri. Ne fund, shpjego shkurt si do ta pershtatje zgjidhjen nese kafeneja shton nje artikull me nje rregull tjeter cmimi.
