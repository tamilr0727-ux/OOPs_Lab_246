import java.io.*;
import java.util.Scanner;

public class fileinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            File f1=new File("User.txt");
            FileWriter writer=new FileWriter("User.txt");
            System.out.print("Enter a Sentence:");
            String line=sc.nextLine();

            writer.write(line);

            writer.close();
            sc.close();
        }catch(IOException e){
            System.out.println("An Error");
        }
    }
}
