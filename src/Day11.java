import java.util.Scanner;

public class Day11 {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maxValue = 0;
        for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				int value = arr[i][j] +
							arr[i][j + 1] + 
							arr[i][j + 2] + 
							arr[i + 1][j + 1] + 
							arr[i + 2][j] + 
							arr[i + 2][j + 1] + 
							arr[i + 2][j + 2];
				maxValue = Math.max(maxValue, value);
			}
		}
        System.out.println(maxValue);
        
        in.close();
	}
}
