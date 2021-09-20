import java.util.Arrays;

public class Agenda {
    // Declare our attributes
    private Calendar[] calendar;
    private Contact[] contactsDirectory;
    private Homework[] homeworks;
    private Note[] notes;
    // Declare static instance
    private static Agenda agenda;

    private Agenda(Calendar[] calendar, Contact[] contactsDirectory, Homework[] homeworks, Note[] notes) {
        this.calendar = calendar;
        this.contactsDirectory = contactsDirectory;
        this.homeworks = homeworks;
        this.notes = notes;
    };

    public static Agenda getInstance(Calendar[] calendar, Contact[] contactsDirectory, Homework[] homeworks, Note[] notes) {
        if (agenda == null) {
            agenda = new Agenda(calendar, contactsDirectory, homeworks, notes);
        }else {
            System.out.println("\nYOU CANNOT CREATE A NEW INSTANCE SO WE SET THE REFERENCE TO THE ONE ALREADY CREATED!!!\n");
        }
        return agenda;
    };

    // Getter
    public Object getCalendar() {
        return calendar;
    }

    public Object getContactsDirectory() {
        return contactsDirectory;
    }

    public Object getHomeworks() {
        return homeworks;
    }

    public Object getNotes() {
        return notes;
    }

    // Setter
    public void setCalendar(Calendar[] newCalendar) {
        this.calendar = newCalendar;
    }

    public void setContactsDirectory(Contact[] newContactsDirectory) {
        this.contactsDirectory = newContactsDirectory;
    }

    public void setHomeworks(Homework[] newHomeworks) {
        this.homeworks = newHomeworks;
    }

    public void setNotes(Note[] newNotes) {
        this.notes = newNotes;
    }

    @Override
    public String toString(){
        return  "Hi, This is your Agenda!\n" + 
                "Here you can check your categories values\n" +
                "\nCalendar: " + Arrays.toString(this.calendar) + "\n" +
                "\nContacts Directory: " + Arrays.toString(this.contactsDirectory) + "\n" +
                "\nList of Homeworks: " + Arrays.toString(this.homeworks) + "\n" +
                "\nList of Notes: " + Arrays.toString(this.notes) + "\n" + 
                "------------------------";
    }
}
