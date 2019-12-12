package airport.models;

import javax.swing.*;
import java.sql.SQLOutput;

public abstract class Airplane {

    //variables
    protected String planeID;
    protected boolean isFlying;

    //Constructors
    protected Airplane(String planeID) {
        this.planeID = planeID;
    }

    //Methods
    public abstract void takeOff();

    public abstract void land();

    public abstract boolean availableAirplane();

    /*public void land() {
        if (isFlying == true) {
            System.out.println("Airplane " + planeID + " lands!");
        } else {
            System.out.println("Airplane " + planeID + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }*/
     /*   // getters&setters
        public String getPlaneID(){
        return planeID;
    }*/
    }
