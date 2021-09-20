import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Calendar[] calendarList = new Calendar[2];
        Contact[] contactList = new Contact[2];
        Homework[] homeworkList = new Homework[2];
        Note[] noteList = new Note[2];

        calendarList[0] = new Calendar(1, "Empty", "Everything is done", "Empty", "Empty", "Empty");
        calendarList[1] = new Calendar(2, "Exams", "Everything is done", "Empty", "Go shopping", "Everything is done");

        contactList[0] = new Contact(1, "Salome", "Otero", "4012076136", new Date());
        contactList[1] = new Contact(2, "Little", "Velvet", "No phone", new Date());

        homeworkList[0] = new Homework(1, "Data Structures", "What is a binary tree?", "23/09/2021");
        homeworkList[1] = new Homework(2, "Fundamentals of CS", "What is CS?", "23/09/2021");

        noteList[0] = new Note(1, "Go grocery shopping", "Buy milk, bread and potatoes");
        noteList[1] = new Note(2, "Go shopping", "I need some pants to work");

        Agenda agenda = Agenda.getInstance(calendarList, contactList, homeworkList, noteList);
        Agenda agenda2 = Agenda.getInstance(null, null, null, null);

        System.out.println(agenda.toString());
    }
} 
