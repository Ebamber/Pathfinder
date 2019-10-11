package entities;

public abstract class File {

    private boolean isDir;
    private long size;
    private String path;

    public File(boolean isDir, String path){
        this.isDir = isDir;
        this.path = path;
    }

    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean dir) {
        isDir = dir;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String toString(){
        return (isDir? "DIR" : "FILE") + " " + path + " " + size;
    }

}
