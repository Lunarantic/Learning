package exercise3;

import java.util.Arrays;
import java.util.Collections;

import util.FillUp;

public class Program4 {

	public static void main(String[] args) {
		
		int l = 10;
		
		Integer[] a = FillUp.arrayOfRandoms(l);
		Integer[] b = FillUp.arrayOfRandoms(l);
		Integer[] c = FillUp.arrayOfRandoms(2 * l);
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		System.out.println("Array a is " + Arrays.toString(a));
		System.out.println("Array b is " + Arrays.toString(b));
		
		specialMergeSort(a, b, c);
		
		System.out.println("Array c is " + Arrays.toString(c));
	}
	
	public static void specialMergeSort(Integer[] a, Integer[] b, Integer[] c) {
		for (int i = 0, j = 0, k = b.length - 1; i < c.length; ++i) {
			if (j == a.length) {
				c[i] = b[k--];
			} else if (k == 0) {
				c[i] = a[j++];
			} else {
				if (a[j] > b[k]) {
					c[i] = b[k--];
				} else {
					c[i] = a[j++];
				}
			}
		}
	}
}
