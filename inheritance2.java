class vehicle{
    
    int price;
    double mileage;
    String color;

    void display(){
        System.out.println("price: "+price);
        System.out.println("mileage: "+ mileage);
        System.out.println("color" + color);
    }
        
}

class car extends vehicle{
    String ftype;
    boolean sunroof;
    String brand ;

    
}
        
public class inheritance2 {
    public static void main(String[] args){
        car car1 = new car();
        car1.brand = "Suzuki";
        car1.price = 15800000;
        car1.mileage = 18.3;
        car1.ftype ="Disel";
        car1.color ="blue";
        car1.sunroof = true ;
        car1.display();
        System.out.println("sunroof : "+ car1.sunroof);

        
    }           
}
