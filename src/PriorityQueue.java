import java.util.Arrays;
import java.util.List;

public class PriorityQueue {
    Integer[] array;
    int counter;

    public PriorityQueue() {
        array = new Integer[10];
        counter = 0;
    }


    public void add(int number) {
        int tempCounter = 0;
        if (counter == 0) {
            array[0] = number;
            counter++;
            return;
        }
        for (int i = 0; i < counter; i++) {
            if (number < array[i]) break;
            tempCounter++;
        }
        for (int i = counter; i > tempCounter; i--) {
            array[i] = array[i - 1];
        }
        array[tempCounter] = number;
        counter++;
    }

    public List<Integer> toStringAdvanced() {
        return Arrays.asList(Arrays.copyOfRange(array, 0, counter));
    }


    public int remove() {
        if(counter==0)throw new IllegalStateException("The queue is empty!");
        int temp = array[0];
        for (int i = 1; i < counter; i++) {
            array[i - 1] = array[i];
            if (i == counter - 1) array[i] = null;
        }
        counter--;
        return temp;
    }
}
