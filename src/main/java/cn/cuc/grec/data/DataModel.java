package cn.cuc.grec.data;

import cn.cuc.grec.math.structure.DataSet;

/**
 * The DataModel is the most basic unit that can be used by Recommender.
 *
 * The DataModel can be loaded from disk(in format you need), database, etc by using different loader.
 * The DataModel can be converted from other dataModel or dataSet by using different converter.
 * The DataModel can be saved to disk(in format you need), database, etc by using different saver.
 * The DataModel can be splitted in different ways by using divergent splitter.
 *
 * You are recommended to check if the Model is loaded before splitting and automatically load if not.
 * You are recommended to check if the Model is loaded before saving and automatically load if not.
 * You are recommended to check if the Model is splitted before getting the train or predict data and
 * split automatically if not.
 *
 * @author Liming Liu
 */
public interface DataModel extends DataSet {
    /**
     * Load or convert the dataSet.
     *
     * @return this
     */
    DataModel load();

    /**
     * Save inData to file, database, etc.
     * You are recommended to check if the Model is loaded before saving and automatically load if not.
     *
     * @return this
     */
    DataModel save();

    /**
     * Split inData to trainData and predictData
     *
     * You are recommended to check if the Model is splitted before getting the train or predict data and
     * split automatically if not.
     *
     * @return this
     */
    DataModel split();

    /**
     * @return data used to train a recommender
     */
    DataSet getTrainData();

    /**
     * @return data used to predict the result
     */
    DataSet getPredictData();
}
