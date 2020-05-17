import java.util.Arrays;

public class ArraysOperations {

    public int[][] returnArrayWithLargerSum(int[][] array1, int[][] array2){
        int sumArray1 = addAllElements(array1);
        int sumArray2 = addAllElements(array2);
        if(sumArray1>sumArray2){
            return array1;
        } else
            return array2;
    }

    private int addAllElements(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public String[] returnArrayWithMoreCharacters(String[] array1, String[] array2){
        int arrayLength1 = countNumbersChar(array1);
        int arrayLength2 = countNumbersChar(array2);
        if (arrayLength1>arrayLength2){
            return array1;
        } else {
            return array2;
        }
    }

    private int countNumbersChar(String[] array){
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].toCharArray().length;
        }
        return length;
    }

    public int findLargestNumber(int [] array){
        return Arrays.stream(array).max().getAsInt();
    }

    public int findSmallestNumber(int [] array){
        return Arrays.stream(array).min().getAsInt();
    }

    public int[] return1dArray(int[][] array2d){
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

    public void printInt2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printStringArray(String[] array) {
        for (String s : array) {
            System.out.println(s + " ");
        }
    }

    public void printIntArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
