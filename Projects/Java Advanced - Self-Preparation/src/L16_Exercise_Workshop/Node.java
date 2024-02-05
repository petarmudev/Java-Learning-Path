package L16_Exercise_Workshop;

public class Node {
    //current int value
    public int currentValue;
    //previous element
    public Node previous;
    //next element
    public Node next;

    public Node(int currentValue){
        this.currentValue = currentValue;
    }
    //Printing -> only the Node's currentValue -> String
    @Override
    public String toString() {
        return this.currentValue+""; //String
    }


    
}
