class Mobile {
    private String model;                  // Instance variable
    private static int totalMobiles = 0;   // Static variable to count all mobiles

    // Constructor
    public Mobile(String model) {
        this.model = model;
        totalMobiles++; // Increment counter whenever a new mobile is added
    }

    // Getter
    public String getModel() {
        return model;
    }

    // Static method to show total mobiles
    public static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }
}

public class MobileTest {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung Galaxy M32");
        Mobile mobile2 = new Mobile("Redmi Note 12");

        // Print each mobile model
        System.out.println("Mobile1 model: " + mobile1.getModel());
        System.out.println("Mobile2 model: " + mobile2.getModel());

        // Print total mobiles
        Mobile.showTotalMobiles();
    }
}
