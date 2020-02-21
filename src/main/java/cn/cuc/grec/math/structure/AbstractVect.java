package cn.cuc.grec.math.structure;

/**
 * An abstract Matrix that provide the basic function such as toString().
 *
 * @author Liming Liu
 */
public abstract class AbstractVect implements Vect{
    protected int size;

    public AbstractVect(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{ ");
        int vectSize = this.size();
        for (int i = 0; i < vectSize - 1 && i < 9; i++) {
            s.append(this.get(i));
            s.append(", ");
        }
        if (vectSize <= 10) {
            s.append(this.get(vectSize - 1));
            s.append(" }");
        } else {
            s.append(this.get(9));
            s.append(", ... }");
        }
        return s.toString();
    }
}
