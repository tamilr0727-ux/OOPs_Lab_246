import java.util.Scanner;

class Marks{
    private int[] marks=new int[5];

    void insert(){
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("Enter Mark of Student:"+(i+1));
            int n=sc.nextInt();
            marks[i]=n;
        }
    }

    void display(){
        for (int i=0;i<5;i++){
            System.out.print("Mark of Student"+(i+1)+":");
            System.out.println(marks[i]);
        }
    }
}



public class arrMarks {
    public static void main(String[] args){
        Marks m1=new Marks();

        m1.insert();
        m1.display();
    }
}
