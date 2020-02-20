package cn.cuc.grec.math.structure;

import cn.cuc.grec.commom.IndexOutOfRangeException;

/**
 *
 * @author Liming Liu
 */
public interface Vect extends DataSet {
    /**
     * @return a formatted String suitable for output
     */
    String toString();

    double get(int index) throws IndexOutOfRangeException;

    void set(int index, double data) throws IndexOutOfRangeException;

    int size();
}
