import java.io.*;

public class createFile {
    public static void main(String[] args){
        try{
            File file=new File("sample1.txt");
            FileWriter writer=new FileWriter("sample1.txt");

            writer.write("Hello this is Java File.");
            writer.close();
        }catch(IOException e){
            System.out.println("An Error");
        }
    }
}
