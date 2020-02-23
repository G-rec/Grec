package cn.cuc.grec.data.converter;

import cn.cuc.grec.math.structure.DataSet;
import cn.cuc.grec.math.structure.Matrix;

/**
 * A BasicMatrixConverter is used to pack a DataSet to DataModel DIRECTLY.
 *
 * @author Liming Liu
 */
public class BasicConverter extends AbstractConverter {
    public BasicConverter(DataSet in) {
        super(in);
    }

    @Override
    public void convert() {
        this.out = this.in;
    }
}
