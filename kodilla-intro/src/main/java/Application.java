public class Application {

    public static void main(String[] args) {

        Human human = new Human();
        human.Name= "Adam";
        human.Age = 40.5;
        human.Height = 178;

        if ( human.Name != null) {
            if (human.Age > 30 && human.Height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
