package cn.cuc.grec.filter;

public interface Filtable {
    Filtable filt();

    Filtable merge(Filtable f);
}
