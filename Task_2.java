import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Task_2 {
    public static Deque<Integer> multiply (Deque<Integer> number1, Deque<Integer> number2) {             
        Deque<Integer> result = new LinkedList<>();              
        int carry = 0;   
        while (!number1.isEmpty() || !number2.isEmpty()) {
            int temp = (number1.peek() == null ? 0 : number1.poll()) * (number2.peek() == null ? 0 : number2.poll()) + carry;
            int digit = temp % 10;  
            result.addLast(digit);
            carry = temp / 10;
        }
        if (carry != 0) 
            result.addLast(carry); 
        return result;
}

public static void main(String[] args) {
    //Deque<Integer> number1 = new LinkedList<>();
    //Deque<Integer> number2 = new LinkedList<>();
    Deque<Integer> number1 = new ArrayDeque<>();
    Deque<Integer> number2 = new ArrayDeque<>();
    number1.addLast(1);
    number1.addLast(-34);
    number1.addLast(1);

    number2.addLast(6);
    number2.addLast(9);

    int sum = 0;
      while (!number1.isEmpty() || !number2.isEmpty()) {
        if (!number1.isEmpty()){
            sum += number1.removeLast();
        }
        if (!number2.isEmpty()){
            sum += number2.removeLast();
        }
      }
      System.out.println(sum);
}
}

