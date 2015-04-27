public class Tree{
	private Node root;
	public Tree(Node r){
		root = r;
	}
	public void insert(Node n){
		Node tmp = root;
		myData = n.getData();
		while(tmp!=null){
			if(myData > tmp.getData()) tmp = tmp.getNext;
		}
		tmp.setNext(n);
	}
	public Node search(Node t, int i){
		//given t is the root
		if(t.getData()==i) return t;
		if(t == null) return;
		while(t.getData!=i){
			search(t.getLeft(),i);
			search(t.getRight(),i);
		}


	}
			
}
	
	
