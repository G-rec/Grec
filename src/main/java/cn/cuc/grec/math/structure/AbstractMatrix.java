package cn.cuc.grec.math.structure;

/**
 * An abstract Matrix.
 *
 * @author Liming Liu
 */
public abstract class AbstractMatrix implements Matrix {
    protected int rowSizeNum, columnSizeNum;

    public AbstractMatrix(int rowSizeNum, int columnSizeNum) {
        this.rowSizeNum = rowSizeNum;
        this.columnSizeNum = columnSizeNum;
    }

    @Override
    public Matrix clone() {
        try {
            return (Matrix) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int columnSize() {
        return this.columnSizeNum;
    }

    @Override
    public int rowSize() {
        return this.rowSizeNum;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
