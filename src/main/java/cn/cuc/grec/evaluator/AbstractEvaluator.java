package cn.cuc.grec.evaluator;

import cn.cuc.grec.recommender.Recommendable;

public abstract class AbstractEvaluator implements Evaluatable {
    protected Recommendable recommender;

    public AbstractEvaluator(Recommendable recommender) {
        this.recommender = recommender;
    }

    @Override
    public String getResult() {
        return "This is an evaluator. ";
    }
}
