import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHandling{
    public static void main(String[] args) {
        System.out.println(12);
        try{
            FileReader f = new FileReader("a.txt");
            BufferedReader bf = new BufferedReader(f);
            String line;
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("file not found and this exception occurs : " + e.getLocalizedMessage());
        }
        finally{
            System.out.println("hello , I am implementing exception handling in java ");
        }
        System.out.println(13);

        // Nested try catch block
        int [] arr = {2,4,5,9};
        try {
            System.out.println(4/0);
            // flow will not go here 
            System.out.println(arr[10]);
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic exception: "+ ae);
        }catch(NullPointerException npe){
            System.out.println("this exception will not occur");
        }catch(ArrayIndexOutOfBoundsException aio){
            System.out.println("ArrayIndexOutofBound : "+ aio);
        }
        catch (Exception e) {
            System.out.println("your exception: " + e);
        }

        // multicatch block java 7, best practice readable 
        try {
            System.out.println(arr[10]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e ){
            System.out.println("exception: "+ e);
        }

        // try with resources - in try block file will autoclose 
        try( FileReader f = new FileReader("a.txt");
        BufferedReader bf = new BufferedReader(f); )
        {      
            String line;
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("file not found and this exception occurs : " + e.getLocalizedMessage());
        }



    }
}