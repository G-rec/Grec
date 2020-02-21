package cn.cuc.grec.data.splitter;

import cn.cuc.grec.math.structure.DataSet;

public abstract class AbstractSplitter implements Splittable {
    protected DataSet inData;
    protected DataSet trainData;
    protected DataSet predictData;

    public AbstractSplitter(DataSet inData) {
        this.inData = inData;
        this.trainData = null;
        this.predictData = null;
    }

    public AbstractSplitter() {
        this(null);
    }

    @Override
    public DataSet getTrainData() {
        return this.trainData;
    }

    @Override
    public DataSet getPredictData() {
        return this.predictData;
    }
}
