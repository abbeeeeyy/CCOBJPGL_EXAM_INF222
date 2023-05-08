import Locations.*;
import Tourist.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locations boracay = new Boracay();
        Locations baguio = new Baguio();
        Locations cebu = new Cebu();
        Locations tagaytay = new Tagaytay();
        Locations palawan = new Palawan();
        Locations vigan = new Vigan();


        Tourist abbey = new Me();

        boracay.accept(abbey);
        baguio.accept(abbey);
        cebu.accept(abbey);
        tagaytay.accept(abbey);
        palawan.accept(abbey);
        vigan.accept(abbey);

        abbey.checkBudget();
    }
}
