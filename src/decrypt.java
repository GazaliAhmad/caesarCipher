import org.jetbrains.annotations.NotNull;

public class decrypt {
	@SuppressWarnings("ReassignedVariable")
	decrypt(@NotNull String text, int key) {
		var decryptedText = new StringBuilder();
		
		var i = 0;
		while (i < text.length()) {
			var ch = text.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					var c = (char) (ch - key);
					if (c < 'A') decryptedText.append((char) (ch + (26 - key)));
					else decryptedText.append(c);
				} else if (Character.isLowerCase(ch)) {
					var c = (char) (ch - key);
					if (c < 'a') decryptedText.append((char) (ch + (26 - key)));
					else decryptedText.append(c);
				}
			} else decryptedText.append(ch);
			i++;
		}
		System.err.println("Decrypted text is: " + decryptedText);
	}
}