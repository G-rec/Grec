                                                                                                                                                                                                                                package cn.cuc.grec.data.loader;

import cn.cuc.grec.math.structure.BasicDenseMatrix;
import cn.cuc.grec.math.structure.DataSet;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import java.io.*;
import java.util.ArrayList;


/**
 * A loader that can load matrix data from arff file with absolute path given.
 * The Loader is not optimized yet so now just for testing purpose.
 *
 *
 * @author Dongxia Wang
 */
public class BasicArffMatrixLoader extends AbstractLoader {
    protected String splitSign = ",";

    public BasicArffMatrixLoader(String url) {
        super(url);
    }

    public BasicArffMatrixLoader(String url, String splitSign) {
        super(url);
        this.splitSign = splitSign;
    }

    @Override
    public DataSet load()  {
        ArrayList<Double[]> input = new ArrayList<>();

        try {
            ArffLoader loader = new ArffLoader();
            loader.setFile(new File(this.url));
            Instances data = loader.getDataSet();
             for ( int i = 0 ; i < data.numInstances();i++) {
                 String[] tempSplitter = data.get(i).toString().split(this.splitSign);
                 Double[] tempDouble = new Double[tempSplitter.length];
                 for (int j = 0; j < tempSplitter.length; j++) {
                     tempDouble[j] = Double.parseDouble(tempSplitter[j]);
                 }
                 input.add(tempDouble);
             }
        } catch (Exception e){
            e.printStackTrace();
        }
        return new BasicDenseMatrix(input);
    }
}
