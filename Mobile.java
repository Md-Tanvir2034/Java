
class mobileModel {
    private String mobileOwnerName;
    private String mobileNumber;
    private Double mobileBalance;
    private String mobileOSName;
    private boolean lock;
    
 
    public mobileModel() {
       System.out.println("E-constructor");
       this.mobileOwnerName = "unknown";
       this.mobileBalance = 0.0 ;
       this.mobileNumber="xxxxxxxxxxx";
       this.mobileOSName ="unknown";
    }
 
    public mobileModel(String mobileOwnerName, String mobileNumber, double mobileBalance, String mobileOSName, boolean lock) {
       System.out.println("p-constructor");
       this.setmobileOwnerName(mobileOwnerName);
       this.setmobileNumber(mobileNumber);
       this.setmobileBalance(mobileBalance);
       this.setmobileOSName(mobileOSName);
       this.setlock(lock);
       
    }
 
    public void setmobileOwnerName(String mobileOwnerName) {
       this.mobileOwnerName = mobileOwnerName;
    }
 
    public String getmobileOwnerName() {
       return this.mobileOwnerName;
    }
 
    public void setmobileNumber(String mobileNumber) {
       this.mobileNumber = mobileNumber;
    }
 
    public String getmobileNumber() {
       return this.mobileNumber;
    }
 
    public void setmobileBalance(double mobileBalance) {
       this.mobileBalance = mobileBalance;
    }
 
    public double getmobileBalance() {
       return this.mobileBalance;
    }
 
    public void setmobileOSName(String mobileOSName) {
       this.mobileOSName = mobileOSName;
    }
 
    public String getmobileOSName() {
       return this.mobileOSName;
    }
 
    public void setlock(boolean lock) {
       this.lock = lock;
    }
 
    public boolean getlock() {
       return this.lock;
    }
    
    public void showdDetails() {
        if(lock == false){
            System.out.println("--------");
            System.out.println("mobile owner name : " + this.mobileOwnerName);
            System.out.println("mobile number : " + this.mobileNumber);
            System.out.println("mobile balance " + this.mobileBalance);
            System.out.println("mobile OS name: " + this.mobileOSName);
       
        }

            else{            
                System.out.println("Your mobile is locked.");
            }
    }
 
    public void recharge(int amount){
        if(lock== false){
            mobileBalance += amount ;
            System.out.println("Recharged : "+ amount + " . New Balance : " + mobileBalance);
        }

        else{
            
            System.out.println("Your mobile is locked. Can not recharge");
        }

    }

    public float adjustAfterCall(float timeDuration, float costPerMinute){
        if(lock == false){
            float cost = timeDuration * costPerMinute ;
            mobileBalance -= cost ;
            System.out.println("Call cost : " + cost + " . Remaining Balance : " + mobileBalance);
            
            return cost ;
         }

        else{
           
            System.out.println("Your mobile is locked. Can not make a call. ");

            return 0 ;
        }
     }
    
}
 
 

public class Mobile {
    public static void main(String[] args) {
        mobileModel mobileModel1 = new mobileModel();
        mobileModel1.showdDetails();
        mobileModel1.recharge(50);
        mobileModel1.adjustAfterCall(1.5f , 2.0f);
        
        mobileModel mobileModel2 = new mobileModel("Tanvir" , "01630104619" , 60 , "Andriod" , false) ;
        mobileModel2.showdDetails();
        mobileModel2.recharge(60);
        mobileModel2.adjustAfterCall(5f , 5.0f);

        mobileModel mobileModel3 = new mobileModel("Mahmud" , "01730104619" , 60 , "IOS" , false);
        mobileModel3.showdDetails();
        mobileModel3.recharge(70);
        mobileModel3.adjustAfterCall(20f , 2.0f);
        float callCost = mobileModel3.adjustAfterCall(20f , 2f);
        System.out.println("Mahmud call cost : " + callCost);
        
        mobileModel mobileModel4 = new mobileModel("Soyad" , "01942104619" , 60 , "HyperOS" , true);
        mobileModel4.showdDetails();
        mobileModel4.recharge(50);
        mobileModel4.adjustAfterCall(5.5f , 2.0f);
       
      }
    
}
