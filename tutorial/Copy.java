package tutorial;
import java.util.Arrays;
public class Copy {

	public static int[] copy(int[]a,int[]b) {
		int[] array=new int[a.length+b.length];
		
		int marker=0;
		int i =0;
		while(marker<a.length) {
			
			array[marker]=a[i];
			i++;
			marker++;
		}
		for(int k=0; k<b.length;k++) {
			array[marker]=b[k];
			marker++;
			
		}
		
		return array;
	}
	
	public static void main(String[]args) {
		int[] a = { 1, 2, 25, 6, 11, 13 };
		int[] b = { 9, 18, 5, 34 };
		int[]c = copy(a,b);
		
		System.out.println(Arrays.toString(c));
	}
}
