package cn.cuc.grec.data;

import cn.cuc.grec.data.converter.Convertable;
import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.data.saver.Savable;
import cn.cuc.grec.data.splitter.Splitable;
import org.jetbrains.annotations.NotNull;

public class BasicMatrixDataModel extends AbstractDataModel {

    public BasicMatrixDataModel(Loadable loader, Savable saver, Splitable splitter) {
        super(loader, saver, splitter);
    }

    public BasicMatrixDataModel(@NotNull Convertable converter) {
        super(converter);
    }
}
