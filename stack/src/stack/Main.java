package stack;
public class Main{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString() + "Topo: " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.toString() + "\n" +"Topo: "+ stack.peek() );
    }
}