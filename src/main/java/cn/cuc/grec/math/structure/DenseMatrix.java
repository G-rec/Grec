package cn.cuc.grec.math.structure;

import cn.cuc.grec.commom.IndexOutOfRangeException;

import java.io.Reader;

public class DenseMatrix extends AbstractMatrix {
    protected weka.core.matrix.Matrix m_Matrix = null;

    public DenseMatrix (int nr, int nc) {
        super(nr, nc);
        this.m_Matrix = new weka.core.matrix.Matrix(nr, nc);
    }

    public DenseMatrix (double[][] array) throws Exception {
        super(array.length,array[0].length);
        this.m_Matrix = new weka.core.matrix.Matrix(array);
    }

    public DenseMatrix (Reader r) throws Exception {
        super(0,0);
        this.m_Matrix = new weka.core.matrix.Matrix(r);
        super.rowSizeNum = m_Matrix.getRowDimension();
        super.columnSizeNum = m_Matrix.getColumnDimension();
    }


    @Override
    public double get(int row, int column) throws IndexOutOfRangeException {
        return m_Matrix.get(row,column);
    }

    @Override
    public void set(int row, int column, double value) throws IndexOutOfRangeException {
        m_Matrix.set(row,column,value);
    }

    @Override
    public Vect getRow(int rowIndex) throws IndexOutOfRangeException {
        if (rowIndex >= this.rowSizeNum) throw new IndexOutOfRangeException(rowIndex, this.rowSizeNum);
        return new BasicDenseVect(this.m_Matrix.getArray()[rowIndex]);
    }

    @Override
    public Vect viewRow(int rowIndex) throws IndexOutOfRangeException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Vect getCol(int colIndex) throws IndexOutOfRangeException {
        double[] result = new double[this.rowSizeNum];
        for (int i = 0; i < this.rowSizeNum; i++) {
            result[i] = this.m_Matrix.getArray()[i][colIndex];
        }
        return new BasicDenseVect(result);
    }

    @Override
    public Vect viewCol(int rowIndex) throws IndexOutOfRangeException {
         throw new UnsupportedOperationException();
    }

    @Override
    public int columnSize() {
        return this.m_Matrix.getRowDimension();
    }

    @Override
    public int rowSize() {
        return  this.m_Matrix.getColumnDimension();
    }

    @Override
    public boolean isRandomAccess() {
        return true;
    }
    };

