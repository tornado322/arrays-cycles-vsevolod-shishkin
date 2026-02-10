import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("--------Задача 1--------");
        int[] oddNumbers = new int[15];
        int k = 0;
        for (int i = 1; i < 30; i += 2) {
            oddNumbers[k] = i;
            k++;
        }
        System.out.println(Arrays.toString(oddNumbers));
        k -= 1;
        for (;k >= 0; k--) {
            System.out.print(oddNumbers[k] + " ");
        }

        System.out.println("\n--------Задача 2--------");
        int[] evenNumbers = new int[12];
        k = 0;
        for (int i = 2; i < 25; i+=2) {
            evenNumbers[k] = i;
            System.out.print(evenNumbers[k] + " ");
            k++;
        }
        System.out.println();
        for (int num : evenNumbers) {
            System.out.println(num);
        }

        System.out.println("--------Задача 3--------");
        int[] randomArray = new int[100];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 1000);
        }
        int max = randomArray[0];
        double avg = 0;
        int min = randomArray[0];
        for (int element : randomArray) {
            avg += element;
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Среднее: " + avg / randomArray.length);

        System.out.println("--------Задача 4--------");
        int[] values = new int[100];
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
        k = 0;
        do {
            if (values[k] % 5 == 0) {
                System.out.print(values[k] + " ");
            }
            k++;
        } while (k < 100);

        System.out.println("\n--------Задача 5--------");
        int[] binary = {1, 0, 0, 0, 1, 0, 1};
        k = 0;
        while (k < binary.length) {
            if (binary[k] == 0) {
                binary[k] = 1;
            } else {
                binary[k] = 0;
            }
            k++;
        }
        System.out.println(Arrays.toString(binary));

        System.out.println("--------Задача 6--------");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
