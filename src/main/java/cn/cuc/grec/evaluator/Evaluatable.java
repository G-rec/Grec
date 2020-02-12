package cn.cuc.grec.evaluator;

public interface Evaluatable {
    // 对分割后的训练数据才能评估。算方差啊什么的
    Evaluatable evaluate();

    Object getResult();
}
