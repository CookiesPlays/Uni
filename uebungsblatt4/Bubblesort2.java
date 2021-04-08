package uebungsblatt4;

public class Bubblesort2 {

	public static int[] bubblesort(int[] zusortieren) {
		int temp;
		for (int i = 1; i < zusortieren.length; i++) {
			for (int j = 0; j < zusortieren.length - i; j++) {
				if (zusortieren[j] > zusortieren[j + 1]) {
					temp = zusortieren[j];
					zusortieren[j] = zusortieren[j + 1];
					zusortieren[j + 1] = temp;
				}

			}
		}
		return zusortieren;
	}

	public static void main(String[] args) {
		int[] unsortiert = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99, 756, 99, 0, 666, 2345, 7492, 22 };
		System.out.print("Data items in original order\n");
		for(int i=0;i<unsortiert.length;i++)
			System.out.print(unsortiert[i]+"  ");		
		
		
		int[] sortiert = bubblesort(unsortiert);
		System.out.println();
		System.out.print("Data items in ascending order\n");
		for (int i = 0; i < sortiert.length; i++) {
			System.out.print(sortiert[i] + "  ");

		}
	}

}
