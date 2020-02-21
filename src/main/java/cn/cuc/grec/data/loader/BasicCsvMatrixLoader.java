package cn.cuc.grec.data.loader;

import cn.cuc.grec.math.structure.BasicDenseMatrix;
import cn.cuc.grec.math.structure.Matrix;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A loader that can load matrix data from csv file with absolute path given.
 * The Loader is not optimized yet so now just for testing purpose.
 * The split sign for csv is "," by default, you can change it by using the constructor.
 *
 * @author Liming Liu
 */

public class BasicCsvMatrixLoader extends AbstractLoader {
    protected String splitSign = ",";

    public BasicCsvMatrixLoader(String url) {
        super(url);
    }

    public BasicCsvMatrixLoader(String url, String splitSign) {
        super(url);
        this.splitSign = splitSign;
    }

    @Override
    public Matrix load() {
        ArrayList<Double[]> input = new ArrayList<>();
        BufferedReader fileReader = null;
        int colNum = -1;
        try {
            fileReader = new BufferedReader(new FileReader(this.url));
            String l;
            while ((l = fileReader.readLine()) != null) {
                String[] tempSplitter = l.split(this.splitSign);
                Double[] tempDouble = new Double[tempSplitter.length];
                for (int i = 0; i < tempSplitter.length; i++) {
                    tempDouble[i] = Double.parseDouble(tempSplitter[i]);
                }
                input.add(tempDouble);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
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
