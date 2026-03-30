class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Doctor extends Person{
    String Spec;

    Doctor(String name,int age,String Spec){
        super(name,age);
        this.Spec=Spec;
    }

    void displaydoc(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(Spec);
    }
}

class Surgeon extends Doctor{
    String type;

    Surgeon(String name,int age,String Spec,String type){
        super(name,age,Spec);
        this.type=type;
    }

    void displays(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(Spec);
        System.out.println(type);
    }
}

public class iHTL {
    public static void main(String[] args){
        Surgeon s=new Surgeon("Alice",45,"Cardiology","Heart Surgery");
        s.displays();
    }
}
