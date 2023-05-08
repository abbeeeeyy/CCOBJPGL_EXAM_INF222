package Tourist;

import Locations.*;
import Locations.Boracay;
import Locations.Baguio;
import Locations.Cebu;
import Locations.Palawan;
import Locations.Tagaytay;
import Locations.Vigan;


public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Baguio baguio);

    void visit(Cebu cebu);

    void visit(Tagaytay tagaytay);

    void visit(Palawan palawan);

    void visit(Vigan vigan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    }

    void checkBudget();

}
