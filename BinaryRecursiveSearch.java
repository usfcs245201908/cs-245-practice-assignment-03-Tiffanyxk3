public class BinaryRecursiveSearch implements Practice03Search
{
	int start, end, mid;

	public int search(int [] arr, int target) {
		start = 0;
		end = arr.length - 1;
		return search1(arr, target, start, end);
	}

	public int search1(int [] arr, int target, int s, int e) {
		mid = (s+e) / 2;

		if (e < s) {
			return -1;
		}
		else if (target == arr[mid]) {
			return mid;
		}
		else if (target < arr[mid]) {
			return search1(arr, target, s, mid-1);
		}
		else if (target > arr[mid]) {
			return search1(arr, target, mid+1, e);
		}
		return -1;
	}

	public String searchName() {
		return "Binary Recursive Search";
	}
}