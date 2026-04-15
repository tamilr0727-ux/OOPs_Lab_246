class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs generally Bark.");
    }
}

public class inheritance{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
