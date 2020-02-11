package cn.cuc.grec.data.saver;

import cn.cuc.grec.math.structure.Matrix;

public class BasicMareixSaver extends AbstractSaver {

    public BasicMareixSaver(String url) {
        super(url);
    }

    @Override
    public void save(Object o) {
        Matrix m = (Matrix)o;
    }
}
