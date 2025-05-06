class Test {
    static { System.out.print("A "); }
    { System.out.print("B "); }
    Test() { System.out.print("C "); }
}

public class practice {

    public static void main(String[] args) {
        new Test();
    }
    
}


