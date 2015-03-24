

public class stackArray<E>{
    // You decide how the node(s) are declared
	Object[] array = new Object[0];
    // make whatever constructor(s) you need

	public void push(E data){
        	Object[] newArray = new Object[array.length+1];
		
		newArray[0] = data;
		int j = 1;		
		for(int i = 0; i < array.length; i++){
			newArray[j] = array[i];
			j++;
		}
		newArray = array;
	// add something to the top
	}

	public E pop(){
        // remove and return the top item from the stack
		tmp = array[0];	
		Object[] newArray = new Object[array.length-1];
		int j = 0;
		for(int i = 1; i < array.length; i++){
			newArray[j] = array[i];
		}
		array = newArray;
		return tmp;	
	}

	public boolean empty(){
		return(array.length==0);
        }

        public E top() {
        // return the top item from the stack
		return array[0];
        }
}


