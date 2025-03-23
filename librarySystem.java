class library {
    private String libraryName ;
    private String location;
    private int totalBooks ;
    private int registerUsers;
    private double memberShipFee;

    public library(){
        System.out.println("E-constructor called");
    }

    public library(String libraryName , String location , int totalBooks , int registerUsers , double memberShipFee){

        System.out.println("P-constructor called");
        setlibraryName(libraryName);
        setlocation(location);
        settotalBooks(totalBooks);
        setregisterUsers(registerUsers);
        setmemberShipFee(memberShipFee);
    }

    public void setlibraryName(String libraryName){
       this.libraryName = libraryName;
    }

    public String getlibraryName(){
        return this.libraryName ;
    }
    
    public void setlocation(String location){
        this.location = location;
     }
 
     public String getlocation(){
         return this.location ;
     }

     public void settotalBooks(int totalBooks){
        this.totalBooks = totalBooks;
     }
 
     public int gettotalBooks(){
         return this.totalBooks ;
     } 
     public void setregisterUsers(int registerUsers){
        this.registerUsers = registerUsers;
     }
 
     public int getregisterUsers(){
         return this.registerUsers ;
     } 

     public void setmemberShipFee(double memberShipFee){
        this.memberShipFee = memberShipFee;
     }
 
     public double getmemberShipFee(){
         return this.memberShipFee ;
     } 

    public void showdDetails(){
        System.out.println("Library Name : " + this.libraryName);
        System.out.println("Location : "+ this.location);
        System.out.println("Total books : " + totalBooks);
        System.out.println("Registered user number : "+ this.registerUsers);
        System.out.println("Membership fee : " + memberShipFee);

    }




}

public class librarySystem {
    public static void main(String[] args){

        library l1 = new library();
        l1.showdDetails();

        library l2 = new library("AIUB library", "Kuril", 42000, 3500, 800.50);
        l2.showdDetails();

    }
    
}
