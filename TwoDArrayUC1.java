import java.util.Scanner;

public class TwoDArrayUC1 {

	public static void main(String[] args) {
		int i=0;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number of rows and columns:");
			int rows = scan.nextInt();
			int columns = scan.nextInt();
			int[][] arr = new int [rows][columns];
			System.out.println("Enter the elements of the array");
			for(i=0; i<rows; i++) {
				for (int j=0;j<columns;j++) {
					arr[i][j] = scan.nextInt();
					System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
			}
		}
	}
}
