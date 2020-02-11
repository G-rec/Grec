package cn.cuc.grec.data.converter;

import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.data.loader.Loadable;

public interface Convertable {

    void convert();
    DataModel getDataModel();
}
