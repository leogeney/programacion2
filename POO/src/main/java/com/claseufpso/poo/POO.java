
package com.claseufpso.poo;


public class POO {

    public static void main(String[] args) {
      Character homero = new Character("HOMERO" , 39 , 'M', "a la grande le puse cuca");
      Character lisa = new Character("LISA" , 8 , 'f', "baaaaaaaaaart!");
      Character bart = new Character("BART" , 10 , 'M' , "AY CARAMBA");
      
      
      homero.saySomething();
      lisa.saySomething();
      bart.saySomething();
    }
    
    static class Character{
        
    String name;
    int age;
    char gender;
    String frase;

        public Character(String name, int age, char gender, String frase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.frase = frase;
            
        }
    
    
        void saySomething(){
            System.out.println(this.frase + " " + this.name + " " + this.gender + " " + this.age);
        }
        
        
    
    }
}
