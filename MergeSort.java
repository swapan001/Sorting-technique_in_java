/* Merge sort  used divide and conqure techniques, first it divide and then conqure */
class MergeSort{
	public static void conqure(int a[],int si,int mid,int ei){
	int merged[]=new int [ei-si+1];
	int idx1=si;
	int idx2=mid+1;
	int x=0;

	while(idx1 <= mid && idx2 <= ei){

		if(a[idx1] <= a[idx2]){
			merged[x]=a[idx1];
			x++;
			idx1++;
			}
		else{
			merged[x]=a[idx2];
			x++;
			idx2++;
			}
		}
		while(idx1 <= mid){
			merged[x]=a[idx1];
			x++;
			idx1++;
			}
		while(idx2 <= ei){
			merged[x]=a[idx2];
			x++;
			idx2++;
			}


		for(int i=0,j=si;i<merged.length;i++,j++){
			a[j]=merged[i];
			}
		}




	public static void divide(int a[],int si,int ei){
		if(si>=ei){
			return;
			}
		int mid=si+(ei-si)/2;
		divide(a,si,mid);
		divide(a,mid+1,ei);
 		conqure(a,si,mid,ei);
	}

	public static void main(String[] args){
		int arr[]={12,5,96,95,98,79,76,78};
		divide(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
		System.out.println();

	}
}
