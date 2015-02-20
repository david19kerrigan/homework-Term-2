public class Recursion{
	public int fac(int n){
		return n*fac(n-1);
	}
	public int fib(int n){
		if(n<2){
			return 1;
		}
		if(n>=2){
			return fib(n-1)+fib(n-2);
		}
		return 0;
	}
	public int len(String s){
		if(s == ""){
			return 0;
		}
		else{
			return 1+(len(s.substring(1)));
		}
	}
	public int count(String s, char c){
		if(s.length()==1){
			if(s.charAt(0)==c){
				return 1;
			}
			else{
				return 0;
			}
		}
		if(s.charAt(0)==c && s.length()>1){
			return 1+count(s.substring(1),c);
		}
		if(s.charAt(0)!=c && s.length()>1){
			return 0+count(s.substring(1),c);
		}
		return 0;
	}
/* spacing is messed up because of codingbat, but the code was tested on codingbat	
	public int bunnyEars2(int bunnies)  {
	  if(bunnies==0){
	   return 0;
	  }
	  if(bunnies%2==0){
	   return 3+bunnyEars2(bunnies-1);
	  }
	  if(bunnies%2==1){
	   return 2+bunnyEars2(bunnies-1);
	  }
	  return 1;
	}
	public int strCount(String str, String sub) {
	  if(str.length()<3){
	   return 0;
	  }
	  if(str.startsWith(sub)){
	   return 1+strCount(str.substring(1),sub);
	  }
	  if(!str.startsWith(sub)){
	   return strCount(str.substring(1),sub);
	  }
	  return 0;
	}
	public int sumDigits(int n) {
	  String s = Integer.toString(n);
	  if(s.length()==1){
	   return Integer.parseInt(s);
	  }
	  else{
	   return Integer.parseInt(s.substring(0,1))+sumDigits(Integer.parseInt(s.substring(1)));
	  }
	}
	public String allStar(String str) {
	  if(str.length()==1){
	   return str;
	  }
	  else{
	   return str.charAt(0)+"*"+allStar(str.substring(1));
	  }
	}
}