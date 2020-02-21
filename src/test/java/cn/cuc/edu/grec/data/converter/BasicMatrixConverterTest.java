package cn.cuc.edu.grec.data.converter;

import cn.cuc.grec.data.converter.BasicMatrixConverter;
import cn.cuc.grec.data.converter.Convertible;
import cn.cuc.grec.math.structure.BasicDenseMatrix;

public class BasicMatrixConverterTest {
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

        Convertible converter = new BasicMatrixConverter(new BasicDenseMatrix(data));
        System.out.println(converter.getDataSet());
    }
}
