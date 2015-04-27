public class Tree{
	private Node root;
	private String t;
	public Tree(Node r){
		root = r;
		
	}
/*
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
			

	
*/

	public String toString(){
		Node tmp = root;
		boolean d = false;			
		String retString = "";		
		while(!d){
			if(tmp==null)
	public String tL(Node t){
		if(t==null) return;
		if(!t.getLeft && !t.getRight) return;
		else{
			t+=t.getRight;
			t+=t.getLeft;
			
			
	
		
	
