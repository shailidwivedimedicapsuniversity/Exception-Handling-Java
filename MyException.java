// If exception will handle then flow of program will be maintained
// don't need to use finally unnecessary and never handle exception in finally 
// new updates, try catch resource and multicatch
public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws MyException {
        Student.pass(20);
    }

}


class Student{
    static void pass(int marks) throws MyException{
        if(marks < 33){
            throw new MyException("Oh no! you are failed. Don't worry Best of luck for next time .. ");
        }
    }
}