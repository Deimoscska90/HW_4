import java.util.Deque;
import java.util.LinkedList;

public class Task_1 {
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
    Deque<Integer> number1 = new LinkedList<>();
    Deque<Integer> number2 = new LinkedList<>();
    
    number1.addLast(1);
    number1.addLast(3);
    number1.addLast(1);

    number2.addLast(6);
    number2.addLast(9);

    Deque<Integer> result = multiply(number1, number2);
    
    while (!result.isEmpty()) 
        System.out.print(result.pollLast());
}
}

