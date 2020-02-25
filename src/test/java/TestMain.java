import cn.cuc.grec.commom.GrecException;
import cn.cuc.grec.data.loader.BasicCsvMatrixLoader;
import cn.cuc.grec.data.BasicDataModel;
import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.data.saver.BasicCsvMatrixSaver;
import cn.cuc.grec.data.splitter.DefaultSplitter;
import cn.cuc.grec.evaluator.BasicEvaluator;
import cn.cuc.grec.evaluator.Evaluatable;
import cn.cuc.grec.filter.BasicFilter;
import cn.cuc.grec.filter.Filtable;
import cn.cuc.grec.recommender.BasicRecommender;
import cn.cuc.grec.recommender.Recommendable;

public class TestMain {
    public static void main(String[] args) throws GrecException {

        // DataModel-数据模型类
        // 创建时需指定加载器、存储器、分割器
        // 可以在创建时载入，也可以在之后的任何时候载入

        // 在创建时载入
        DataModel data = new BasicDataModel(
                // 选择合适的加载器，并指定数据集所在磁盘位置
                new BasicCsvMatrixLoader("D:\\in.csv"),

                // 选择合适的存储器，并指定数据集所在磁盘位置
                new BasicCsvMatrixSaver("D:\\out.csv"),

                // 选择合适的分割器
                new DefaultSplitter()
        ).load();

        // 构建推荐器 -> 将已加载或未加载的数据集传给推荐器的构造函数即可
        // 可在创建时做训练和预测，也可在之后的任何时候做
        // 在推荐器中，可对DataModel使用转换器进行转换 -> 如特征向量转为相似矩阵

        // 在创建时做训练和预测
        Recommendable recommender = new BasicRecommender(data).train().predict();

        // 单独做预测
        recommender.predict();

        // 构建评估器，将推荐器传入评估器构造函数即可完成构建
        // 可在构造时进行评估，也可在之后的任意时间调用evaluate()进行评估

        // 构造评估器并评估
        Evaluatable evaluator = new BasicEvaluator(recommender).evaluate();

        // 单独做评估
        evaluator.evaluate();

        // 获取评估结果
        System.out.println(evaluator.getResult());


        // 将推荐结果传入过滤器构造函数，构建过滤器
        Filtable filter = new BasicFilter(recommender.getResult());

        // 创建另一个过滤器，以便演示合并操作
        Filtable anotherFilter = new BasicFilter(null);

        // 可以流式计算，将结果使用多种配置文件进行过滤和合并
        filter.filt(null)
                .filt(null)
                .merge(anotherFilter)
                .filt(null)
                .merge(filter);


        // 以上除评估器以外的所有操作，均可通过一句话嵌套完成
        // 一句话完成数据的载入、分割、推荐和过滤操作
        Filtable out = new BasicFilter(
                new BasicRecommender(
                        new BasicDataModel(
                                new BasicCsvMatrixLoader(""),
                                new BasicCsvMatrixSaver(""),
                                new DefaultSplitter()
                        ).load()
                ).train()
                 .predict()
                 .getResult()
        ).filt(null)
         .filt(null)
         .merge(new BasicFilter(null));
    }

}
