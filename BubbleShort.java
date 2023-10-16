class BubbleSort{
	
	public static void BSort(int a[]){
		int len=a.length;
		System.out.println(len);
		
		
		for(int i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					}

				}
			
			}
		//print the sorted array
		System.out.println();
			for(int i=0;i<len;i++){
				System.out.print(a[i]+" ");
			}
		}
		
	public static void main(String[] args){
		int arr[]={12,15,10,8,21,5,15,6};
		BSort(arr);	
	
	}
				

}
