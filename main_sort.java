
public class main_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {15,9,60,44,12,1,4}; 
		MergeSort mergesort = new MergeSort(); 
		mergesort.ExamSort(a, 0, a.length-1);
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
