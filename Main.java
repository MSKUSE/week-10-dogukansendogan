
public class Main {
    public static void main(){
    /*
        Stack stack=new StackArray();
        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println(stack.pop());
        stack.peek();
        System.out.println(stack.pop());
        stack.peek();
        System.out.println(stack.pop());

 */
        StackLinkedList stack = new StackLinkedList();
        stack.push(item:5);
        stack.push(item:"it is a string");
        stack.peek();
        System.out.println(stack.top.getItem());
        System.out.println(stack.top.getNext().getItem());
        System.out.println(stack.top.getNext().getItem());
        System.out.println(stack.top.getNext().getNext().getItem());


    }
}