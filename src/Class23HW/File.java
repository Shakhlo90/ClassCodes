package Class23HW;

public abstract  class File {
    abstract void open();

    void edit() {
        System.out.println("editing text");
    }

    void close() {
        System.out.println("closing webdriver");

    }
}
    class JavaFile extends File {
      public   void open() {
            System.out.println("need notepad++");
        }

    }

    class WordFile extends File{
        public  void open() {
            System.out.println("Microsoft word we need to open");
        }
        @Override
        void close(){
            System.out.println("close Micrasoft word");
        }
    }

    class PdFile extends File{
       public  void open(){
            System.out.println(" need Akrabat to open pdffiles");
        }

    }


