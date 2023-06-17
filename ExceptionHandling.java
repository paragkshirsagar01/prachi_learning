import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class demoexp extends Exception{
    demoexp(String msg){
        System.out.println(msg);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) throws demoexp{
        //try catch  finally throws throw
        int x=1;
        if(x==0){
            throw new demoexp("x is 0");
        }
        
        /*try(FileInputStream f=new FileInputStream(new File("C:/Users/parag/Documents/python proj/input.txt"))){
            Scanner s=new Scanner(f);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
        }catch(Exception e){
            System.out.println(e);
        }*/
try(FileOutputStream f=new FileOutputStream(new File("C:/Users/parag/Documents/python proj/input.txt"))){
            String str="acd";
            byte b=1;
            f.write(str.getBytes());
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
