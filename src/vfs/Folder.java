package vfs;

import java.util.ArrayList;
import java.util.List;

class Folder {
    String name;
    List<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }
}
