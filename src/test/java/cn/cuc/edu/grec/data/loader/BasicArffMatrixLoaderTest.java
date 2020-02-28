package cn.cuc.edu.grec.data.loader;

import cn.cuc.grec.data.loader.BasicArffMatrixLoader;
import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.math.structure.DataSet;



public class BasicArffMatrixLoaderTest  {

    public static void main(String[] args) throws Exception {
        String url = "";
        Loadable loader = new BasicArffMatrixLoader("src/test/resources/arff/BasicArffMatrixLoader.arff");
        DataSet result = loader.load();
        System.out.println(result);
    }
}
