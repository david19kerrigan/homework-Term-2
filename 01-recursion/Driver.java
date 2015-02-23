public class Driver{
	public static void main(String[] args){
		Recursion r = new Recursion();
		System.out.println(r.fac(3));
		System.out.println(r.fib(3));	
		System.out.println(r.len("ab"));
		System.out.println(r.count("ab",'a'));
	}
}