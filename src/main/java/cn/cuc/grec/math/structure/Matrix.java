package cn.cuc.grec.math.structure;

import cn.cuc.grec.commom.IndexOutOfRangeException;

import java.util.Vector;

/**
 * An abstract Matrix definition that gives the basic ways to manipulate
 * and access the data.
 *
 * @author Liming Liu
 */
public interface Matrix extends Cloneable, DataSet {
    /**
     * @return a clone of the recipient
     */
    Matrix clone();

    /**
     * Return the value at the given index.
     *
     * @param row    an int row index
     * @param column an int column index
     * @return the double value at the index
     * @throws IndexOutOfRangeException if the index is out of bounds
     */
    double get(int row, int column) throws IndexOutOfRangeException;

    /**
     * Set the value at the given index.
     *
     * @param row    an int row index into the receiver
     * @param column an int column index into the receiver
     * @param value  a double value to set
     * @throws IndexOutOfRangeException if the index is out of bounds
     */
    void set(int row, int column, double value) throws IndexOutOfRangeException;

    /**
     * Return a new copied row of the given index.
     * Note that the data in the matrix will NOT be modified once the returned
     * Vector is changed.
     *
     * @param rowIndex the index of the row you want to take
     * @return a copy of the row you need
     * @throws IndexOutOfRangeException if the index is out of bounds
     */
    Vect getRow(int rowIndex) throws IndexOutOfRangeException;

    /**
     * Return a reference to a row.
     * Note that the data in the Vector share the same storage with the matrix data,
     * so any modification will be applied to the raw matrix.
     *
     * @param rowIndex the index of the row you want to take
     * @return a reference of the row you need
     * @throws IndexOutOfRangeException if the index is out of bounds
     */
    Vect viewRow(int rowIndex) throws IndexOutOfRangeException;

    /**
     * Return a new copied column of the given index.
     * Note that the data in the matrix will NOT be modified once the returned
     * Vector is changed.
     *
     * @param colIndex the index of the column you want to take
     * @return a copy of the column you need
     * @throws IndexOutOfRangeException if the index is out of bounds
     */
    Vect getCol(int colIndex) throws IndexOutOfRangeException;

    /**
     * Return a reference to a column.
     * Note that the data in the Vector share the same storage with the matrix data,
     * so any modification will be applied to the raw matrix.
     *
     * @param rowIndex the index of the column you want to take
     * @return a reference of the column you need
     * @throws IndexOutOfRangeException if the index is out of bounds
     */
    Vect viewCol(int rowIndex) throws IndexOutOfRangeException;

    /**
     * @return a formatted String suitable for output
     */
    String toString();

    /**
     * @return the number of rows in the matrix
     */
    int columnSize();

    /**
     * @return the number of rows in the matrix
     */
    int rowSize();

    /**
     * @return whether the Matrix can access to the data in O(1)
     */
    boolean isRandomAccess();
}