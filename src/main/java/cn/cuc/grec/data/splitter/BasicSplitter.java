package cn.cuc.grec.data.splitter;

import cn.cuc.grec.math.structure.DataSet;

public class BasicSplitter extends AbstractSplitter{
    public BasicSplitter(DataSet inData) {
        super(inData);
    }

    public BasicSplitter() {
        super();
    }

    @Override
    public void split(DataSet inData) {
        this.inData = inData;
    }
}
