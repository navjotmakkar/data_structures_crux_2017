package July6;

import java.util.Arrays;

public class Prime_SOE {

	public static void main(String[] args) {
		soe(100);

	}

	public static void soe(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (arr[i] == false)
				continue;
			for (int j = 2; i * j <= n; j++)
				arr[i * j] = false;

		}
		for (int i = 2; i <= n; i++) {
			if (arr[i] == true)
				System.out.println(i);
		}
	}
}
