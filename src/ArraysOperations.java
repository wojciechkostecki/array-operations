import java.util.Arrays;

public class ArraysOperations {

    public int[][] returnArrayWithLargerSum(int[][] array1, int[][] array2) {
        int sumArray1 = sumArray(array1);
        int sumArray2 = sumArray(array2);
        return sumArray1 > sumArray2 ? array1 : array2;
    }

    private int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public String[] returnArrayWithMoreCharacters(String[] array1, String[] array2) {
        int arrayLength1 = countChars(array1);
        int arrayLength2 = countChars(array2);
        return arrayLength1 > arrayLength2 ? array1 : array2;
    }

    private int countChars(String[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].length();
        }
        return length;
    }

    public int findLargestNumber(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    public int findSmallestNumber(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    public int[] getRowWithHighestSum(int[][] array2d) {
        int biggestArray = 0;
        int currentArray = 0;
        int index = 0;
        for (int i = 0; i < array2d.length; i++) {

            for (int j = 0; j < array2d[i].length; j++) {
                currentArray = currentArray + array2d[i][j];
            }
            if (currentArray > biggestArray) {
                biggestArray = currentArray;
                index = i;
            }
        }
        return array2d[index];
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s + " ");
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
