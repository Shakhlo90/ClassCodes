package Class23HW;

public class TestFile {
    public static void main(String[] args) {
        JavaFile java = new JavaFile()
;
        java.open();
        java.close();
        java.edit();
WordFile wordFile= new WordFile();
wordFile.open();
PdFile pd= new PdFile();
pd.close();
    }
}

