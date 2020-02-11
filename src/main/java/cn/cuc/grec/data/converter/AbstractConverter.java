package cn.cuc.grec.data.converter;

import cn.cuc.grec.data.DataModel;

public abstract class AbstractConverter implements Convertable{
    protected DataModel in;
    protected DataModel out;

    public AbstractConverter(DataModel in) {
        this.in = in;
        this.out = null;
    }

    @Override
    public DataModel getDataModel() {
        return this.out;
    }
}
