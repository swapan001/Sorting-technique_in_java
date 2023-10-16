class SelectionSort{
	public static void Selection(int a[]){
		/*
		for(int i=0;i<a.length;i++){
			int smallest=i;
			System.out.println("Smallest i: "+smallest);
			for(int j=i+1;j<a.length;j++){
				if(a[smallest]>a[j]){
					smallest=j;
					System.out.println("Smallest j: "+smallest);
					}
				}
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
			System.out.println("Smallest final: "+smallest);
			}
			
		*/
		for(int i=0;i<a.length;i++){
			int smallest=i;
			for(int j=i+1;j<a.length;j++){
				if(a[smallest]>a[j]){
					smallest=j;
					}
				}
			int temp=a[i];
			a[i]=a[smallest];
			a[smallest]=temp;
			}
			
			
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
			}
			
		}
	public static void main(String[] args){
	
		int arr[]={5,9,6,4,3};	
		Selection(arr);
	}
}
