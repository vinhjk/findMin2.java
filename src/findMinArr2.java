import java.util.Scanner;

public class findMinArr2 {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of values : ");
        size = scanner.nextInt();

        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter value " + (i + 1) + " = ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int min = arr[0];
        for (int j = 0; j < arr.length; j ++){
            if (arr[j] < min){
                min = arr[j];
            }
        }
        System.out.print("Min = " + min);
    }
}
