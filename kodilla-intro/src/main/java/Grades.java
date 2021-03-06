import java.lang.reflect.Array;
import java.util.Arrays;

public class Grades {
    public int[] grades;
    public int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade()
    {
        int lastGrade = this.grades[this.size - 1];
        return lastGrade;
    }

    public int getAverage() {
        int sum = 0;

        for (int i=0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }

        int average = sum / this.size;

        return average;
    }
}
