package cn.cuc.grec.data.splitter;

import cn.cuc.grec.math.structure.DataSet;

public class DefaultSplitter extends AbstractSplitter{
    public DefaultSplitter(DataSet inData) {
        super(inData);
    }

    public DefaultSplitter() {
        super();
    }

    @Override
    public void split(DataSet inData) {
        this.predictData = this.trainData = this.inData = inData;
    }
}
