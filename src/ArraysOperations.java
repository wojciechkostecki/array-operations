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

    
}
