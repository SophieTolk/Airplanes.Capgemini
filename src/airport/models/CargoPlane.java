package airport.models;

public class CargoPlane extends Airplane implements Propellor{
    //variables
    private int maxTonnen = 35;
    private int currentTonnen;
    private boolean isFlying;

    public CargoPlane(String planeID) {
        super(planeID);
    }

    @Override
    public void takeOff() {
        if (isFlying) {
            System.out.println("Cargo plane " + planeID + " can not take off, because it is already flying!");
        } else {
            this.Aandraaien();
            System.out.println("Cargo plane " + planeID + " takes off!");
        }
        isFlying = true;
    }

    @Override
    public void land() {
        if (isFlying == true) {
            System.out.println("Cargo plane " + planeID + " lands!");
        } else {
            System.out.println("Cargo plane " + planeID + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }

    //is vliegtuig available
    public boolean availableAirplane() {
        if (isFlying == false && this.currentTonnen < this.maxTonnen) {
            return true;
        } else {
            return false;
        }
    }

    public void unloadTonnen() {
        System.out.println("Cargo airplane " + planeID + " unloads " + currentTonnen + " tonnen!");
        currentTonnen = 0;
    }


    public void loadTonnen(int toLoad) {
        currentTonnen = currentTonnen + toLoad;
        if (currentTonnen > maxTonnen) {
            System.out.println("Cargo airplane " + planeID + " charges " + toLoad + " tonnen, " + (currentTonnen - maxTonnen) + " does not fit.");
        } else {
            System.out.println("Cargo airplane " + planeID + " charges " + toLoad + " tonnen.");
        }
    }

    public int stillRoomForTonnen() {
        return (maxTonnen - currentTonnen);
    }

    @Override
    public String toString() {
        return "CargoAirplane{" +
                "maxTonnen=" + maxTonnen +
                ", currentTonnen=" + currentTonnen +
                ", isFlying=" + isFlying +
                ", planeID='" + planeID + '\'' +
                '}';
    }

    @Override
    public void Aandraaien() {
        System.out.println("Propellor wordt aangedraaid.");
    }
}