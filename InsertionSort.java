/*********************
		 First it divide as two part .1 Sorted and 2. unSorted.


 *******************/ 

class InsertionSort{
	public static void Insertion(int a[]){
		for(int i=1;i<a.length;i++){
			int current=a[i];
			System.out.println("current=a[i]"+a[i]);
			int j=i-1;
			System.out.println("j="+j);
			while( j>=0 && current < a[j]){
				System.out.println("a[j+1]as"+a[j+1]+"=a[j]as"+a[j]);
				a[j+1] = a[j];
				j--;
				System.out.println("j--("+j+")");
				}
			//placement
			a[j+1]=current;
			System.out.println("a[j+1]=current a["+(j+1)+"] ="+current);
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			}
		}
	public static void main(String[] args){
		int arr[]={5,9,6,4,3};
		Insertion(arr);
	}
}
