package vfs;

public interface IFile {
    public void writeContent(String content);
    public String readContent();
    public void appendContent(String content);
}
