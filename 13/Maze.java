import java.io.*;
import java.util.*;

public class Maze 
{
	private char[][] board;
	private int maxX;
	private int maxY;

	private char path='#';
	private char wall=' ';
	private char me='z';
	private char exit='$';
	private char visited = '.';
	private boolean solved = false;
	private int exitx;
	private int exity;

	public void delay(int n){
		try {
			Thread.sleep(n);
		} catch (Exception e) {}
	}

	public Maze() 
	{
		maxX=40;
		maxY=20;
		board = new char[maxX][maxY];

		try {

			Scanner sc = new Scanner(new File("maze.dat"));
			int j=0;
			while (sc.hasNext())
			{
				String line = sc.nextLine();
				for (int i=0;i<maxX;i++)
				{
					board[i][j] = line.charAt(i);
				}
				j++;
			}
		}
		catch (Exception e)
		{
		}
		for(int i = 0 ; i < board.length; i ++){
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j] == exit){
					exitx = i;
					exity = j;
				}
			}
		}

	}

	public String toString()
	{
		String s = "[2J\n";

		for (int y=0;y<maxY;y++)
		{
			for (int x=0;x<maxX;x++)
				s = s +board[x][y];
			s=s+"\n";
		}
		return s;
	}

    /*
      solved - instance variable to indicate we're done
			
    */
      public void solve(int x, int y){
      	Frotnier q = new Frontier();
      	Node first = new Node(x,y,exitx,exity);
      	board[x][y] = me;
      	System.out.println(q);
      	q.add(first);
      	while (!q.empty()) {
      		System.out.println(q+"\n");
      		Node tmp = q.remove();
      		System.out.println(tmp+"\n");
      		if (tmp.getData() == exit) {
      			
      			return;
      		}
      		if (tmp.getData() == wall || tmp.getData() == me) {
      			return;
      		}
      		if (tmp.getData() != wall & tmp.getData() != me) {
      			board[tmp.getX()][tmp.getY()] = 'd';
      			Node a = new Node(board[tmp.getX()+1][tmp.getY()],exitx,exity,x,y)
      				tmp.getX()+1,tmp.getY());
      			Node b = new Node(board[tmp.getX()-1][tmp.getY()],exitx,exity,x,y)
      				tmp.getX()-1,tmp.getY());
      			Node c = new Node(board[tmp.getX()][tmp.getY()+1],exitx,exity,x,y)
      				tmp.getX(),tmp.getY()+1);
      			Node d = new Node(board[tmp.getX()][tmp.getY()-1],exitx,exity,x,y)
      				tmp.getX(),tmp.getY()-1);
      			q.add(a);
      			q.add(b);
      			q.add(c);
      			q.add(d);
      			System.out.println(board);
      		}

      	}

      }

      public static void main(String[] args){
      	Maze m = new Maze();
      	System.out.println(m);
      	m.solve(1,1);
      	System.out.println(m);
      }
  }

