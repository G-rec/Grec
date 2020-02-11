package cn.cuc.grec.data;

import cn.cuc.grec.data.converter.Convertable;
import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.data.saver.Savable;
import cn.cuc.grec.data.splitter.Splitable;
import cn.cuc.grec.math.structure.DataSet;

public abstract class AbstractDataModel implements DataModel {
    protected Loadable loader;
    protected Savable saver;
    protected Convertable converter;
    protected Splitable splitter;

    protected DataSet inData;
    protected DataSet trainData;
    protected DataSet predictData;

    public AbstractDataModel(Loadable loader, Savable saver, Splitable splitter) {
        this.loader = loader;
        this.saver = saver;
        this.splitter = splitter;

        this.inData = null;
        this.trainData = null;
        this.predictData = null;
    }

    public AbstractDataModel(@org.jetbrains.annotations.NotNull Convertable converter) {
        this.converter = converter;
        this.converter.convert();
        this.inData = converter.getDataModel();
    }

    @Override
    public void load() {
        this.inData = (DataSet) this.loader.load();
    }

    @Override
    public void save() {
        this.saver.save(this.inData);
    }

    @Override
    public void split() {
        this.splitter.split(this.inData);
        this.trainData = this.splitter.getTrainData();
        this.predictData = this.splitter.getPredictData();
    }

    @Override
    public DataSet getTrainData() {
        return this.trainData;
    }

    @Override
    public DataSet getPredictData() {
        return this.predictData;
    }
}
