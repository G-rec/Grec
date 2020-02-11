package cn.cuc.grec.filter;

import cn.cuc.grec.data.DataModel;

public abstract class AbstractFilter implements Filtable{
    protected DataModel data;

    public AbstractFilter(DataModel data) {
        this.data = data;
    }
}
