import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queueOfVisitors = new LinkedList<>(generateClients());
        String t = " - прокатился на атракционе";
        int counter = 1;
        while (!queueOfVisitors.isEmpty()) {
            Person client = queueOfVisitors.poll();
            if (client.numberOfTickets > 0) {
                System.out.println(counter + ". " + client.surname + " " + client.name + t);
                counter++;
                client.setNumberOfTickets(client.numberOfTickets - 1);
                if (client.numberOfTickets != 0) {
                    queueOfVisitors.add(client);
                }
            } else {
                System.out.println(client.surname + " " + client.name +
                        " - Не корректное колличество билетов ");
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> listOfClients = new LinkedList<>();
        Person client1 = new Person("Кормщиков", "Иван", 3);
        listOfClients.add(client1);
        Person client2 = new Person("Гурдин", "Саша", 4);
        listOfClients.add(client2);
        Person client3 = new Person("Зубарев", "Андрей", 6);
        listOfClients.add(client3);
        Person client4 = new Person("Усынина", "Лена", 3);
        listOfClients.add(client4);
        Person client5 = new Person("Бутыркин", "Коля", 7);
        listOfClients.add(client5);
        return listOfClients;
    }
}
