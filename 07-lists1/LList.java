public class LList {
		private Node l=null;

		public void add(String s){
				Node tmp = new Node(s);
				tmp.setNext(l);
				l = tmp;
		}

		public String toString(){
				String s = "";
				Node tmp;
				for (tmp = l; tmp != null; tmp=tmp.getNext()){
						s = s + tmp + " --> ";
				}
				s = s + "null";
				return s;
		}
		public int find(int n){
			Node n = l;
			for(int i = 0; i < n; i++){
				n = n.getNext();
			}
			return n.getData();
		}
		public void insert(int n){
			private Node n = new Node("a");
			n.setNext(l);

		}
		public void insert(int pos, String n){
			Private Node b = new Node(n);
			Node c = l;
			for(int i = 0; i < n; i++){
				c = c.getNext();
			}
			b.setNext(c);
			

		}
		
}