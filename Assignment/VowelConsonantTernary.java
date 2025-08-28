import java.util.Scanner;

public class VowelConsonantTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                        ? "Vowel" 
                        : ((ch >= 'a' && ch <= 'z') ? "Consonant" : "Invalid input");

        System.out.println(result);

        sc.close();
    }
}
