package thursdayLab2;

public class FindGreaterElementAndTheirIndex {

	public static void main(String[] args) {
		int arr[] ={55,89,76,32,45,11};
	    int max = arr[0];  
	    for (int i = 0; i < arr.length; i++) {
	    	if(arr[i] > max)
	    		max = arr[i];  
	    	}
	    System.out.println("Largest element present in given array: " + max);
	}
}
