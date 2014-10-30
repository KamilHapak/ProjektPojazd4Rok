/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadwozie;

/**
 *
 * @author Michał
 */



/*
 KostkaPluszowa,

 ChoinkaZapachowa

 ChromowanaNakladkaNaPedal

 Dodatki(KostkaPluszowa, 3x ChromowanaNakladkaNaPedal, ChoinkaZapachowa)


*/
public class Dodatki
{
    
   private Dodatki kostka_pluszowa;
   private Dodatki choinka_zapachowa;
   private Dodatki[] chromowana_nakladka_na_pedal;
   
   
   //konttruktor
   public Dodatki()
   {        
       kostka_pluszowa = new Dodatki();
       choinka_zapachowa = new Dodatki();
       
       chromowana_nakladka_na_pedal = new Dodatki[2];
        for (int i=0; i<4; i++) {
           chromowana_nakladka_na_pedal[i]=new Dodatki();
        }//for
       
       System.out.println("utworzono dodatki");
   }
   
   
    
    
}
