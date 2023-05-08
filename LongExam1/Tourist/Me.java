package Tourist;

import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");   
    }

    public void visit(Boracay boracay) {
        if (budget >= boracay.getairFare()) {
            budget -= boracay.getairFare();
            System.out.println("My name is Abbey and I am enjoying my stay in Boracay XD");
        } else {
            System.out.println("My name is Abbey and I can't visit Boracay T^T");
        }
        checkBudget();
    }

    public void visit(Baguio baguio) {
        if (budget >= baguio.getairFare()) {
            budget -= baguio.getairFare();
            System.out.println("My name is Abbey and I am enjoying my stay in Baguio XD");
        } else {
            System.out.println("My name is Abbey and I can't visit Baguio T^T");
        }
        checkBudget();
    }

    public void visit(Cebu cebu) {
        if (budget >= cebu.getairFare()) {
            budget -= cebu.getairFare();
            System.out.println("My name is Abbey and I am enjoying my stay in Cebu XD");
        } else {
            System.out.println("My name is Abbey and I can't visit Cebu T^T");
        }
        checkBudget();
    }

    public void visit(Tagaytay tagaytay) {
        if (budget >= tagaytay.getairFare()) {
            budget -= tagaytay.getairFare();
            System.out.println("My name is Abbey and I am enjoying my stay in Tagaytay XD");
        } else {
            System.out.println("My name is Abbey and I can't visit Tagaytay T^T");
        }
        checkBudget();
    }

    public void visit(Palawan palawan) {
        if (budget >= palawan.getairFare()) {
            budget -= palawan.getairFare();
            System.out.println("My name is Abbey and I am enjoying my stay in Palawan XD");
        } else {
            System.out.println("My name is Abbey and I can't visit Palawan T^T");
        }
        checkBudget();
    }

    public void visit(Vigan vigan) {
        if (budget >= vigan.getairFare()) {
            budget -= vigan.getairFare();
            System.out.println("My name is Abbey and I am enjoying my stay in Vigan XD");
        } else {
            System.out.println("My name is Abbey and I can't visit Vigan T^T");
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("My budget is " + budget);
        if (budget <= 0) {
            System.out.println("I am out of budget.");
        }
    }
}
