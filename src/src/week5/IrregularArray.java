package week5;

public class IrregularArray {
    public static void main(String[] args) {
        int[][] irrArray = {{10, 11, 12},
                {20, 21},
                {30, 31, 32},
                {40, 41}
        };

        for (int i = 0; i < irrArray.length; i++, System.out.println())
            for (int j = 0; j < irrArray[i].length; j++, System.out.print("\t"))
                System.out.print(irrArray[i][j]);

    }
}
