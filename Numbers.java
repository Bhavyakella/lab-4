/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #4
 */
import java.util.Arrays;

import java.util.Scanner;

public class Numbers {

	public static int nextLargest(int arr[], int val) {

		int nextGreaterElement = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > val) {

				nextGreaterElement = arr[i];
				break;

			}

		}

		return nextGreaterElement;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		int arr[];

		int sortedArray[];

		System.out.print("Enter size of array: ");

		n = sc.nextInt();

		arr = new int[n];

		sortedArray = new int[n];

		System.out.println("Please Enter array of elements: ");

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

			sortedArray[i] = arr[i];

		}
		sc.close();

		Arrays.sort(sortedArray);

		System.out.println("Output:");

		for (int i = 0; i < n; i++) {

			int nextGreaterElement = nextLargest(sortedArray, arr[i]);

			if (nextGreaterElement != -1) {

				System.out.println(arr[i] + ": " + nextGreaterElement);

			}

			else {

				System.out.println(arr[i] + ": " + Integer.MAX_VALUE);

			}
		}

	}
}
