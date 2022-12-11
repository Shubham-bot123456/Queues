import java.util.Arrays;
import java.util.List;

public class NewQueue {
    Integer []array;
    int counter;
    int front=0;

    int rear=0;


    public NewQueue(){
        array=new Integer[10];
        counter=0;
    }


    public void add(int number){
       array[rear]=number;
       rear=(rear+1)%array.length;
       counter++;
    }


    public int remove(){
        int temp=array[front];
        array[front]=0;
        front=
        counter--;
        return temp;
    }


    public List<Integer> toStringNewQueue(){
        Integer []finalArray=Arrays.copyOfRange(array,front,counter);
        return Arrays.asList(finalArray);
    }

}
