public Stomp{
	private int[][] pasture = {{28,27,24,20},{25,25,20,20},{20,20,20,14},{32,20,20,14},{34,30,20,20},{36,34,30,20}};
	private int[][] stompO = {{1,4,4},{1,1,10}};	
	//public int stomp(){
	public int[] findMax(){
		int max = 0;
		int a;
		int b;
		for(int i = 0; i < pasture.length; i++){
			for(int j = 0; j < pasture[0].length; j++){
				if(pasture[i][j]>max){
					max = pasture[i][j];
					a = i;
					b = j;
				}
			}
		}
			
		return int[] {a,b}; 

	public int findHill(){
		int[] c = findMax();
		if(c[0] == 0){
			
			
		
		
