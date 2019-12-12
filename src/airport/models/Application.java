package airport.models;

public class Application {

    public static void main(String[] args) {
        Airplane[] airplanes = new Airplane[]{
                new PeoplePlane("ABC123"),
                new PeoplePlane("DDD888"),
                new PeoplePlane("ODL345"),
                new CargoPlane("FF2134"),
                new CargoPlane("PLA166"),
                new SpacePlane("XYZ789"),
        };

        System.out.println("Welcome to the Airport Schiphol!");

        /*ABC123.loadPassengers(80);
        ABC123.land();
        ABC123.takeOff();
        DDD888.loadPassengers(23);
        DDD888.takeOff();
        ABC123.land();
        ABC123.unloadPassengers();
        DDD888.takeOff();
        DDD888.land();
        DDD888.unloadPassengers();
        DDD888.loadPassengers(38);
        ODL345.loadPassengers(6);*/
//        ABC123.loadPassengers(63);
//        PLA166.takeOff();
//        FF2134.loadTonnen(20);

        Airport airport = new Airport("Schiphol", airplanes);

        System.out.println("");

        PeoplePlane peoplePlane1 = airport.AvailableAndRoomAirplane();
        peoplePlane1.loadPassengers(63);
        peoplePlane1.takeOff();
        System.out.println(peoplePlane1);

        System.out.println("");

        PeoplePlane peoplePlane2 = airport.AvailableAndRoomAirplane();
        peoplePlane2.loadPassengers(42);
        peoplePlane2.takeOff();
        System.out.println(peoplePlane2);

        System.out.println("");

        PeoplePlane peoplePlane3 = airport.AvailableAndRoomAirplane();
        System.out.println(peoplePlane3);

        System.out.println("");

        CargoPlane cargoPlane1 = airport.AvailableAndTonnenCargoAirplane();
        cargoPlane1.takeOff();
        cargoPlane1.land();
        System.out.println(cargoPlane1);


        CargoPlane availableCargoPlane = airport.AvailableAndTonnenCargoAirplane();
        availableCargoPlane.loadTonnen(20);

        System.out.println(peoplePlane1);
        System.out.println(availableCargoPlane);

        SpacePlane availableSpacePlane = airport.AvailableforFlying();
        availableSpacePlane.takeOff();
        availableSpacePlane.takeOff();

    }
}
