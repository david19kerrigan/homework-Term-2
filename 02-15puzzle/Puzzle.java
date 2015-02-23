import java.io.*;
import java.util.*;
//I don't think the ascii refresh thing works in command prompt...
public class Puzzle{
	private String empty = " 0 ";
	private String board[][] = {{" 2 "," 10 "," 3 ",empty},{" 1 "," 6 "," 12 "," 4 "},{" 13 "," 14 "," 8 "," 7 "},{" 5 "," 9 "," 11 "," 15 "}};
	private String solved[][] = {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15",empty}};
	private boolean noLeft;
	private boolean noRight;
	private boolean noUp;
	private boolean noDown;
	
	private int x = 3;
	private int y = 0;
	private boolean isSolved = false;
	private String temp;
	public Puzzle(){
		isSolved = false;
	}
	public String toString(){
		String s = "[2J\n";
		for(int y = 0; y < 4; y++){
			for(int x=  0; x <4; x++){
				//System.out.println(s);
				s = " "+s+board[y][x]+" ";
			}
			s=s+"\n";
		}
		return s;
	}
	public void solve(){
		
		if(board == solved){
			System.exit(0);
		}
		if(x==0){
			noLeft = true;
		}
		if(x!=0){
			noLeft = false;
		}
		if(x==3){
			noRight = true;
		}
		if(x!=3){
			noRight = false;
		}
		if(y==0){
			noUp = true;
		}
		if(y!=0){
			noUp = false;
		}
		if(y==3){
			noDown = true;
		}
		if(y!=3){
			noDown = false;
		}
		if(!noUp){
			temp = board[x][y+1];
			board[x][y] = temp;
			board[x][y+1] = empty;
		}
		if(!noDown){
			temp = board[x][y-1];
			board[x][y] = temp;
			board[x][y-1] = empty;
		}
		if(!noLeft){
			temp = board[x-1][y];
			board[x][y] = temp;
			board[x-1][y] = empty;
		}
		if(!noRight){
			temp = board[x+1][y];
			board[x][y] = temp;
			board[x+1][y] = empty;
		}


	}
	
	public static void main(String[] args){
		Puzzle p = new Puzzle();
		System.out.println(p);

	}
}

//exits so I assume it's working.