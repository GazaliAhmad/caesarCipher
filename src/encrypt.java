import org.jetbrains.annotations.NotNull;
import static java.lang.System.err;

public class encrypt {
	@SuppressWarnings("ReassignedVariable")
	encrypt(@NotNull String text, int key) {
		var encryptedText = new StringBuilder();
		
		var i = 0;
		while (i < text.length()) {
			var ch = text.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					var c = (char) (ch + key);
					if (c > 'Z') {
						encryptedText.append((char) (ch - (26 - key)));
					} else {
						encryptedText.append(c);
					}
				} else if (Character.isLowerCase(ch)) {
					var c = (char) (ch + key);
					if (c > 'z') encryptedText.append((char) (ch - (26 - key)));
					else encryptedText.append(c);
				}
			} else encryptedText.append(ch);
			i++;
		}
		err.println("Encrypted text is: " + encryptedText);
	}
}