import java.util.Scanner;

public class exAvg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int sum=0;
        int n1=0;

        try{
            System.out.println("Enter How many Number?");
            int n=sc.nextInt();

            for (int i=0;i<n;i++){
                try{
                    System.out.print("Enter a Number:");
                    n1=sc.nextInt();
                    sum+=n1;
                }catch(Exception e){
                    System.out.println("Invalid Input");
                    sc.next();
                    i--;
                }
            }

            double avg=sum/n;
        }catch(Exception e){
            System.out.println("Enter Valid");
        }
        finally{
            System.out.println("programm Completed.");
        }

        sc.close();

    }
}
