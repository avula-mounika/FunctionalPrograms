import java.util.Scanner;

public class SumOfThreeUC2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the size of array: ");

				int sizeOfArray = scan.nextInt();
				int [] arr = new int[sizeOfArray];

				System.out.println("Enter the elements in array : ");

				for(int i = 0;i < sizeOfArray ; i++ ){

				    arr [i] = scan.nextInt();

				}

				find(arr);
			}

	    }
	public static void find(int [] a){
       for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                for (int l = j+1; l <a.length ; l++) {
                    if(a[i]+a[j]+a[l]==0){
                        System.out.println("Found 3 elements whose sum is = 0");
                        System.out.println("Elements are " + a[i] + " " + a[j]+ " " + a[l]);
                        return;
                    }
                }
            }
        }
        System.out.println("Did not find 3 elements whose sum is = 0");
    }
	   

}
