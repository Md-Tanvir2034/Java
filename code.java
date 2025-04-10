class head{
    static int x = 5 ;
    int y ;

    public head(int y){
        this.y = y + x ;

        x+=2 ;

    }
  public void show(){
    System.out.println("x : " + x + " , y : " + y );
  }    
}


public class code {
    public static void main(String[] args) {
        head h1 = new head(0);
        
        h1.show();
        head h2 = new head(0);
        //h2.show();
    }
    
}
