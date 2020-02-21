package cn.cuc.grec.filter;

import cn.cuc.grec.conf.Configurable;

public interface Filtable {
    Filtable filt(Configurable conf);

    Filtable merge(Filtable f);
}
