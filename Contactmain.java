class contact {
    private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;


    public contact() {
        System.out.println("E-constructor");
        
     }
  
     public contact(String personName, String personId, int age, String mobileNumber , char gender) {
        System.out.println("p-constructor");
        this.setpersonName(personName);
        this.setpersonId(personId);
        this.setage(age);
        this.setmobileNumber(mobileNumber);
        this.setgender(gender);
       
     }
  
     public void setpersonName(String personName) {
        this.personName = personName;
     }
  
     public String getpersonName() {
        return this.personName;
     }
  
     public void setpersonId(String personId) {
        this.personId = personId;
     }
  
     public String getpersonId() {
        return this.personId;
     }
  
     public void setage(int age) {
        this.age = age;
     }
  
     public int getage() {
        return this.age;
     }
  
     public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber ;
        
     }
  
     public String getmobileNumber() {
        return this.mobileNumber;
     }
     
     public void setgender(char gender) {
        this.gender = gender ;
        
     }
  
     public char getgender() {
        return this.gender;
     }

  
     public void showdDetails() {
        System.out.println("--------");
        System.out.println("person Name : " + this.personName);
        System.out.println("person Id : " + this.personId);
        System.out.println("age : " + this.age);
        System.out.println("mobile number : " + this.mobileNumber);
        System.out.println("gender : " + this.gender);


  
     }

     public void showOperator(){

      if (mobileNumber == null){
         System.out.println("Invalid number");
      }

      else{
         String first3Digit = mobileNumber.substring(0,3) ;
         if(first3Digit.equals("017")){
            System.out.println("Operator: GP");
         }

         else if(first3Digit.equals("018")){
            System.out.println("Operator: ROBI");
         }

         else if(first3Digit.equals("016")){
            System.out.println("Operator: AIRTEL");
         }
         else if(first3Digit.equals("019")){
            System.out.println("Operator: BANGLALINK");
         }
         else{ System.out.println("Invalid number");}
      }
   }
    
    
}

public class Contactmain {
    public static void main(String[] args) {
        contact contact1 = new contact();
        contact1.showdDetails();
        contact1.showOperator();

        contact contact2 = new contact("oishik" , "24-60391-3" , 21 , "01740294619" , 'M');
        contact2.showdDetails();
        contact2.showOperator();

        contact contact3 = new contact("Mikasa" , "24-60392-3" , 25 , "01830104619" , 'F');
        contact3.showdDetails();
        contact3.showOperator();

        contact contact4 = new contact("Tanvir" , "24-60390-3" , 20 , "01630104619" , 'M');
        contact4.showdDetails();
        contact4.showOperator();
    }
    
}
