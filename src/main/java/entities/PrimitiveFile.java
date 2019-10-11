package entities;

public class PrimitiveFile extends File {
    public PrimitiveFile(String path) {
        super(false,path);
        setSize(getSize(path));
    }

    private long getSize(String path) {
        java.io.File file = new java.io.File(path);
        return file.length();
    }
}
