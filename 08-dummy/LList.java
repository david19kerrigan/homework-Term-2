public class LList {
		private Node l=null;
		public LList(){
			l = new Node();
			private int length;		
		}
		public void add(index x, String s){
			private Node aNode = l;
			private Node newNode = new Node();
			for(int i = 0; i < x; i++){
				aNode = aNode.getNext();
				if(i == x-1){
					newNode.setNext(aNode.getNext());
				}
			aNode.setNext(newNode);
				
			}
		public void add(int s){
				Node tmp = new Node(s);
				tmp.setNext(l);
				length++;
				l = tmp;
		}
		public String get(int s){
			long s = System.out.currentTimeMillis();
			private Node aNode = l;
			while(aNode != null){
				aNode = aNode.getNext();
			}
			if(aNode.getData() == s){
				return aNode.getData();
			}
			System.out.println(System.out.currentTimeMillis()-s)
		}
		public boolean remove(value n){
			private Node aNode = l;
			for(int i = 0; i < x; i++){
				aNode = aNode.getNext();
				if(i == aNode){
					newNode.setNext(aNode.getNext());
					aNode.setNext(null);
					return true;
				}
			return false;
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
		
}
