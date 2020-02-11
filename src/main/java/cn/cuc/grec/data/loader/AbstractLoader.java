package cn.cuc.grec.data.loader;

public abstract class AbstractLoader implements Loadable{
    protected String url;

    public AbstractLoader(String url) {
        this.url = url;
    }
}
