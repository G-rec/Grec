package cn.cuc.grec.data.splitter;

import cn.cuc.grec.math.structure.DataSet;

/**
 * The DefaultSplitter just copy the input data to the train data and predict data.
 *
 * @author Liming Liu
 */
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
