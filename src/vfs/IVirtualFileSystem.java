package vfs;

public interface IVirtualFileSystem {
    public void createFile(String folderName, String fileName);
    public void deleteFile(String folderName, String fileName);
    public void createFolder(String folderName);
    public void deleteFolder(String folderName);
    public void displayFileSystem();
    public void displayHistory();
    public void writeToFile(String folderName, String fileName, String content);
    public void readFromFile(String folderName, String fileName);
    public void appendToFile(String folderName, String fileName, String content);
}
