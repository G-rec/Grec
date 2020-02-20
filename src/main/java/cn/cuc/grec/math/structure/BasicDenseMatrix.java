package cn.cuc.grec.math.structure;

import cn.cuc.grec.commom.IndexOutOfRangeException;
import org.jetbrains.annotations.NotNull;

public class BasicDenseMatrix extends AbstractMatrix {

    double[][] data;

    public BasicDenseMatrix(int rowSizeNum, int columnSizeNum) {
        super(rowSizeNum, columnSizeNum);
        this.data = new double[this.rowSizeNum][this.columnSizeNum];
    }

    public BasicDenseMatrix(@NotNull double[][] data) {
        super(data.length, data[0].length);
        this.data = new double[this.rowSizeNum][this.columnSizeNum];
        for (int i = 0; i < data.length; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, data[i].length);
        }
    }

    @Override
    public AbstractMatrix clone() {
        return super.clone();
    }

    @Override
    public double get(int row, int column) throws IndexOutOfRangeException {
        if (row >= this.rowSizeNum) throw new IndexOutOfRangeException(row, this.rowSizeNum);
        if (column >= this.columnSizeNum) throw new IndexOutOfRangeException(column, this.columnSizeNum);
        return this.data[row][column];
    }

    @Override
    public void set(int row, int column, double value) throws IndexOutOfRangeException {
        if (row >= this.rowSizeNum) throw new IndexOutOfRangeException(row, this.rowSizeNum);
        if (column >= this.columnSizeNum) throw new IndexOutOfRangeException(column, this.columnSizeNum);
        this.data[row][column] = value;
    }

    @Override
    public Vect getRow(int rowIndex) throws IndexOutOfRangeException {
        if (rowIndex >= this.rowSizeNum) throw new IndexOutOfRangeException(rowIndex, this.rowSizeNum);
        return new BasicDenseVect(this.data[rowIndex]);
    }

    @Override
    public Vect viewRow(int rowIndex) throws IndexOutOfRangeException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Vect getCol(int colIndex) throws IndexOutOfRangeException {
        double[] result = new double[this.rowSizeNum];
        for (int i = 0; i < this.rowSizeNum; i++) {
            result[i] = this.data[i][colIndex];
        }
        return new BasicDenseVect(result);
    }

    @Override
    public Vect viewCol(int rowIndex) throws IndexOutOfRangeException {
        throw new UnsupportedOperationException();
    }

    @Override
    public int columnSize() {
        return super.columnSize();
    }

    @Override
    public int rowSize() {
        return super.rowSize();
    }

    @Override
    public boolean isRandomAccess() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
