public class Test {
    public static void main(String[] args) {
        ArraysOperations ar = new ArraysOperations();

        int[] array = {10,30,50,70,5,2,1};
        System.out.print("Najmniejsza liczba z tablicy: ");
        System.out.println(ar.findSmallestNumber(array));
        System.out.print("Największa liczba z tablicy: ");
        System.out.println(ar.findLargestNumber(array));

        int[][] array1 = {
                {15,13,4},
                {7,5,9},
                {29,43,1}
        };
        int[][] array2 = {
                {5,13,4},
                {7,5,4},
                {21,4,1}
        };
        System.out.println("Tablica, której suma liczb jest większa: ");
        ar.printInt2dArray(ar.returnArrayWithLargerSum(array1,array2));

        String[] stringFirstArray = new String[3];
        String[] stringSecondArray = new String[3];
        stringFirstArray[0] = "Ania";
        stringFirstArray[1] = "Kasia";
        stringFirstArray[2] = "Zosia";
        stringSecondArray[0] = "Mieczysław";
        stringSecondArray[1] = "Bogusław";
        stringSecondArray[2] = "Bartłomiej";
        System.out.println("Tablica z większą liczbą znaków: ");
        ar.printStringArray(ar.returnArrayWithMoreCharacters(stringFirstArray,stringSecondArray));

        System.out.println("Tablica jednowymiarowa o największej liczbie elementów w tablicy dwuwymiarowej: ");
        ar.printIntArray(ar.return1dArray(array1));
    }
}
