import java.util.*;

class side{
    private int x;
    private int y;
    private int z;
    
    public side(){
        System.out.println("E-constructor called");
     }
     
    public side(int x , int y , int z){
      System.out.println("P-constructor called");
      setx(x);
      sety(y);
      setz(z);
     }

    public void setx(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }

    public void sety(int y){
        this.y=y;
    }
    public int gety(){
        return y ;
    }

    public void setz(int z){
        this.z=z;
    }
    public int getz(){
        return z;
    }
    
    public void showdDetails(){
        if(x==y && y==z && z==x){
            System.out.println("The triangle is equilateral");
        }
        else if(x==y || y==x || z == x){
            System.out.println("The triangle is isoscales");
        }
        else{
            System.out.println("The triangle is scalene");
        }

        System.out.println("--------------------");

    }

}


public class triangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of sides : ");
        
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
       
        side triangle1 = new side(x , y , z);
        triangle1.showdDetails();

        side triangle2 = new side();
        //don's use show details , because it java has by default variable value 0 , because of that it will give equilateral. could be solve using condition 


    }
}
