package cn.cuc.grec.data;

import cn.cuc.grec.data.converter.Convertable;
import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.data.saver.Savable;
import cn.cuc.grec.data.splitter.Splitable;
import cn.cuc.grec.math.structure.DataSet;
import org.jetbrains.annotations.NotNull;

public class BasicDataModel implements DataModel{
    protected Loadable loader;
    protected Savable saver;
    protected Convertable converter;
    protected Splitable splitter;

    protected DataSet inData;
    protected DataSet trainData;
    protected DataSet predictData;

    public BasicDataModel(Loadable loader, Savable saver, Splitable splitter) {
        this.loader = loader;
        this.saver = saver;
        this.splitter = splitter;

        this.inData = null;
        this.trainData = null;
        this.predictData = null;
    }

    public BasicDataModel(@org.jetbrains.annotations.NotNull Convertable converter) {
        this.converter = converter;
        this.converter.convert();
        this.inData = converter.getDataModel();
    }

    @Override
    public DataModel load() {
        this.inData = (DataSet) this.loader.load();
        return this;
    }

    @Override
    public DataModel save() {
        this.saver.save(this.inData);
        return this;
    }

    @Override
    public DataModel split() {
        this.splitter.split(this.inData);
        this.trainData = this.splitter.getTrainData();
        this.predictData = this.splitter.getPredictData();
        return this;
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
