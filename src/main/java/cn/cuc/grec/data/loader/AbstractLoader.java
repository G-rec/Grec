package cn.cuc.grec.data.loader;

/**
 * The AbstractLoader do the basic job for a loader such as setting the
 * url of the file or database. You can override the constructor if you need.
 *
 * Note that you are not recommend to write your loading logic in the constructor
 * due to Lazy Loading purpose.
 *
 * @author Liming Liu
 */
public abstract class AbstractLoader implements Loadable{
    protected String url;

    public AbstractLoader(String url) {
        this.url = url;
    }
}
