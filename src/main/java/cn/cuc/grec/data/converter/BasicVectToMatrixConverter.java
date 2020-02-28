package cn.cuc.grec.data.converter;

import cn.cuc.grec.math.structure.BasicDenseMatrix;
import cn.cuc.grec.math.structure.Vect;

public class BasicVectToMatrixConverter extends AbstractConverter {
    Vect[] inData;

    public BasicVectToMatrixConverter(Vect[] inData) {
        super(null);
        this.inData = inData;
    }

    @Override
    public void convert() {
        double temp[][] = new double[inData.length][inData[0].size()];
        for (int i = 0; i < inData.length; i++) {
            for (int j = 0; j < Integer.min(inData[i].size(), inData[0].size()); j++) {
                temp[i][j] = inData[i].get(j);
            }
        }

        this.out = new BasicDenseMatrix(temp);
    }
}