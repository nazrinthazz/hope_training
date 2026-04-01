class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg) {
        super(msg);
    }
 
}

public class ManualException {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age is less than 18");

        }else{
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args){
        try {
            checkAge(18);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
