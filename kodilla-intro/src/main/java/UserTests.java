public class UserTests {

    public static void main(String[] args) {
        User kamila = new User ();
        kamila.Age = 15;
        kamila.Name = "Kamila Kowalska";

        User albert = new User ("Albert", 53);
        User dominik = new User ("Dominik", 19);

        User[] users= {kamila, albert, dominik};


        int ageSum = 0;

        for (int i = 0; i < users.length; i++) {

            User currentUser = users[i];

            ageSum += currentUser.Age;
        }

        var averageAge = ageSum / users.length;

        for (User user : users){
            if (user.Age < averageAge) {
                System.out.println(user.Name);
            }
        }
    }
}
