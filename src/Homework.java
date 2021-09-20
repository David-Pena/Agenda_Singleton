public class Homework {
    public int id;
    public String course;
    public String description;
    public String deadline;

    public Homework(int id, String course, String description, String deadline) {
        this.id = id;
        this.course = course;
        this.description = description;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return  "\n\nAsignment: #" + this.id + "\n" +
                "Course: " + this.course + "\n" +
                "Description: " + this.description + "\n" +
                "Due String: " + this.deadline;
    }
}
