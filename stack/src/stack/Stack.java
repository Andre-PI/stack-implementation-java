package stack;
public class Stack{
    Node top; int size;
    public Stack(){
        this.top = null;
        this.size = 0;
    }

    
    public int size(){
        return this.size;
    }
    

    public String peek(){
        return this.top.data.toString().toString();
    }

    public void push(Object element){
        Node node = new Node(element);
        if (size() == 0){
            this.top = node;
        }else{
            node.next = this.top;
            this.top = node;
        }
        this.size += 1;
    }
    public void pop(){
        if (size() == 0){
            System.out.println("Empty Stack");
            System.exit(1);
        }
        this.top = this.top.next;
        this.size -= 1;
    }
    public String toString(){
        StringBuilder stringCreated = new StringBuilder(); 
        if(size == 0){
            return "Empty Stack";
        }
        Node actual = this.top;
        while(actual != null){
            stringCreated.append(actual.data.toString() + "\n");
            actual = actual.next;
        }
        return stringCreated.toString().toString();
        
    }
}