import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
        if(l.peekFirst()==null){
            l.push(n);
        }
        else{
            Node tmp = l.peek();
            while(tmp.getPriority<n.getPriority){
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
        }
	
    }

    public Node remove(){
	Node r = l.remove();
	return r;
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










