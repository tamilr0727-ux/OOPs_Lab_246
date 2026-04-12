import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class fileread{
    public static void main(String[] args){
        try{
            BufferedReader read=new BufferedReader(new FileReader("User.txt"));
            String line;
            while ((line=read.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("An Error");
        }
    }
}
