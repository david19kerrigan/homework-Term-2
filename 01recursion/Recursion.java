public class Recursion{
	
	int total = 0;		

	public int fac(int n){
		if(n>1){
			return n*(fac(n-1));
		}
		if(n==1){
			return 1;
		}
		return 0;
	}
	public int fib(int n){
		if(n<=2){
			return 1;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
	public int leng(String t){
		if(t!=""){
			total++;		
}
