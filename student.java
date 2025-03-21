public class student {
    int roll = 22 ;

    void display(){
        int a ;
        a = 67 ;
        System.out.println("roll no is: " + roll);
        System.out.println("a= "+ a);
    }

    public static void  main(String[] args){
        student obj = new student();
        System.out.println(obj.roll);
        obj.display();
    }
    
}
