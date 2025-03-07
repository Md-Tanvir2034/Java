import java.util.*;

public class greetings {
    public static void main(String[] args){
        Scanner button = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3:");
        int num = button.nextInt();

        switch(num){
            case 1:
                System.out.println("Hi") ;
                break ;
            case 2: 
                System.out.println("Assalamu Alaikum") ;
                break ;
            case 3: 
                System.out.println("Bonjour") ;
                break ;
            
            default:
                System.out.println("invalid number ") ;
                
        }

           
    }
}
