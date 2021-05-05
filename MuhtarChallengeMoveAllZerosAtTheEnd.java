package week06;

import java.util.Arrays;

public class MuhtarChallengeMoveAllZerosAtTheEnd {

	public static void main(String[] args) {
		
		int[] array = {1, 0, 2, 0, 3, 0 , 0, 4, 5, 6, 7};
		int value = 0; // the Value You Would Like To Move To The End
		
		int[] arrayNew = moveZerosAtTheEnd(array, value);
		System.out.println(Arrays.toString(arrayNew)); 		

	}
	public static int[] moveZerosAtTheEnd(int[] arr, int val) {
		
		int[] arrNew = new int[arr.length];
		int j = 0;	
				
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {
				arrNew[j] = arr[i];
				j++;
			} 
		}
		
		for (int i = j; i < arrNew.length; i++) {
		arrNew[i] = val;
		}
	
		return arrNew;
	}	

}
