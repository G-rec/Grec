package cn.cuc.edu.grec.data.loader;

import cn.cuc.grec.data.loader.BasicArffMatrixLoader;
import cn.cuc.grec.data.loader.BasicCsvMatrixLoader;
import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.math.structure.DataSet;

import java.io.IOException;

public class BasicArffMatrixLoaderTest  {
    public static void main(String[] args) throws IOException {
        Loadable loader = new BasicArffMatrixLoader("C:\\Users\\18810809501\\Desktop\\2020.02\\arff\\test.arff");
        DataSet result = loader.load();
        System.out.println(result);
    }
}
