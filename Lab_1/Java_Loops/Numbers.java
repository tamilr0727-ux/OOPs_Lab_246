import java.util.Scanner;
public class Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.print("Enter a Number:");
            int n=sc.nextInt();
            System.out.println();
            System.out.println("Operations");
            System.out.println("1.To find Odd/Even.");
            System.out.println("2.To find its divisibility.");
            System.out.println("3.Exit");

            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    if (n%2==0){
                        System.out.println("It is a EVEN Number.");
                    }
                    else{
                        System.out.println("It is a ODD Number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the Number to check its divisibility:");
                    int c=sc.nextInt();
                    if (n%c==0){
                        System.out.println("The Number "+n+" is divisible by "+c);
                    }
                    else{
                        System.out.println("The Number "+n+" is not divisible by "+c);
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid Operation.");
            }
        }
    }
}
