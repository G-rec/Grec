package cn.cuc.grec.data.saver;

/**
 * The AbstractSaver do the basic job for a Saver such as setting the
 * url of the file or database. You can override the constructor if you need.
 *
 * Note that you are not recommend to write your Saving logic in the constructor
 * due to Lazy Saving purpose.
 *
 * @author Liming Liu
 */
public abstract class AbstractSaver implements Savable {
    protected String url;

    public AbstractSaver(String url) {
        this.url = url;
    }
}
