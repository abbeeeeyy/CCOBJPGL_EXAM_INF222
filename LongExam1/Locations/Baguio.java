package Locations;

import Tourist.*;

public class Baguio implements Locations {

    int airFare = 500;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getairFare() {
        return airFare;
    }
}
