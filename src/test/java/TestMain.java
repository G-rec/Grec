import cn.cuc.grec.commom.GrecException;
import cn.cuc.grec.data.loader.BasicMatrixLoader;
import cn.cuc.grec.data.BasicDataModel;
import cn.cuc.grec.data.DataModel;
import cn.cuc.grec.data.saver.BasicMareixSaver;
import cn.cuc.grec.data.splitter.BasicSplitter;
import cn.cuc.grec.evaluator.BasicEvaluator;
import cn.cuc.grec.evaluator.Evaluatable;
import cn.cuc.grec.filter.BasicFilter;
import cn.cuc.grec.filter.Filtable;
import cn.cuc.grec.recommender.BasicRecommender;
import cn.cuc.grec.recommender.Recommendable;

public class TestMain {
    public static void main(String[] args) throws GrecException {
//        System.out.println("Hello World. ");

        double[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 先这么写……理想状态应该是先构建，就是一堆new之后，再统一载入数据之类的计算

        Filtable out = new BasicFilter(
                new BasicRecommender(
                    new BasicDataModel(
                            new BasicMatrixLoader(""),
                            new BasicMareixSaver(""),
                            new BasicSplitter()
                    ).load()
                ).train()
                .predict()
                .getResult()).filt()
                             .filt()
                             .merge(new BasicFilter(null));

        // 载入数据
        DataModel data = new BasicDataModel(
                new BasicMatrixLoader(""),
                new BasicMareixSaver(""),
                new BasicSplitter());
        data.load();

        // 如何转换应该也是推荐器的事情
        Recommendable recommender = new BasicRecommender(data);
        recommender.train();
        recommender.predict();

        Evaluatable evaluator = new BasicEvaluator(recommender);
        evaluator.evaluate();
        System.out.println(evaluator.getResult());

        Filtable filter = new BasicFilter(recommender.getResult());
        Filtable anotherFilter = new BasicFilter(null);

        filter.filt()
                .filt()
                .merge(anotherFilter)
                .filt()
                .merge(filter);

        for (double[] doubles : m) {
            for (double i : doubles) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}
