public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = -1;
		while (start <= end) {
			mid = (start+end) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			else if (target < arr[mid]) {
				end = mid - 1;
			}
			else if (target > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}

	public String searchName() {
		return "Binary Iterative Search";
	}
}