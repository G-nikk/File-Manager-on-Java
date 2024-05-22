package vfs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualFileSystem vfs = new VirtualFileSystem();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\\Create File\\Delete File\\Create Folder\\Delete Folder\\Display File System\\Display History\\Exit");
            System.out.println("\\Write to File\\Read from File\\Append to File");
            System.out.print("Enter one of the commands above: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "Create File":
                    System.out.print("Enter folder name: ");
                    String createFolderName = scanner.nextLine();
                    System.out.print("Enter file name: ");
                    String createFileName = scanner.nextLine();
                    vfs.createFile(createFolderName, createFileName);
                    break;
                case "Delete File":
                    System.out.print("Enter folder name: ");
                    String deleteFolderName = scanner.nextLine();
                    System.out.print("Enter file name: ");
                    String deleteFileName = scanner.nextLine();
                    vfs.deleteFile(deleteFolderName, deleteFileName);
                    break;
                case "Create Folder":
                    System.out.print("Enter folder name: ");
                    String newFolderName = scanner.nextLine();
                    vfs.createFolder(newFolderName);
                    break;
                case "Delete Folder":
                    System.out.print("Enter folder name to delete: ");
                    String folderToDelete = scanner.nextLine();
                    vfs.deleteFolder(folderToDelete);
                    break;
                case "Display File System":
                    vfs.displayFileSystem();
                    break;
                case "Display History":
                    vfs.displayHistory();
                    break;
                case "Write to File":
                    System.out.print("Enter folder name: ");
                    String writeFolderName = scanner.nextLine();
                    System.out.print("Enter file name: ");
                    String writeFileName = scanner.nextLine();
                    System.out.print("Enter content to write: ");
                    String writeContent = scanner.nextLine();
                    vfs.writeToFile(writeFolderName, writeFileName, writeContent);
                    break;
                case "Read from File":
                    System.out.print("Enter folder name: ");
                    String readFolderName = scanner.nextLine();
                    System.out.print("Enter file name: ");
                    String readFileName = scanner.nextLine();
                    vfs.readFromFile(readFolderName, readFileName);
                    break;
                case "Append to File":
                    System.out.print("Enter folder name: ");
                    String appendFolderName = scanner.nextLine();
                    System.out.print("Enter file name: ");
                    String appendFileName = scanner.nextLine();
                    System.out.print("Enter content to append: ");
                    String appendContent = scanner.nextLine();
                    vfs.appendToFile(appendFolderName, appendFileName, appendContent);
                    break;
                case "Exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
    }
}