package cn.cuc.grec.recommender;

import cn.cuc.grec.commom.GrecException;
import cn.cuc.grec.data.DataModel;

public abstract class AbstractRecommender implements Recommendable {
    protected DataModel data;
    protected DataModel result;

    public AbstractRecommender(DataModel data) {
        this.data = data;
        this.result = null;
    }

    @Override
    public DataModel getResult() throws GrecException {
        return this.result;
    }

    @Override
    public void saveResult() throws GrecException {
        this.result.save();
    }
}
