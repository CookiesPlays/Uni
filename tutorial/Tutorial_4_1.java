package tutorial;

import java.util.Arrays;

public class Tutorial_4_1 {

	public static void main(String[] args) {
		
		char[] c = {'a', 'b', 'c', 'd'};
		char[] d = {'x','y'};
		
		//output original arrays
		System.out.println("Orginal Arrays: c:"+ Arrays.toString(c)+"  d:"+Arrays.toString(d));
		
		//Hilfzeiger anlegen und auf Speicher c zeigen lassen
		char[] temp = c;
		//c Zeigt auf Speicher von d
		c = d;	
		//d Zeigt auf Speicher von temp(von c)
		d = temp;
		
		System.out.println("Exchanged Arrays: c:"+Arrays.toString(c)+"  d:"+Arrays.toString(d));
	}

}
