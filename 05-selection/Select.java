private int b = 1;
public int Select(int[] A, int k){
	int low A[0];
	for(int i = 0; i < A.length(); i++){
		if(A[i] < low) low = A[i];
	}
	if(b==k){
		return low;
	}
	else{
		b++;
		Select(A, k-1);
	}
}