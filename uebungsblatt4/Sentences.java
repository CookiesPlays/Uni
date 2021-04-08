package uebungsblatt4;

public class Sentences {

	public static void main(String[]args) {
		
		String[] article= {" the" , " a" , " one" , " some" , " any"};
		String[] noun= { " boy" , " girl" , " dog" , " town" , " car" };
		String[] verb= {" drove" , " jumped" , " ran" , " walked" , " skipped" };
		String[] preposition= {" to" , " from" , " over" , " under" , " on" };
	
		
		
		//article noun verb preposition article noun
		int n1,n2,n3,n4,n5,n6;
		

		for(int i=0;i<20;i++)
		{
			n1 = ((int) (Math.random() * 5));
			n2 = ((int) (Math.random() * 5));
			n3 = ((int) (Math.random() * 5));
			n4 = ((int) (Math.random() * 5));
			n5 = ((int) (Math.random() * 5));
			n6 = ((int) (Math.random() * 5));
			System.out.println(article[n1]+" "+noun[n2]+" "+verb[n3]+" "+preposition[n4]+" "+article[n5]+" "+noun[n6]+".");
		}
		
		
		
		
		
	}
}
