package ubungsblatt1;

public class Test {

	public static void main(String[] args) {

		// Bock A
		{
			int x = 5;
			int y = 5;

			// Block B
			{
				float f = 5.0f;
				float g = 5.0f;
				x = 20;
				// Initialisieren der Variablen in Block B, damit man diese nicht nur in C verwenden kann
				//z als float, wegen dem zugewiesenen Wert. Alternativ Typecast
			
				float z;
				float h;

				// Block C
				{
					//Initialiserung beibehaltbar, wenn nicht vohrher, sondern nacher in B initialisert und deklariert
					/* int */ z = 5;
					/* float */ h = -5.0f;

					y = 3000;
				}
				h = 5.0f;
				z = 4.0f;
			}
		}
	}

}