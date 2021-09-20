public class Calendar {
    public int week;
    public String monday;
    public String tuesday;
    public String wednesday;
    public String thursday;
    public String friday;

    public Calendar(int week, String monday, String tuesday, String wednesday, String thursday, String friday) {
        this.week = week;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }

    @Override
    public String toString() {
        return  "\n\nWeek: #" + this.week + "\nMonday: " + this.monday + "\nTuesday: " + this.tuesday + "\nWednesday: " + this.wednesday + 
                "\nThursday: " + this.thursday + "\nFriday: " + this.friday;
    };
}
