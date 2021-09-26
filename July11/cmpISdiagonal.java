package July11;

import java.util.Arrays;

public class cmpISdiagonal {

	public static void main(String[] args) {

		System.out.println(cmpIS(3, 3 ));
	}

	public static int cmpIS(int er, int ec) {
		int[] arr = new int[ec + 1];
		Arrays.fill(arr, 1);
		for (int i = er - 1; i >= 0; i--) {
			int d = arr[ec];
			for (int j = ec - 1; j >= 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j] + arr[j + 1] + d;
				d = temp;
			}
		}

		// display
		for (int i = 0; i <= ec; i++)
			System.out.println(arr[i]);
		return arr[0];
	}
}
