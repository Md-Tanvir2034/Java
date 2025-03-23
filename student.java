public class student {
    static int x;
    int roll = 22 ;
    int nextRoll = roll + 1;

    void display(){
        int a ;
        a = 67 ;
        System.out.println("roll no is: " + roll);
        System.out.println("a= "+ a);
        System.out.println("Next roll is : "+ nextRoll);
    }

    public static void  main(String[] args){
        student obj = new student();
        System.out.println("obj using instance varable :  "+obj.roll);
        System.out.println("static without assigning value : " + obj.x);
        obj.display();
        
    }
    
}
