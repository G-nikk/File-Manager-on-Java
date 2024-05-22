package vfs;

class File {
    String name;
    String content;

    public File(String name) {
        this.name = name;
        this.content = "";
    }

    public void writeContent(String content) {
        this.content = content;
    }

    public String readContent() {
        return this.content;
    }

    public void appendContent(String content) {
        this.content += content;
    }
}
