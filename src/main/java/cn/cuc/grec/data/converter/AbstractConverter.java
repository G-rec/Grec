package cn.cuc.grec.data.converter;

import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.math.structure.DataSet;

/**
 * The AbstractConverter implements basic function like getDataSet
 *
 * Note that you are not recommend to write your loading logic in the constructor
 * due to Lazy converting purpose.
 *
 * @author Liming Liu
 */
public abstract class AbstractConverter implements Convertible {
    protected DataModel in;
    protected DataSet out;

    public AbstractConverter(DataModel in) {
        this.in = in;
        this.out = null;
    }

    @Override
    public DataSet getDataSet() {
        return this.out;
    }
}
