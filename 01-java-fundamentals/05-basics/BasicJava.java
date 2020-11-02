import java.util.ArrayList;

public class BasicJava {
	public static void main(String[] args) {
		System.out.println();
		}
		public static void PrintAll(){
			for(int i = 1 ; i <=255; i ++)
			System.out.println(i);
		}
		public static void PrintOdd(){
			for(int num = 1; num <=255; num ++)
				if(num % 2 != 0)
				System.out.println(num);
		}
		public static void PrintNum(){
			int sum = 0;
			for(int i = 0; i <=255; i ++){
			sum = sum+i;
			System.out.println("num:" + i + " sum" + sum);
			}
		}
		public static void PrintArray(){
			int[] myArray = { 1, 3, 5, 7, 9, 13 };
				for (int array : myArray){
					System.out.println(array);
			}
		}
		public static void FindMax(int[] arr) {
			int currMax = arr[0];
			for(int i =0; i < arr.length; i ++) {
				if(currMax < arr[i])
					currMax = arr[i];
					System.out.println(currMax);
			}
		}
		public static void GetAverage(int[] arr) {
			int sum = 0;
			for(int i=0; i < arr.length; i++) {
				if(i < arr.length)
					sum = sum + arr[i];
				System.out.println(sum);
			}
		}
		public static void GreaterThanY(int[] arr, int y) {
			int greater = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > y)
					greater ++;
					System.out.println(greater);
			}
		}
		public static void SquareArray(int[] arr) {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * arr[i];
				System.out.println(arr);	
			}
		}
		public static void EliminateNegatives(int[] arr) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < 0)
					arr[i] = 0;
					System.out.println(arr);
			}
		}
		public static void MaxMinAverage(int[] arr) {
			int currMax = arr[0];
			int currMin = arr[0];
			int sum = 0;
			for(int i =0; i < arr.length; i ++) {
				if(currMax < arr[i])
					currMax = arr[i];
				else if (currMin > arr[i])
						currMin = arr[i];
				else if (i < arr.length)
					sum = sum + arr[i];
			System.out.println("Max: " + currMax + "Min: " + currMin + "Avg: " + sum);
			}
		}
		public static void ShiftingValues(int[] arr) {
			for(int i =0; i < arr.length; i++) {
				arr[i] = arr[i+1];
				System.out.println(arr);
			}
		}
}