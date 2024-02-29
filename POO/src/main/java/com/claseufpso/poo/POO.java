
package com.claseufpso.poo;

import people.Character;
public class POO {

    public static void main(String[] args) {
      Character homero = new Character("HOMERO" , 39 , 'M', "a la grande le puse cuca");
      Character lisa = new Character("LISA" , 8 , 'f', "baaaaaaaaaart!");
      Character bart = new Character("BART" , 10 , 'M' , "AY CARAMBA");
      
      
      homero.saySomething();
      lisa.saySomething();
      bart.saySomething();
      
      Character apu = new Character ();
        apu.setName("apu");
        apu.setFrase("vuelvas prontos");
    
        
        apu.saySomething();
    }
   }

