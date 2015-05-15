public class Tree{
	private Node root;
	private String t;
	public Tree(Node r){
		root = r;
		
	}
	public void add(Node r){
		Node tmp = root;
		while((r.getData()>tmp.getData() && tmp.getRight()!=null) || (r.getData()<tmp.getData() && tmp.getLeft()!=null)){ 
			if(r.getData()>tmp.getData()){
				tmp = tmp.getRight();
			}
			if(r.getData()<tmp.getData()){
				tmp = tmp.getLeft();
			}
		}
		if(r.getData()>tmp.getData()) tmp.setRight(r);
		if(r.getData()<tmp.getData()) tmp.setLeft(r);
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


	public void remove(int d){
		Node tmp = root;
		
		while(tmp.getLeft().getData()!=d || tmp.getright().getData()!=d){
			if(d>tmp.getData()) tmp = tmp.getRight();
			if(d<tmp.getData()) tmp = tmp.getLeft();
		}
		if(d>tmp.getData()) Node n = tmp.getRight();
		if(d<tmp.getData()) Node n = tmp.getLeft();
		if(!tmp.getLeft() && !tmp.getRight()){
			tmp.setNext(null);
		}
		if((!n.getLeft() && n.getRight) || (!n.getRight() && n.getLeft)){
			if(tmp.getLeft() == n){
				if(n.getLeft()) tmp.setLeft(n.getLeft());
				if(n.getRight()) tmp.setRight(n.getRight());
			}
			if(tmp.getRight() == n){
				if(n.get	

*/
}
			
				
			
	
		
	
