package Locations;

import Tourist.*;

public class Boracay implements Locations {

    int airFare = 100;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getairFare() {
        return airFare;
    }
}
