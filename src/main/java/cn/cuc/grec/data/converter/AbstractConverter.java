package cn.cuc.grec.data.converter;

import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.math.structure.DataSet;

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
