package week5;

public class ReturnArray {
    static int[] makeArray(int size) {
        int temp[] = new int[size];
        for (int i = 0; i < temp.length; i++)
            temp[i] = i;
        return temp;
    }
    public static void main(String[] args) {
        int[] intArray;
        intArray = makeArray(4);
        for (int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);
    }
}
