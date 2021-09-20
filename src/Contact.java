import java.util.Date;

public class Contact {
    public int id;
    public String name;
    public String lastname;
    public String number;
    public Date created;

    public Contact(int id, String name, String lastname, String number, Date created) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.created = created;
    };

    @Override
    public String toString() {
        return  "\n\nContact: #" + this.id + "\n" + 
                "Name: " + this.name + "" + this.lastname + "\n" +
                "Phone: " + this.number + "\n" +
                "Created at: " + this.created;
    }
}
