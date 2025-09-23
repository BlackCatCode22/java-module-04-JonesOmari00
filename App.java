import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
    int size = 100000;

    List<Integer> arrayList = new ArrayList<>();
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < size; i++) {
        arrayList.add(i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Added" + size + " elements in ArrayList");
        {

            List<Integer> vector = new Vector<>();
            startTime = System.currentTimeMillis();

            for (int i = 0; i < size; i++) {
                vector.add(i);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Added" + size + " elements in Vector");
        }

    }
}