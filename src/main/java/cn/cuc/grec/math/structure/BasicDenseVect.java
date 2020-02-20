package cn.cuc.grec.math.structure;

import cn.cuc.grec.commom.IndexOutOfRangeException;

public class BasicDenseVect extends AbstractVect{
    protected double[] data;

    public BasicDenseVect(int size) {
        super(size);
        this.data = new double[this.size];
    }

    public BasicDenseVect(double[] data) {
        super(data.length);
        this.data = new double[this.size];
        if (this.size() >= 0) {
            System.arraycopy(data, 0, this.data, 0, this.size());
        }
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double get(int index) throws IndexOutOfRangeException {
        if (index >= this.size()) {
            throw new IndexOutOfRangeException(index, this.size());
        }
        return this.data[index];
    }

    @Override
    public void set(int index, double data) throws IndexOutOfRangeException {
        if (index >= this.size()) {
            throw new IndexOutOfRangeException(index, this.size());
        }
        this.data[index] = data;
    }
}
