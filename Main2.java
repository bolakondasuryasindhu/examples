abstract class HillStations {
    // Abstract methods to be implemented by subclasses
    abstract void location();
    abstract void famousfor();
}

// Define the Manali class that extends HillStations
class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }

    @Override
    void famousfor() {
        System.out.println("Manali is famous for adventure sports");
    }
}

// Define the Mussoorie class that extends HillStations
class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    @Override
    void famousfor() {
        System.out.println("Mussoorie is famous for beautiful landscapes");
    }
}

// Define the Gulmarg class that extends HillStations
class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }

    @Override
    void famousfor() {
        System.out.println("Gulmarg is famous for resorts and beautiful meadows");
    }
}

// Main class to test the functionality
public class Main2{
    public static void main(String[] args) {
        // Create an instance of Manali
        HillStations hillStation1 = new Manali();
        hillStation1.location();
        hillStation1.famousfor();

        // Create an instance of Mussoorie
        HillStations hillStation2 = new Mussoorie();
        hillStation2.location();
        hillStation2.famousfor();

        // Create an instance of Gulmarg
        HillStations hillStation3 = new Gulmarg();
        hillStation3.location();
        hillStation3.famousfor();
    }
}
