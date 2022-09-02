import java.util.*;

class Main {
  public static void main(String[] args){
  
  ArrayDeque<Integer> queue = new ArrayDeque<>();

    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);
  
  System.out.println(queue.peek());
  
  ArrayDeque<String> numbers = new ArrayDeque<>();
  
    numbers.offer("Zero");
    numbers.offer("One");
    numbers.offer("Two");
    numbers.offer("Three");
    numbers.offer("Four");
    numbers.offer("Five");
    for (String list: numbers){
     System.out.println(numbers.poll());
}
}
}