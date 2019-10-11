package entities;

public class Directory extends File {
    public Directory(String path) {
        super(true, path);
        setSize(getSize(path));
    }

    public long getSize(String path){
        long size = 0;
        java.io.File file = new java.io.File(path);
        for (java.io.File child : file.listFiles()){
            size+= child.length();
        }
        return size;
    }
}
