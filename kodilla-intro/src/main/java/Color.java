public class Color {
    public static String GetColor(Character firstLetter) {
        switch (firstLetter) {
            case 'R':
                return "Red";
            case 'G':
                return "Green";
            case 'B':
                return "Blue";
            default:
                return "Nie ma takiego koloru";
        }
    }

    public static void main(String[] args) {
        System.out.println(GetColor('G'));
    }
}
