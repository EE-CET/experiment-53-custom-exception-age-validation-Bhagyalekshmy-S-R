import java.util.Scanner;

 class InvalidAgeException extends Exception{
      public InvalidAgeException(String message){
          super(message);
         }
      }



public class CustomException {
    
     static void  validate(int age) throws InvalidAgeException{
        if(age<18){
              throw new InvalidAgeException("Exception: Not eligible to vote");
             }
         else{
              System.out.println("Eligible to vote");
              }
             }
       public static void main(String[] args){
          
           Scanner sc=new Scanner(System.in);
           int age=sc.nextInt();
         
           try{
              validate(age);
               }
            catch(InvalidAgeException e){
                 System.out.println(e.getMessage());
                }
           sc.close();
        }
    
}
