
package people;


public class Character {
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
        
        public Character(){}
        
        
    
       public void saySomething(){
            System.out.println(this.frase + " " + this.name + " " + this.gender + " " + this.age);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
       
        
}
