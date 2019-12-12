package airport.models;

public class SpacePlane extends Airplane implements Straalmotor, Raketten {
    protected SpacePlane(String planeID) {
        super(planeID);
    }

    @Override
    public void takeOff() {
        if (isFlying) {
            System.out.println("Space plane " + planeID + " can not take off, because it is already flying!");
        } else {
            this.Starten();
            System.out.println("Space plane " + planeID + " takes off!");
            this.NemenOver();
        }
        isFlying = true;
    }


    @Override
    public void land() {
        if (isFlying == true) {
            System.out.println("Space plane " + planeID + " lands!");
        } else {
            System.out.println("Space plane " + planeID + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }

    @Override
    public boolean availableAirplane() {
        if (isFlying == false) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void NemenOver() {
        System.out.println("Raketten nemen over.");

    }

    @Override
    public void Starten() {
        System.out.println("Motor wordt gestart.");

    }
}
