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
    public AbstractMatrix clone() {
        try {
            return (AbstractMatrix) super.clone();
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
        int maxRowsToDisplay = 10;

        StringBuilder s = new StringBuilder("{\n");
        for (int rowIndex = 0; rowIndex < maxRowsToDisplay && rowIndex < rowSize(); rowIndex++) {
            Vect vector = getRow(rowIndex);
            s.append(" ").append(rowIndex)
                    .append(" =>\t")
                    .append(vector.toString())
                    .append('\n');
        }

        String returnString = s.toString();
        if (maxRowsToDisplay < rowSize())
            return returnString + ("... \n}");
        else {
            return returnString + ("}");
        }
    }
}
