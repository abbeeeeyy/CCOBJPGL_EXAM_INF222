package Locations;

import Tourist.*;

public class Palawan implements Locations{

    int airFare = 250;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getairFare() {
        return airFare;
    }
    
}
