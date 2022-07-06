public class FirstClass {
    public static void main(String[] args) {
//        Notebook notebook = new Notebook(600,750, 2021);
//        System.out.println(notebook.weight + " " + notebook.price);
//        notebook.checkPrice();
//        Notebook heavyNotebook = new Notebook(200,390, 2018);
//        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
//        heavyNotebook.checkPrice();
//        Notebook oldNotebook = new Notebook(1200,1200, 1999);
//        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
//        oldNotebook.checkPrice();


        Grades gradesObject = new Grades();
        System.out.println("size before add: " + gradesObject.size);

        gradesObject.add(5);
        gradesObject.add(3);
        gradesObject.add(6);
        gradesObject.add(4);
        gradesObject.add(4);

        System.out.println("size after add: " + gradesObject.size);
        System.out.println("value on first position: " + gradesObject.grades[0]);
        System.out.println("last grade: " + gradesObject.getLastGrade());
        System.out.println("average: " + gradesObject.getAverage());
    }
}