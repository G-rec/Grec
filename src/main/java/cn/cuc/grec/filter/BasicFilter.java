package cn.cuc.grec.filter;

import cn.cuc.grec.data.DataModel;

public class BasicFilter extends AbstractFilter {

    public BasicFilter(DataModel data) {
        super(data);
    }

    @Override
    public Filtable filt() {
        return this;
    }

    @Override
    public Filtable merge(Filtable f) {
        return this;
    }
}
