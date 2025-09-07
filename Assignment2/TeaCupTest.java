class TeaCup {
    private String teaType;            
    private static int totalCups = 0; 

    // Constructor
    public TeaCup(String teaType) {
        this.teaType = teaType;
        totalCups++; 
    }

    // Getter
    public String getTeaType() {
        return teaType;
    }

    // Static method to show total cups
    public static void showTotalCups() {
        System.out.println("Total cups made: " + totalCups);
    }
}

public class TeaCupTest {
    public static void main(String[] args) {
        TeaCup cup1 = new TeaCup("Masala Tea");
        TeaCup cup2 = new TeaCup("Green Tea");
        TeaCup cup3 = new TeaCup("Ginger Tea");

        // Print each cup type
        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());

        // Print total cups
        TeaCup.showTotalCups();
    }
}
