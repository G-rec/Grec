package cn.cuc.grec.data.converter;

import cn.cuc.grec.math.structure.Matrix;

/**
 * A BasicMatrixConverter is used to pack a Matrix to DataModel DIRECTLY.
 *
 * @author Liming Liu
 */
public class BasicMatrixConverter extends AbstractConverter {

    public BasicMatrixConverter(Matrix in) {
        super(null);
        this.out = in;
    }

    @Override
    public void convert() {

    }
}
