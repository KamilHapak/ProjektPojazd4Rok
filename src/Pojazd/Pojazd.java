/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojazd;

import nadwozie.Drzwi;
import nadwozie.Lusterko;
import nadwozie.Maska;
import nadwozie.Zderzak;

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
}
