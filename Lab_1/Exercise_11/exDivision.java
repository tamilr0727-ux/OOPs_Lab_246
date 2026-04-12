import java.util.Scanner;

public class exDivision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Two Numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        try{
            int c1=n1/n2;
            System.out.println(c1);
        }catch(ArithmeticException e){
            System.out.println("An Error Occured.");
        }

        sc.close();
    }
}
