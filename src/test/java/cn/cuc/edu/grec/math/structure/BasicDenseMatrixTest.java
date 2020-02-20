package cn.cuc.edu.grec.math.structure;

import cn.cuc.grec.math.structure.BasicDenseMatrix;
import cn.cuc.grec.math.structure.Matrix;

public class BasicDenseMatrixTest {
    public static void main(String[] args) {
        double[][] data = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {4, 5, 6},
                {7, 8, 9},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
        };

        Matrix matrix = new BasicDenseMatrix(data);
        System.out.println(matrix);

        System.out.println(matrix.getRow(0));
        System.out.println(matrix.getCol(2));

        System.out.println(matrix.get(0, 0));
        matrix.set(0, 0, 100);
        System.out.println(matrix);
    }
}
