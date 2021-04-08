package uebungsblatt2;

public class Inkrements {

	public static void main(String[] args) {
		
		/*
		  1)
		  
		  int x = 0;
		 
			{x=x+1;
			{x+=x;
			{++x;
			{
			x++;
		 		}
				}
				}
			}*/
		
		
		//2)
			int x,y,z,count,total,divisor,product,quotient,q;
			count=0;
			y=0;
			x=0;
			total=0;
			q=0;
			divisor=0;
			//a
				{
					z = y + x++;
				}
			//b   
				{
					
					
					if(count>10)
					{
						System.out.println("Count is greater than 10");
					}
					
				}
			//c
				{
					total -= --x;
				}
				
			//d
				{
					q%=divisor;
				}
		//3)
			product=5;
			x=5;
			quotient=5;
			//a 
				product *= x++; //x=6, product=25
				quotient /= ++x; //x=6 quotient= 5/6f bzw 0 als int

	}
	

}
