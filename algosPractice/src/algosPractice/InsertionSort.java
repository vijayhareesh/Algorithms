/**
 * 
 */
package algosPractice;

/**
 * @author vijay
 *
 */
public class InsertionSort {

	/**
	 * 
	 */
	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,14,3,6,12,15,9,8,12,10};
		InsertionSort I = new InsertionSort();
		QuickSort q = new QuickSort();
		I.insort(a);
		q.printoutput(a);
	}

	private void insort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=1; i<a.length;i++){
			for(int j=i-1;j>=0;j--){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}
