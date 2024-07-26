package example;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int goal = 5;
		int low = 0, high = array.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(array[mid] == goal) {
				System.out.println("Found on index " + mid);
				break;
			}
			else if(array[mid] < goal) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
	}

}
