package cn.cuc.grec.data.splitter;

import cn.cuc.grec.math.structure.DataSet;

public interface Splittable {
    void split(DataSet in);

    DataSet getTrainData();

    DataSet getPredictData();
}
