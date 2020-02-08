package com.cuc.grec.commom;

/**
 * Exception thrown when a matrix or vector is accessed at an index, or dimension,
 * which does not logically exist in the entity.
 *
 * @author Liming Liu
 */
public class IndexOutOfRangeException extends IllegalArgumentException {
    /**
     * Construct a new index out of range exception with the from the given
     * format.
     *
     * @param index       the index that the function attempted to get.
     * @param cardinality the MAXIMUM index that this data structure supports.
     */
    public IndexOutOfRangeException(int index, int cardinality) {
        super("Index " + index + " is outside allowable range of [0," + cardinality + ')');
    }

    /**
     * Constructs a new index out of range exception with the specified
     * detail message and cause.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public IndexOutOfRangeException(String message) {
        super(message);
    }
}
