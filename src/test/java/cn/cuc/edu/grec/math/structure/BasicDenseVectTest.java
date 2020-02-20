package cn.cuc.edu.grec.math.structure;

import cn.cuc.grec.math.structure.Vect;
import cn.cuc.grec.math.structure.BasicDenseVect;

public class BasicDenseVectTest {
    public static void main(String[] args) {
        double[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(s.length);
        Vect vect = new BasicDenseVect(s);
        System.out.println(vect);
        System.out.println(vect.get(4));
        vect.set(0, 100);
        System.out.println(vect);
    }
}
