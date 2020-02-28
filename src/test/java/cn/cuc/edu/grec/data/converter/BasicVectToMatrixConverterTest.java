package cn.cuc.edu.grec.data.converter;

import cn.cuc.grec.data.converter.BasicVectToMatrixConverter;
import cn.cuc.grec.data.converter.Convertible;
import cn.cuc.grec.math.structure.BasicDenseVect;
import cn.cuc.grec.math.structure.Vect;

public class BasicVectToMatrixConverterTest {
    public static void main(String[] args) {
       double row0[] = {1,2,3,4};
       double row1[] = {5,6,7};
       double row2[] = {8,9,0,1,2,3};

        Vect[] data = new Vect[3];

        data[0] = new BasicDenseVect(row0);
        data[1] = new BasicDenseVect(row1);
        data[2] = new BasicDenseVect(row2);


        Convertible converter = new BasicVectToMatrixConverter(data);
        //converter.convert();
        System.out.println(converter.getDataSet());
    }
}
