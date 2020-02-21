package cn.cuc.edu.grec.data.splitter;

import cn.cuc.grec.data.splitter.DefaultSplitter;
import cn.cuc.grec.data.splitter.Splittable;
import cn.cuc.grec.math.structure.BasicDenseMatrix;
import cn.cuc.grec.math.structure.Matrix;

public class DefaultSplitterTest {
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

        Splittable splitter = new DefaultSplitter();
        System.out.println(splitter.getTrainData());
        System.out.println(splitter.getPredictData());

        splitter.split(new BasicDenseMatrix(data));
        System.out.println(splitter.getTrainData());
        System.out.println(splitter.getPredictData());
    }
}
