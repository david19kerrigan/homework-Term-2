import java.util.*;
public class Sort{
 	private ArrayList<integer> l = new ArrayList<integer>();
 	private int start = 0;
 	public void s(ArrayList<Integer> b, boolean down){
 		
 		if(b.size()>1){
 			l.add(s(b.sublist(0,b.size()/2)));
 			s((b.sublist(b.size()/2,b.size())));

 		}

 		else{
 			merge(start,start+1)
 			start++;
 		}
 	}
	public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(A.size() > 0 && B.size() > 0){
			if(A.get(0) <= B.get(0)){
				a.add(A.get(0));
				A.remove(0);
			}
			if(B.get(0) < A.get(0)){
				a.add(B.get(0));
				B.remove(0);
			}
			if(A.size()==0){
				for(int i = 0;i<B.size();i++){
					a.add(B.remove(i));
				}
			} else if (B.size() == 0){
				for(int i=0;i<A.size();i++){
					a.add(A.remove(i));
				}
			}		
		}
		return a;
	}
/*
	public static void main(String[] args){
		Sort a = new Sort();	
		ArrayList<Integer> a0 = new ArrayList<Integer>();
		a0.add(0);
		a0.add(2);
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 	
		System.out.println(a.merge(

	public ArrayList<integer> s(ArrayList<integer> A){
		if(A.size==0){
			return A;
		}
		else{
			if(A.size%2==0){
*/			
}
