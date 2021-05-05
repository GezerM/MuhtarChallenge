package week06;

import java.util.Arrays;

public class MuhtarChallangeMergeToArrays {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6, 7};
		int[] arr3 = arrayMerge(arr1, arr2);
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(mergeTwoArrays(arr1, arr2)) // second version
		
	}
	
	public static int[] arrayMerge(int[] arr1, int[] arr2) {
		
		int size = arr1.length + arr2.length;
		int[] merger = Arrays.copyOf(arr1, size);
		for (int i = 0; i < arr2.length; i++) {
			merger[arr1.length + i] = arr2[i];
		}
		return merger;
		
	}
	public static int[] mergeTwoArrays(int[] arr1, int[] arr2) { // another way to do the merging
		int [] merged = new int[arr1.length + arr2.length];
		int i = 0;
		
		for (int each : arr1) {
			merged[i++] = each;
		}
		for (int each : arr2) {
			merged[i++] = each;
		}
		
		return merged;
	}

}
