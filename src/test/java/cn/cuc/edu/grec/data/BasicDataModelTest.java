package cn.cuc.edu.grec.data;

import cn.cuc.grec.data.BasicDataModel;
import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.data.converter.BasicConverter;
import cn.cuc.grec.math.structure.BasicDenseMatrix;

public class BasicDataModelTest {
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

        DataModel dataModel = new BasicDataModel(new BasicConverter(new BasicDenseMatrix(data)), null, null);
        System.out.println(dataModel.getPredictData());
    }
}
