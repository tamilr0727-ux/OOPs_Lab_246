import java.util.Scanner;
public class jump{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Number:");
        int n1=sc.nextInt();
        System.out.print("Enter End Point:");
        int n2=sc.nextInt();
        System.out.print("Enter the Number which need not to be printed:");
        int n=sc.nextInt();
        for (int i=n1;i<=n2;i++){
            if (i==n){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}