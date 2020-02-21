package cn.cuc.grec.data.converter;

import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.math.structure.Matrix;

public class BasicMatrixConverter extends AbstractConverter {

    public BasicMatrixConverter(Matrix in) {
        super(null);
        this.out = in;
    }

    @Override
    public void convert() {

    }
}
