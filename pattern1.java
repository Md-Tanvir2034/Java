import java.util.*;


public class pattern1 {

    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);

        System.out.println("Enter your reactanle row size:");
        int row = sc.nextInt() ;
        System.out.println("column size:  ");
        int column= sc.nextInt();

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
