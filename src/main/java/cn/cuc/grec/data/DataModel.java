package cn.cuc.grec.data;

import cn.cuc.grec.math.structure.DataSet;

public interface DataModel extends DataSet {

    void load();

    void save();

    void split();

    DataSet getTrainData();

    DataSet getPredictData();
}
