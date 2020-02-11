package cn.cuc.grec.conf;

import cn.cuc.grec.commom.GrecException;

public interface Configable {

    void load() throws GrecException;

    String getConf(String key);
}
