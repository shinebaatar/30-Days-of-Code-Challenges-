import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int y=arr.length - 1; y>=0; y--){
            System.out.print(arr[y] + " ");
        }
        
        in.close();
    }
}