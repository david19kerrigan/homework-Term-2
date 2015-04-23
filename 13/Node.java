public class Node{
		
    private int x,y;
    private Node next;
    private int priority;
    private int distanceTo;
		
    public Node(int x, int y, int a, int b, int px, int py){
	this.x = x;
	this.y = y;
    int[] p = new int[2];
    p[0] =px;
    p[1] = py;

	int[] z = new int [2];
	a[0] = x;
	a[1] = y;
	int[] zArray = new int [2];
	zArray[0] = a;
	zArray[1] = b;
	int d = calculateDistance(z,zArray);
	priority = d;
    }


    public static double calculateDistance(int[] array1, int[] array2)
    {
        double Sum = 0.0;
        for(int i=0;i<array1.length;i++) {
           Sum = Sum + Math.pow((array1[i]-array2[i]),2.0);
        }
        return Math.sqrt(Sum);
    }
    public int getPriority(){
	return distanceTo+priority;
    }
    public Node getNext() {
	return next;
    }
    public void setNext(Node n) {
	next = n;
    }
		
    public int getX(){
	return x;
    }

    public int getY() {
	return y;
    }
}










