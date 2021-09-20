public class Note {
    public int id;
    public String title;
    public String body;

    public Note(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return  "\n\nNote: #" + this.id + "\n" +
                "Title: " + this.title + "\n" +
                "Body: " + this.body;
    }
}
