import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
		private Node<E> t;
		public LLit(Node<E> n){
				t=n;
		}

		public boolean hasNext(){
				return t!=null;
		}

		public E next(){
				E retval = t.getData();
				t=t.getNext();
				return retval;
		}

		public void remove(int index) {
				private Node tmp = t;
				for(int i = 0; i < index; i++){
					tmp=tmp.getNext();
					if(i==index-2){
						private node a = tmp;
					}
				a.setNext(tmp.getNext());
				tmp.setNext(null);
				}

		}
}
