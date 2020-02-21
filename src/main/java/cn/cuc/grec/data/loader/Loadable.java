package cn.cuc.grec.data.loader;

import cn.cuc.grec.math.structure.DataSet;

/**
 * A class that implements Loadable can load data from disk, database, etc.
 *
 * Please write your loading logic in load function instead of the constructor
 * for Lazy Loading.
 *
 * @author Liming Liu
 */
public interface Loadable {

    /**
     * Your loading logic is here instead of the constructor.
     *
     * @return the loaded database
     */
    DataSet load();
}
