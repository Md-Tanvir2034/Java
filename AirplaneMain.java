public class AirplaneMain{
public static void main(String[] args) {
    PassengerAirliner boeing747 = new PassengerAirliner("Boeing" , 44947 , 988 , 534 );

    boeing747.showDetails();

    CargoAirliner airbus22 = new CargoAirliner();

    airbus22.setManufacturer("Airbus");
    airbus22.setMaxAltitude(30000);
    airbus22.setMaxSpeed(650);
    airbus22.setMaxCargoWeight(10000);
    airbus22.showDetails();
    
}
}