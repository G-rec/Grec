package cn.cuc.grec.evaluator;

import cn.cuc.grec.recommender.Recommendable;

public class BasicEvaluator extends AbstractEvaluator {


    public BasicEvaluator(Recommendable recommender) {
        super(recommender);
    }

    @Override
    public Evaluatable evaluate() {

        return this;
    }

    @Override
    public String getResult() {
        return "This is an evaluator. ";
    }

}
