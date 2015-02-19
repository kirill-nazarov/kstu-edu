class BubbleSort {
 
 
	public static void main(String[] args) {
		int time2stop= 0;
		int tempValue;
		int[] anArray = new int[5];
		for(int i=0; i<5; i++){
			anArray[i] =  (int) (Math.random() * 100);
		}
 
		for(int i=0; i<5; i++){
			System.out.print(anArray[i] + " ");
		}
		System.out.print(": Initial array");
		System.out.println("");
 
		while(time2stop == 0){
			boolean swapped = false;
			for (int j=0; j<4; j++){
				if(anArray[j] > anArray[j+1]){
					tempValue = anArray[j];
					anArray[j] = anArray[j+1];
					anArray[j+1] = tempValue;
					swapped = true;
					for(int i=0; i<5; i++){
						System.out.print(anArray[i] + " ");
					}
					System.out.println("");
				}
			}
			if (swapped == false){
				time2stop = 1;
			}
		}
		for(int i=0; i<5; i++){
			System.out.print(anArray[i] + " ");
		}
		System.out.print(": Sorted array");
		System.out.println("");
 
	}
 
}