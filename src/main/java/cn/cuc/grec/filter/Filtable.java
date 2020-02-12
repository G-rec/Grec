package cn.cuc.grec.filter;

import cn.cuc.grec.conf.Configable;

public interface Filtable {
    Filtable filt(Configable conf);

    Filtable merge(Filtable f);
}
