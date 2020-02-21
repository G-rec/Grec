package cn.cuc.grec.data.converter;

import cn.cuc.grec.math.structure.DataSet;

/**
 * A converter can convert the dataSet or dataModel to another dataSet, such as
 * a group of eigenvector to a similarity matrix.
 *
 * Please write your converting logic in convert function instead of the constructor
 * for Lazy converting.
 *
 * @author Liming Liu
 */
public interface Convertible {
    /**
     * Your converting logic is here instead of the constructor.
     */
    void convert();

    /**
     * @return the converted dataSet
     */
    DataSet getDataSet();
}
