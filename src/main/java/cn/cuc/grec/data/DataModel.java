package cn.cuc.grec.data;

import cn.cuc.grec.math.structure.DataSet;

public interface DataModel extends DataSet {

    DataModel load();

    DataModel save();

    DataModel split();

    DataSet getTrainData();

    DataSet getPredictData();
}
