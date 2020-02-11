package cn.cuc.grec.data.saver;

public abstract class AbstractSaver implements Savable {
    protected String url;

    public AbstractSaver(String url) {
        this.url = url;
    }
}
