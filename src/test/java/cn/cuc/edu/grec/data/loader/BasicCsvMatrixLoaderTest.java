package cn.cuc.edu.grec.data.loader;

import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.data.loader.BasicCsvMatrixLoader;
import cn.cuc.grec.math.structure.DataSet;

public class BasicCsvMatrixLoaderTest {
    public static void main(String[] args) {
        Loadable loader = new BasicCsvMatrixLoader("test/resources/csv/BasicCsvMatrixLoaderTest.csv");
        DataSet result = loader.load();
        System.out.println(result);
    }
}
