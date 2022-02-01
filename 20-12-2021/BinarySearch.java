package assignments;

public class BinarySearch {
	public static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		int mid = (start + end) / 2;
		while (start <= end) {

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;

			if (start > end) {
			    System.out.println("Element Not found");
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 8, 10, 11 };
		int target = 10;
		System.out.println(binarySearch(arr, target));

	}

}
