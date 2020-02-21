package cn.cuc.grec.filter;

import cn.cuc.grec.conf.Configurable;
import cn.cuc.grec.data.DataModel;

public class BasicFilter extends AbstractFilter {

    public BasicFilter(DataModel data) {
        super(data);
    }

    @Override
    public Filtable filt(Configurable conf) {
        return this;
    }

    @Override
    public Filtable merge(Filtable f) {
        return this;
    }
}
