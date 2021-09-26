package June29;

public class BoardPathsSuperior {

	public static void main(String[] args) {
		getBoardPathsS(0, 10, " ");

	}

	public static void getBoardPathsS(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}

		if (curr > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {

			getBoardPathsS(curr + dice, end, ans + dice);
		}

	}

}
