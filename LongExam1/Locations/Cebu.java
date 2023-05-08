package Locations;

import Tourist.*;

public class Cebu implements Locations {

    int airFare = 300;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getairFare() {
        return airFare;
    }
    
}
