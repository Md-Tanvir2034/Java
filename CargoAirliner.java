public class CargoAirliner extends AirTransporter{
    private int maxCargoWeight;

    public CargoAirliner(){};
    public CargoAirliner(String manufacturer , double maxAltitude , double maxSpeed , int maxCargoweight){
        super(manufacturer , maxAltitude , maxSpeed);
        setMaxCargoWeight(maxCargoweight);
    }

    public void setMaxCargoWeight(int maxCargoweight){
        this.maxCargoWeight = maxCargoweight;
    }

    public int getMaxCargoWeight(){
        return maxCargoWeight;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("max weight capacity : " + maxCargoWeight + " KG");
    }
    
}
