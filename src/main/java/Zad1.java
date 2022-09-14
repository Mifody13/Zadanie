import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {
    public static int[] generateArr(int arrCol) {
        int[] arr = new int[arrCol];
        for (int i = 0; i < arrCol; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner userinput = new Scanner(System.in);
        int arrLength = userinput.nextInt();
        int[] generateArr = generateArr(arrLength);
        System.out.println("\n*** source array:");
        System.out.println(Arrays.toString(generateArr));
        System.out.println("\n*** result array:");
        System.out.println(Arrays.toString(noDoble(generateArr)));
    }

    public static int[] noDoble(int[] source) {
        int[] arr2 = new int[source.length];

        int iArr = 0;
        int cErr;
        for (int i = 0; i < source.length; i++) {
            cErr = 0;
            for (int j = 0; j <  source.length; j++) {
                if ((source[i] == source[j]) & (i != j)) {
                    cErr++;
                }
            }
            if (cErr == 0) {
                arr2[iArr] = source[i];
                iArr++;

            }
        }
        return Arrays.copyOf(arr2, iArr);
    }

}