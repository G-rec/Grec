package cn.cuc.grec.data.saver;

import cn.cuc.grec.math.structure.DataSet;
import cn.cuc.grec.math.structure.Matrix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BasicCsvMatrixSaver extends AbstractSaver {
    protected String splitSign = ",";
    public BasicCsvMatrixSaver(String url) {
        super(url);
    }

    @Override
    public void save(DataSet o) {
        if (o instanceof Matrix) {
            Matrix m = (Matrix) o;
            BufferedWriter fileWriter = null;
            try {
                fileWriter = new BufferedWriter(new FileWriter(this.url));
                int rowSize = m.rowSize();
                int colSize = m.columnSize();
                for (int i = 0; i < rowSize; i++) {
                    for (int j = 0; j < colSize; j++) {
                        fileWriter.write(m.get(i, j) + (j == colSize - 1 ? "\n" : this.splitSign));
                    }
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            } finally {
                try {
                    assert fileWriter != null;
                    fileWriter.close();
                } catch (IOException ignored) {
                }
            }
        }
    }
}
