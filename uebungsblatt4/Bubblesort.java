package uebungsblatt4;

public class Bubblesort {

	 public int[] intArr =  { 2000, 2, 45, 34, 100000, 345, 56, 78, 99 ,756, 999, 0, 666, 2345, 7492, 22 };

	    public int[] sort() {
	        int k;
	        for (int i = 0; i < intArr.length - 1; i++) {
	            if (intArr[i] < intArr[i + 1]) {
	                continue;
	            }
	            k = intArr[i];
	            intArr[i] = intArr[i + 1];
	            intArr[i + 1] = k;
	            sort();
	        }
	        return intArr;
	    }
	    
	    public static void main(String[] args) {
	        Bubblesort bs = new Bubblesort();
	        int[] arr = bs.sort();
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(i + 1 + ": " + arr[i]);
	        }
	    }
}
