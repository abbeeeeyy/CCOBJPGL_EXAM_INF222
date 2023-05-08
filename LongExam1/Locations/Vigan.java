package Locations;

import Tourist.*;

public class Vigan implements Locations {

    int airFare = 550;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getairFare() {
        return airFare;
    }
    
}
