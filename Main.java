package stack.java;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Size: "+stack.size());
        System.out.println("Empty: "+stack.IsEmpty());
        System.out.println(stack.pop());
        stack.push(23);
        System.out.println("Size: "+stack.size());
        System.out.println("Empty: "+stack.IsEmpty());
        stack.push(2);
        stack.push(48);
        stack.push(101);
        System.out.println("Size: "+stack.size());
        stack.show();
        stack.push(63);  
        System.out.println("Size: "+stack.size());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println("Size: "+stack.size());
        System.out.println(stack.peek());
        stack.show();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Size: "+stack.size());
        System.out.println("Empty: "+stack.IsEmpty());
        stack.show();
    }
    
}
