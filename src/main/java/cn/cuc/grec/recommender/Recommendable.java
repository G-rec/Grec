package cn.cuc.grec.recommender;

import cn.cuc.grec.commom.GrecException;
import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.math.structure.DataSet;

public interface Recommendable {

    void train() throws GrecException;

    void predict() throws GrecException;

    DataModel getResult() throws GrecException;

    void saveResult() throws GrecException;

    void loadRecommender() throws GrecException;

    void saveRecommender() throws GrecException;

    void cleanUp() throws GrecException;
}
