package cn.cuc.grec.recommender;

import cn.cuc.grec.commom.GrecException;
import cn.cuc.grec.data.DataModel;

public class BasicRecommender extends AbstractRecommender {


    public BasicRecommender(DataModel data) {
        super(data);
    }

    @Override
    public Recommendable train() throws GrecException {

        return this;
    }

    @Override
    public Recommendable predict() throws GrecException {

        return this;
    }

    @Override
    public Recommendable loadRecommender() throws GrecException {

        return this;
    }

    @Override
    public Recommendable saveRecommender() throws GrecException {

        return this;
    }

    @Override
    public Recommendable cleanUp() throws GrecException {

        return this;
    }
}
