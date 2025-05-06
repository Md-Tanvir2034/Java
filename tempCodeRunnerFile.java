class Test {
    static {
        System.out.println("Static block executed!");
    }

    Test() {
        System.out.println("Constructor called.");
    }
}

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        Test obj = new Test(); 
    }
}