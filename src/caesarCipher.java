import java.util.Scanner;
import static java.lang.System.err;
import static java.lang.System.out;

public class caesarCipher {
	@SuppressWarnings("ReassignedVariable")
	public static void main(String[] args) {
		
		var input = new Scanner(System.in);
		
		out.println("\nEnter text to encode or decode: ");
		var text = input.nextLine();
		
		out.println("Enter the key (0 to 26): ");
		var key = input.nextInt();
		
		while (key < 0 || key > 26) {
			err.println("Key must be between 0 and 26. Enter again: ");
			key = input.nextInt();
		}
		
		out.println("\nEncrypt or Decrypt (e/d)?");
		var choice = input.next().toLowerCase();
		switch (choice) {
			case "e" -> new encrypt(text, key);
			case "d" -> new decrypt(text, key);
			default -> err.println("Invalid choice!");
		}
	}
}
