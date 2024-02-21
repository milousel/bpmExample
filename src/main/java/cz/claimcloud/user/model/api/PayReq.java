package cz.claimcloud.user.model.api;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PayReq {

    /*
    Číslo platby
    Číslo musí být v každém požadavku od obchodníka unikátní
     */
    @NotNull
    Integer orderNumber;

    @NotNull()
    Integer amount;

    /*
    Identifikátor měny dle ISO 4217.
    Multicurrency (použití různých měn) je závislé na podpoře jednotlivých bank.
    Je nutné se informovat u své banky.
     */
    Integer currency;

    /*
    Udává, zda má být platba uhrazena automaticky.
    Povolené hodnoty:
    0 = není požadována okamžitá úhrada
    1 = je požadována úhrada
     */
    @NotNull(message = "Allowed values are 0 and 1. 0 - immediate payment, 1 - payment required")
    Integer depositFlag;

    /*
    Popis nákupu.
    Pole musí obsahovat pouze ASCII znaky v rozsahu 0x20 – 0x7E.
     */
    String desc;

    /*
    Hodnota určující preferovanou platební metodu. Pokud je parametr zaslán, ale
    použité zařízení požadovanou platební metodu nepodporuje, jsou nabídnuty ostatní
    platební metody.
     */
    String payMethod;

    /*
    E-mail držitele karty, použije se pro notifikaci
    výsledku platby a v antifraud systémech (FDS).
    Pole musí obsahovat pouze jednu validní email adresu.
     */
    String customerEmail;

    /*
    Interní ID u obchodníka
    Podporované ASCII znaky:
    x20(space), x23(#), x24($), x2A-x3B(*+,-./0-9:;), x3D(=), x40-x5A(@A-Z), x5E(^), x5F(_), x61-x7A(a-z)
     */
    String referenceNumber;
    /*
    Hodnota určuje automatickou volbu jazyka na platební stránce. Musí být použita zkratka
    jednoho z podporovaných jazyků – viz seznam na platební bráně.
     */
    String lang;




}
