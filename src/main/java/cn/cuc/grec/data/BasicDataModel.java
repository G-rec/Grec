package cn.cuc.grec.data;

import cn.cuc.grec.data.converter.Convertible;
import cn.cuc.grec.data.loader.Loadable;
import cn.cuc.grec.data.saver.Savable;
import cn.cuc.grec.data.splitter.DefaultSplitter;
import cn.cuc.grec.data.splitter.Splittable;
import cn.cuc.grec.math.structure.DataSet;
import org.jetbrains.annotations.NotNull;

public class BasicDataModel implements DataModel{
    protected Loadable loader;
    protected Savable saver;
    protected Convertible converter;
    protected Splittable splitter;

    protected DataSet inData;
    protected DataSet trainData;
    protected DataSet predictData;

    protected boolean isLoaded;
    protected boolean isSplitted;

    public BasicDataModel(@NotNull Loadable loader, Savable saver, Splittable splitter) {
        this.loader = loader;
        this.saver = saver;
        this.splitter = splitter;

        this.isLoaded = false;
        this.isSplitted = false;
    }

    public BasicDataModel(@NotNull Convertible converter, Savable saver, Splittable splitter) {
        this.converter = converter;
        this.saver = saver;
        this.splitter = splitter;

        this.isLoaded = false;
        this.isSplitted = false;
    }

    @Override
    public DataModel load(){
        if (this.loader != null) {
            this.inData = this.loader.load();
        }
        else if (this.converter != null) {
            this.converter.convert();
            this.inData = converter.getDataSet();
        }
        this.isLoaded = true;
        this.isSplitted = false;
        return this;
    }

    @Override
    public DataModel save() {
        if (!this.isLoaded) {
            this.load();
        }
        if (this.saver != null) {
            this.saver.save(this.inData);
        }
        return this;
    }

    @Override
    public DataModel split() {
        if (!this.isLoaded) {
            this.load();
        }
        if (this.splitter == null) {
            this.splitter = new DefaultSplitter();
        }
        this.splitter.split(this.inData);
        this.trainData = this.splitter.getTrainData();
        this.predictData = this.splitter.getPredictData();
        return this;
    }

    @Override
    public DataSet getTrainData() {
        if (!this.isSplitted) {
            this.split();
        }
        return this.trainData;
    }

    @Override
    public DataSet getPredictData() {
        if (!this.isSplitted) {
            this.split();
        }
        return this.predictData;
    }
}
