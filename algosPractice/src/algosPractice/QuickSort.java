/**
 * 
 */
package algosPractice;



/**
 * @author vijay
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	
	private static void printoutput(int []n){
		for(int i=0; i<n.length; i++){
			System.out.println(n[i]);
			//System.out.println("--------------");
		}
	}
	
	private static int partition(int []m, int p, int r){
		int x=m[r];
		int i = p-1;
		for (int j=p; j<=r-1;j++){
			if(m[j]< m[r]){
				i=i+1;
				int temp = m[i];
				m[i] = m[j];
				m[j] = temp;
			}
		}
		m[r] = m[i+1];
		m[i+1] = x;
		return i+1;
	}
	
	private static void quicksort(int []m, int p, int r){
		if(p<r){
			int q= partition(m,p,r);
			quicksort(m, p, q-1);
			quicksort(m, q+1, r);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vijay");
		System.out.println("How r u");
		int a[] = {12,14,3,6,15,9,8,10};
		quicksort(a,0,a.length-1);
		printoutput(a);
	}

}
