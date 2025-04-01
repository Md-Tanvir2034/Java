class A{
    void methodA(){
        System.out.println("method of A class");
    }

}

class B extends A{
    void methodB(){
        System.out.println("method of B class");
    }

}

class C extends B{
    void methodC(){
        System.out.println("method of C class");
    }

}

public class multilevel_inheritance {
    public static void main(String [] args ){
        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodC();
    }
    
}
