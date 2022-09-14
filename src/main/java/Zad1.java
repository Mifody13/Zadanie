import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {
    public static int[] generateArr(int arrCol) {
        int[] arr = new int[arrCol];
        for (int i = 0; i < arrCol; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }

    public static void main(String[] args) {
        int arrCol;
        System.out.println("Введите количество элементов массива");
        Scanner userinput = new Scanner(System.in);
        arrCol = userinput.nextInt();
        int[] arr = noDoble(arrCol);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] noDoble(int arrCol) {
        int[] arr = generateArr(arrCol);
        int[] arr2 = new int[arrCol];

        int iArr = 0;
        int cErr = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arrCol; i++) {
            cErr = 0;
            for (int j = 0; j < arrCol; j++) {
                if ((arr[i] == arr[j]) & (i != j)) {
                    cErr++;
                }
            }
            if (cErr == 0) {
                arr2[iArr] = arr[i];
                iArr++;

            }
        }
        int arr3[] = Arrays.copyOf(arr2, iArr);
        return arr3;
    }

}