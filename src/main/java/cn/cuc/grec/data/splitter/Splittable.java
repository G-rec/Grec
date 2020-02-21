package cn.cuc.grec.data.splitter;

import cn.cuc.grec.math.structure.DataSet;

/**
 * A Splitter is used to split the input data to train data and predict data
 * by using some tricks such as random selection, etc.
 *
 * Node that the splitting logic should be written in the constructor because a
 * same splitter can be included in many different dataModels of a same recommender.
 * So it is very important to make sure the train data and the predict data is
 * synchronized among all the dataModels.
 *
 * @author Liming Liu
 */
public interface Splittable {
    /**
     * Just do the split job instead of deciding how to do.
     * @param in the input data
     */
    void split(DataSet in);

    /**
     * Please check if the splitter had done the split job.
     * It is recommended to do the split job automatically if detecting a
     * missing of trained data.
     *
     * @return the data used to train a recommender
     */
    DataSet getTrainData();

    /**
     * Please check if the splitter had done the split job.
     * It is recommended to do the split job automatically if detecting a
     * missing of predict data.
     *
     * @return the data used to get the result
     */
    DataSet getPredictData();
}
