package Model;

interface Hero {

    public abstract void identify(String alert);
}

class Batman implements Hero {

    @Override
    public void identify(String alert) {
        System.out.println("It's Batman - Beeep Beep");
    }

}

class Joker implements Hero {         //factory boss

    private Batman bat;     //Real one 

    private String outfit;       //identified Factor

    public Joker(String outfit) {
        this.outfit = outfit;         // Remove & check materials
        this.bat = new Batman();   // Give me real one 
    }

    @Override
    public void identify(String alert) {   //bring Complaint
        if (CheckHost()) {          //check real one Boolean True ,
            this.bat.identify(alert);
        } else {
            System.out.println("It's Joker - teeetik");
        }
    }

    //Check Real one Boolean
    private boolean CheckHost() {
        if (outfit.equals("Batman Outfit")) {
            return true;
        } else {
            return false;
        }
    }

}

class Main {

    public static void main(String[] args) {
        if (100 > 70 + 5) {
            Joker fakeone = new Joker("Batman Outfit");
            fakeone.identify("Fake Joker Alert");
        } else {
            Joker fakeone = new Joker("Joker Outfit");
            fakeone.identify("Fake Joker Alert");
        }

    }
}
