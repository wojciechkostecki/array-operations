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
}
