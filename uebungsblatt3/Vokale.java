package uebungsblatt3;

import java.util.Scanner;

public class Vokale {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char c = 'j';
		int i = 0;

		do {
			System.out.println("Bitte Satz eingeben");
			String satz = sc.nextLine();
			int aCounter = 0, eCounter = 0, iCounter = 0, oCounter = 0, uCounter = 0, boiCounter = 0;
			while (i < satz.length()) {
				c = satz.charAt(i++);
				switch (c) {
				case 'A':
				case 'a': {
					aCounter++;
					break;
				}
				case 'E':
				case 'e': {
					eCounter++;
					break;
				}
				case 'I':
				case 'i': {
					iCounter++;
					break;
				}
				case 'O':
				case 'o': {
					oCounter++;
					break;
				}
				case 'U':
				case 'u': {
					uCounter++;
					break;
				}
				default:
					boiCounter++;
				}
				c = satz.charAt(0);
			}
			System.out.println("a:" + aCounter + "\ne:" + eCounter + "\ni:" + iCounter + "\no:" + oCounter + "\nu:"
					+ uCounter + "\nKons. u. Sonderzeichen:" + boiCounter + "\nBeenden(j oder n)");
		} while (c != 'j');

		sc.close();
	}

}
