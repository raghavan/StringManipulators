public class SpiralMatrix {
	public static void main(String args[]) {
		int row = 4, col = 4;
		String matrix[][] = { { "A", "B", "C", "D" }, { "E", "F", "G", "H" },
				{ "I", "J", "K", "L" }, { "M", "N", "O", "P" }};
		int noItems = row * col;
		int rowStretch = row, colStretch = col-1;

		int i = 0, j = 0;

		while (noItems > 0) {

			for (int ctr=0; ctr < rowStretch; ctr++) {
				print(matrix, i, j);
				noItems--;
				j++;
			}
			rowStretch -= 1;
			i++;
			j--;
			//System.out.println("Row Stretch = "+rowStretch);
			
			for (int ctr=0;ctr < colStretch;ctr++) {
				print(matrix, i, j);
				noItems--;
				i++;
			}
			colStretch -= 1;
			i--;
			j--;
			//System.out.println("Col Stretch = "+colStretch);

			print(i, j);
			for (int ctr=0;ctr<rowStretch;ctr++) {
				print(matrix, i, j);
				noItems--;
				j--;
			}
			rowStretch -= 1;
			i--;
			j++;
			//System.out.println("Row Stretch = "+rowStretch);

			print(i, j);
			for (int ctr=0; ctr < colStretch;ctr++) {
				print(matrix, i, j);
				noItems--;
				i--;
				print(i, j);
			}
			i++;
			j++;
			colStretch -= 1;
			//System.out.println("Col Stretch = "+colStretch);

		}
	}

	private static void print(int i, int j) {
		//System.out.println("Position = " + i + " " + j);
	}

	private static void print(String matrix[][], int i, int j) {
		System.out.println(matrix[i][j]);
	}
}
