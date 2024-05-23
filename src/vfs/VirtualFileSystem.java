package vfs;

import java.util.ArrayList;
import java.util.List;

public class VirtualFileSystem implements IVirtualFileSystem {
    List<Folder> folders;
    List<String> history;

    public VirtualFileSystem() {
        this.folders = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public void createFile(String folderName, String fileName) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                folder.files.add(new File(fileName));
                history.add("Created file '" + fileName + "' in folder '" + folderName + "'");
                return;
            }
        }
        System.out.println("Folder not found.");
    }

    public void deleteFile(String folderName, String fileName) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                for (File file : folder.files) {
                    if (file.name.equals(fileName)) {
                        folder.files.remove(file);
                        history.add("Deleted file '" + fileName + "' from folder '" + folderName + "'");
                        return;
                    }
                }
            }
        }
        System.out.println("File not found.");
    }

    public void createFolder(String folderName) {
        folders.add(new Folder(folderName));
        history.add("Created folder '" + folderName + "'");
    }

    public void deleteFolder(String folderName) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                folders.remove(folder);
                history.add("Deleted folder '" + folderName + "'");
                return;
            }
        }
        System.out.println("Folder not found.");
    }

    public void displayFileSystem() {
        System.out.println("File System:");
        for (Folder folder : folders) {
            System.out.println(folder.name + ":");
            for (File file : folder.files) {
                System.out.println("- " + file.name);
            }
        }
    }

    public void displayHistory() {
        System.out.println("Action History:");
        for (String action : history) {
            System.out.println(action);
        }
    }

    public void writeToFile(String folderName, String fileName, String content) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                for (File file : folder.files) {
                    if (file.name.equals(fileName)) {
                        file.writeContent(content);
                        history.add("Wrote content to file '" + fileName + "' in folder '" + folderName + "'");
                        return;
                    }
                }
            }
        }
        System.out.println("File not found.");
    }

    public void readFromFile(String folderName, String fileName) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                for (File file : folder.files) {
                    if (file.name.equals(fileName)) {
                        System.out.println("Content of file '" + fileName + "':\n" + file.readContent());
                        return;
                    }
                }
            }
        }
        System.out.println("File not found.");
    }

    public void appendToFile(String folderName, String fileName, String content) {
        for (Folder folder : folders) {
            if (folder.name.equals(folderName)) {
                for (File file : folder.files) {
                    if (file.name.equals(fileName)) {
                        file.appendContent(content);
                        history.add("Appended content to file '" + fileName + "' in folder '" + folderName + "'");
                        return;
                    }
                }
            }
        }
        System.out.println("File not found.");
    }
}