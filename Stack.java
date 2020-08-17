package stack.java;

public class Stack {

    int elements = 2;
    int stack[] = new int[elements];
    int top = 0;

    public void push(int data) {

        if (top < elements) {
            stack[top++] = data;
        } else {
            resize();
            stack[top++] = data;
        }
    }

    public void show() {
        for (int i = (top - 1); i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        return stack[top - 1];
    }

    public int pop() {
        if (!IsEmpty()) {
            if(top <= elements /3)
                resize();
            return stack[(top--) - 1];
        } else {
            System.out.println("Stack is empty!");
            return 0;
        }
    }

    public int size() {
        return top;
    }

    public boolean IsEmpty() {
        return top <= 0;
    }

    private void resize() {
        if (top >= elements) {
            int temp[] = new int[elements * 2];
            for (int i = 0; i < elements; i++) {
                temp[i] = stack[i];
            }
            elements *= 2;
            stack = temp;

        } else {
            int temp[] = new int[elements / 2];
            for (int i = 0; i < elements / 2; i++) {
                temp[i] = stack[i];
            }
            elements /= 2;
            stack = temp;
        }
        
        System.out.println("Rezaized: "+ elements);
    }
}
