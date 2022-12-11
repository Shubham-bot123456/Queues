import java.util.*;

public class Main {
    public static void main(String[] args) {
        // this is for queue standard one.
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverseQueueStack(queue);
        System.out.println(queue.toString());

        /*
        now my queue will start.
         */
        NewQueue queueNew=new NewQueue();
      queueNew.add(10);
      queueNew.add(20);
      queueNew .add(30);
      System.out.println(queueNew.remove());
//      System.out.println(queueNew.toStringNewQueue());


      /*
      from here queue using the the two stacks
       */
        QueueUsingTwoStacks queuestack=new QueueUsingTwoStacks();
        queuestack.enqueue(10);
        queuestack.enqueue(20);
//        System.out.println(queuestack.dequeue());
        System.out.println(queuestack.peek());


        /*
        this is implementation of thepriority queue.
         */
        PriorityQueue pQueue=new PriorityQueue();
       pQueue.add(1);
       pQueue.add(3);
       pQueue.add(4);
       pQueue.add(5);
       pQueue.add(2);
       pQueue.add(100);
       pQueue.add(50);
       System.out.println( pQueue.toStringAdvanced());
       System.out.println(pQueue.remove());
        System.out.println( pQueue.toStringAdvanced());

    }

    //this method will reverse a queue.
    public static void reverseQueueArrayList(Queue<Integer> queue) {
        List<Integer> integerList = new ArrayList<>();
        while (!queue.isEmpty()) {
            integerList.add(queue.remove());
        }
        for (int i = integerList.size(); i > 0; i--) {
            queue.add(integerList.get(i - 1));
        }

    }

    public static void reverseQueueStack(Queue<Integer> queue){
        Stack<Integer>stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }

}