import java.io.FileReader;

public class ExceptionHandling{
    public static void main(String[] args) {
        System.out.println(12);
        try{
            FileReader f = new FileReader("a.txt");
        }catch(Exception e){
            System.out.println("file not found and this exception occurs : " + e.getLocalizedMessage());
        }
        finally{
            System.out.println("hello , I am implementing exception handling in java ");
        }
        System.out.println(13);

    }
}