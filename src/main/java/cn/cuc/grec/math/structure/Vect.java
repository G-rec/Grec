package cn.cuc.grec.math.structure;

import cn.cuc.grec.commom.IndexOutOfRangeException;

/**
 * An abstract Vect definition that gives the basic ways to manipulate
 * and access the one-dimensional data.
 * @author Liming Liu
 */
public interface Vect extends DataSet {
    /**
     * @return a formatted String suitable for output
     */
    String toString();

    /**
     * @param index index of the value you need
     * @return the value at the given position
     * @throws IndexOutOfRangeException if the index if out of range
     */
    double get(int index) throws IndexOutOfRangeException;

    /**
     * @param index index of the value you need
     * @param data  the value you want to set at the given position
     * @throws IndexOutOfRangeException if the index if out of range
     */
    void set(int index, double data) throws IndexOutOfRangeException;

    /**
     * @return the total size of this vector
     */
    int size();
}
