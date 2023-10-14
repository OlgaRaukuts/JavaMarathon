package day13;

public class Task1 {
    public static void main(String[] args) {
    User user1 = new User("user1");
    User user2 = new User("user2");
    User user3 = new User("user3");

    user1.sendMessage(user2, "Hello, Vasia");
    user1.sendMessage(user2, "How are you?");

    user2.sendMessage(user1,"Hello, Venya!");
    user2.sendMessage(user1, "Everything is fine.");
    user2.sendMessage(user1,"How are you?");

    user3.sendMessage(user1, "Venya, do you want to go to a park?");
    user3.sendMessage(user1,"The park is Bernardus Park, near Amsterdam");
    user3.sendMessage(user1,"or you can suggest any other location");

    user1.sendMessage(user3,"it's too windy today");
    user1.sendMessage(user3,"maybe tomorrow or next week");
    user1.sendMessage(user3, "or we can go to the museum");

    user3.sendMessage(user1,"Deal");

    MessageDatabase.showDialog(user1,user3);

    }
}
