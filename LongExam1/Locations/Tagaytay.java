package Locations;

import Tourist.*;

public class Tagaytay implements Locations {

    int airFare = 100;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getairFare() {
        return airFare;
    }
    
}
