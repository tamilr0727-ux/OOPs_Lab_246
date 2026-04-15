import java.util.Scanner;
public class Students {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter How many Students?");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println();
            System.out.println("Student:"+i);
            System.out.print("Enter English Marks:");
            int eng=sc.nextInt();
            System.out.print("Enter Mathematics Marks:");
            int mat=sc.nextInt();
            System.out.print("Enter Physics Marks:");
            int phy=sc.nextInt();
            System.out.print("Enter Chemistry Marks:");
            int che=sc.nextInt();
            System.out.print("Enter Computer Science Marks:");
            int com=sc.nextInt();
            int sum=(com+phy+che+eng+mat);
            double avg=sum/5;

            if (avg>=90){
                System.out.println("Student Grade:A");
            }
            else if (avg>=80 && avg<90){
                System.out.println("Student Grade:B");
            }
            else if (avg>=70 && avg<80){
                System.out.println("Student Grade:C");
            }
            else if (avg>=55 && avg<70){
                System.out.println("Student Grade:D");
            }
            else{
                System.out.println("Student Grade:F");
            }
        }

    }
}
