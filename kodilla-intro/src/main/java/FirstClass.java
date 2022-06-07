public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,750, 2021);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        Notebook heavyNotebook = new Notebook(200,390, 2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        Notebook oldNotebook = new Notebook(1200,1200, 1999);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
    }
}