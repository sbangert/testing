package testingPackage;

public class HW7ArraySort {
	
	public static boolean arraySortVerify (double[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		double[] array1 = {};
		double[] array2 = {0};
		double[] array3 = {0,0};
		double[] array4 = {0,1};
		double[] array5 = {2.3, 2.31, 2.31, 5};
		double[] array6 = {2,4,6,8,7,9,11,13};
		double[] array7 = {5, 4};
		double[] array8 = {1,2,3,0};
		double[] array9 = {5,1,2,3};
		
		boolean sorted = arraySortVerify(array1);
		
		if (sorted) {
			System.out.println("This array is sorted.");
		} else if (!sorted) {
			System.out.println("This array is not sorted.");
		}
		


	}

}

