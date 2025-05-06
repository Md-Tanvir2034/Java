public class PassengerAirliner extends AirTransporter {

    private int passengerCapacity;

    public PassengerAirliner(){};
    public PassengerAirliner(String manufacturer, double maxAltitude, double maxSpeed, int passengerCapacity){
        super(manufacturer , maxAltitude , maxSpeed);
        setPassengerCapacity(passengerCapacity);
    }
   
    public void setPassengerCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }


    public int getPassengerCapacity(){
        return passengerCapacity;
    }
    
    public void showDetails(){
        super.showDetails();
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
}
