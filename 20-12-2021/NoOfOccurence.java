package assignments;

public class NoOfOccurence {
	static int first(int arr[], int target) {
		int start = 0, end = arr.length - 1;
		int first = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				first = mid;
				end = mid - 1;
			}
		}

		return first;
	}

	static int last(int arr[], int target) {
		int start = 0, end = arr.length - 1;
		int last = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				last = mid;
				start = mid + 1;
			}
		}
		return last;
	}

	public static void main(String[] args) {
		

		int arr[] = { 1, 1, 2, 2, 4, 4, 4, 5, 5, 6, 6, 6, 9, 10, 11 };
		int target = 6;
		int firstOccurenc = first(arr, target);
		int lastOccurenc = last(arr, target);
		int count = lastOccurenc - firstOccurenc + 1;
		System.out.println(count);
	}

}
