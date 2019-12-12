package airport.models;

public class PeoplePlane extends Airplane implements Straalmotor{
    //variables
    private int maxPassengers = 93;
    private int currentPassengers;

    protected PeoplePlane(String planeID) {
        super(planeID);
    }

    @Override
    public void takeOff() {
        if (isFlying) {
            System.out.println("People plane " + planeID + " can not take off, because it is already flying!");
        } else {
            this.Starten();
            System.out.println("People plane " + planeID + " takes off!");
        }
        isFlying = true;
    }

    @Override
    public void land() {
        if (isFlying == true) {
            System.out.println("People plane " + planeID + " lands!");
        } else {
            System.out.println("People plane " + planeID + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }

    //is vliegtuig available
    public boolean availableAirplane() {
        if (isFlying == false && this.currentPassengers < this.maxPassengers) {
            return true;
        } else {
            return false;
        }
    }

    public void unloadPassengers() {
        System.out.println("People airplane " + planeID + " unloads " + currentPassengers + " passengers!");
        currentPassengers = 0;
    }

    public void loadPassengers(int toLoad) {
        currentPassengers = currentPassengers + toLoad;
        if (currentPassengers > maxPassengers) {
            System.out.println("Airplane " + planeID + " charges " + toLoad + " passengers, " + (currentPassengers - maxPassengers) + " does not fit.");
        } else {
            System.out.println("Airplane " + planeID + " charges " + toLoad + " passengers.");
        }
    }

    public int stillRoomForPassengers() {
        return (maxPassengers - currentPassengers);
    }

    @Override
    public String toString() {
        return "PeoplePlane{" +
                "maxPassengers=" + maxPassengers +
                ", currentPassengers=" + currentPassengers +
                ", isFlying=" + isFlying +
                ", planeID='" + planeID + '\'' +
                '}';
    }

    @Override
    public void Starten() {
        System.out.println("Motor wordt gestart.");
    }
}
