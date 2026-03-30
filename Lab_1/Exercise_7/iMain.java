class Person{
    String name;

    Person(String name){
        this.name=name;
    }

    void disname(){
        System.out.println(name);
    }
}

class Student extends Person{
    int age;

    Student(String name,int age){
        super(name);
        this.age=age;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}
public class iMain {
    public static void main(String[] args){
        Student s1=new Student("Arjun",99);
        s1.disname();
        s1.display();
    }
}
