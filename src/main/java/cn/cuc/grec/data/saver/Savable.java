package cn.cuc.grec.data.saver;

import cn.cuc.grec.math.structure.DataSet;

/**
 * A class that implements Savable can save data to disk, database, etc.
 *
 * It is recommend to judge if the param is the instance of the form you want
 * and transfer it to that form before run your saving logic code.
 *
 * @author Liming Liu
 */
public interface Savable {
    /**
     * Function to save your DataSet.
     * Your Saving logic is here instead of the constructor.
     *
     * @param o the DataSet you want to save
     */
    void save(DataSet o);
}
