package airport.models;


public class Airport {
    //variabelen
    private String city;
    private Airplane[] airplanes;

    public Airport(String city, Airplane[] airplanes) {
        this.city = city;
        this.airplanes = airplanes;
    }

    //methodes
    public void printAllAirplanes() {
        for (int i = 0; 1 < airplanes.length; i++) {
            System.out.println(this.airplanes[i]);
        }
    }


    //Requesting a people plane that does not fly and has room for passengers
    public PeoplePlane AvailableAndRoomAirplane() {
        for (int i = 0; i < airplanes.length; i++) {
            PeoplePlane peoplePlane;

            if (this.airplanes[i] instanceof PeoplePlane) {
                peoplePlane = (PeoplePlane) this.airplanes[i];
            } else {
                continue;
            }

            if (peoplePlane.availableAirplane()) {
                System.out.println("People airplane " + peoplePlane.planeID + " is requested. " +
                        "Is not flying, still room for " + peoplePlane.stillRoomForPassengers() + " passengers.");
                return peoplePlane;
            }
        }
        return null;
    }

    //Requesting a cargo plane that does not fly and has room for tonnen
    public CargoPlane AvailableAndTonnenCargoAirplane() {
        for (int i = 0; i < airplanes.length; i++) {
            CargoPlane cargoPlane;

            if (this.airplanes[i] instanceof CargoPlane) {
                cargoPlane = (CargoPlane) this.airplanes[i];
            } else {
                continue;
            }

            if (cargoPlane.availableAirplane()) {
                System.out.println("Cargo airplane " + cargoPlane.planeID + " is requested. " +
                        "Is not flying, still room for " + cargoPlane.stillRoomForTonnen() + " tonnen.");
                return cargoPlane;
            }
        }
        return null;
    }

    //Requesting a Space plane that does not fly
    public SpacePlane AvailableforFlying() {
        for (int i = 0; i < airplanes.length; i++) {
            SpacePlane spacePlane;
            if (this.airplanes[i] instanceof SpacePlane) {
                spacePlane = (SpacePlane) this.airplanes[i];
            } else {
                continue;
            }
            if (spacePlane.availableAirplane()) {
                System.out.println("Space airplane " + spacePlane.planeID + " is requested.");
                return spacePlane;
            }
        }
        return null;
    }
}












