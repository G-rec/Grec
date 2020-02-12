package cn.cuc.grec.recommender;

import cn.cuc.grec.commom.GrecException;
import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.math.structure.DataSet;

public interface Recommendable {

    Recommendable train() throws GrecException;

    Recommendable predict() throws GrecException;

    DataModel getResult() throws GrecException;

    Recommendable saveResult() throws GrecException;

    Recommendable loadRecommender() throws GrecException;

    Recommendable saveRecommender() throws GrecException;

    Recommendable cleanUp() throws GrecException;
}
