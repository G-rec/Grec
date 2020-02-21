package cn.cuc.edu.grec.data.loader;

import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.data.loader.BasicCsvMatrixLoader;
import cn.cuc.grec.math.structure.DataSet;

public class BasicCsvMatrixLoaderTest {
    public static void main(String[] args) {
        Loadable loader = new BasicCsvMatrixLoader("U:\\0100_Works\\20200209_大创项目\\Grec\\testdata\\csv\\BasicCsvMatrixLoaderTest.csv");
        DataSet result = loader.load();
        System.out.println(result);
    }
}
