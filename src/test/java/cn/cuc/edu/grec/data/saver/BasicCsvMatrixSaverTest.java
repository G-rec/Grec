package cn.cuc.edu.grec.data.saver;

import cn.cuc.grec.data.saver.BasicCsvMatrixSaver;
import cn.cuc.grec.data.saver.Savable;
import cn.cuc.grec.math.structure.BasicDenseMatrix;

public class BasicCsvMatrixSaverTest {
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

        Savable saver = new BasicCsvMatrixSaver("U:\\0100_Works\\20200209_大创项目\\Grec\\testdata\\csv\\BasicCsvMatrixSaverTest.csv");
        saver.save(new BasicDenseMatrix(data));
    }
}
