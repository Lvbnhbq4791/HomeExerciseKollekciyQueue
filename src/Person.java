public class Person {
    public String surname;
    public String name;
    public int numberOfTickets;

    public Person(String surname, String name, int numberOfTickets) {
        this.surname = surname;
        this.name = name;
        this.numberOfTickets = numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
