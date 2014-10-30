/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojazd;

import dodatki.ChoinkaZapachowa;
import dodatki.ChromowanaNakladkaNaPedal;
import nadwozie.Drzwi;
import nadwozie.Fotel;
import nadwozie.Kanapa;
import nadwozie.Lusterko;
import nadwozie.Maska;
import nadwozie.Nadwozie;
import nadwozie.PasBezpieczenstwa;
import nadwozie.PoduszkaPowietrzna;
import nadwozie.Szyberdach;
import nadwozie.Zderzak;
import podwozie.Felga;
import podwozie.Opona;
import silnik.BlokSilnika;
import silnik.FiltrPowietrza;
import silnik.MiskaOlejowa;
import silnik.PompaOleju;
import ukladElektryczny.Bezpiecznik;

/**
 * Klasa służy do reprezentowania Pojazdu
 * @author Damian Guldynowicz
 */
public class Pojazd {
    
    /**
     * Tworzy obiekt klasy Pojazd
     */
    nadwozie.Drzwi drzwi = new Drzwi();
    nadwozie.Lusterko lusterko = new Lusterko();
    nadwozie.Maska maska = new Maska();
    nadwozie.Zderzak zderzak = new Zderzak();
    nadwozie.Nadwozie nadwozie = new Nadwozie();
    nadwozie.Fotel fotel = new Fotel();
    nadwozie.Kanapa kanapa = new Kanapa();
    nadwozie.PasBezpieczenstwa pasbezpieczenstwa = new PasBezpieczenstwa();
    nadwozie.PoduszkaPowietrzna poduszkapowietrzna = new PoduszkaPowietrzna();
    nadwozie.Szyberdach szyberdach = new Szyberdach();
    //nadwozie
    
    dodatki.ChoinkaZapachowa choinkazapachowa = new ChoinkaZapachowa();
    dodatki.ChromowanaNakladkaNaPedal chromowananakladkanapedal = new ChromowanaNakladkaNaPedal();
    //dodatki
    
    podwozie.Felga felga = new Felga();
    podwozie.Opona opona = new Opona();
    //podwozie
    
    silnik.BlokSilnika bloksilnika = new BlokSilnika();
    silnik.FiltrPowietrza filtrpowietrza = new FiltrPowietrza();
    silnik.MiskaOlejowa miskaolejowa = new MiskaOlejowa();
    silnik.PompaOleju pompaoleju = new PompaOleju();
    //silnik
    
    ukladElektryczny.Bezpiecznik bezpiecznik = new Bezpiecznik();
    //uklad elektryczny
}
