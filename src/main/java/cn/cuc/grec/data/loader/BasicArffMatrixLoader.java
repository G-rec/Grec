                                                                                                                                                                                                                                package cn.cuc.grec.data.loader;

import cn.cuc.grec.math.structure.BasicDenseMatrix;
import cn.cuc.grec.math.structure.DataSet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A loader that can load matrix data from arff file with absolute path given.
 *
 *
 *
 * @author Dongxia Wang
 */
public class BasicArffMatrixLoader extends  AbstractLoader {
    protected String splitSign = ",";

    public BasicArffMatrixLoader(String url) {
        super(url);
    }

    public BasicArffMatrixLoader(String url, String splitSign) {
        super(url);
        this.splitSign = splitSign;
    }

    @Override
    public DataSet load() {
        ArrayList<Double[]> input = new ArrayList<>();
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(this.url));
            String l;
            String DataSign = "@data";
            while (!(l = fileReader.readLine()).equals(DataSign)) {
                System.out.println(l);
            }
            while ((l = fileReader.readLine()) != null) {
                String[] tempSplitter = l.split(this.splitSign);
                Double[] tempDouble = new Double[tempSplitter.length];
                for (int i = 0; i < tempSplitter.length; i++) {
                    tempDouble[i] = Double.parseDouble(tempSplitter[i]);
                }
                input.add(tempDouble);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileReader != null;
                fileReader.close();
            } catch (IOException ignored) {
            }
        }
        return new BasicDenseMatrix(input);
    }
}
