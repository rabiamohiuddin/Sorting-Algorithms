import java.util.Arrays;

public class MergeSort {
	
	private int merge_sort(int vals[], int first, int last) {
		int counts = 0;

		if (first < last) {
			int mid = (int) Math.floor((first + last) / 2);
			counts += merge_sort(vals, first, mid);
			counts += merge_sort(vals, mid + 1, last);
			counts += merge(vals, first, mid, last);
		}
		
		return counts;
	}

	private static int merge(int[] vals, int first, int mid, int last) {
		int counter = 1;
		
		int leftIndex = mid - first + 1;
		int rightIndex = last - mid;

		int left[] = new int[leftIndex + 1];
		int right[] = new int[rightIndex + 1];

		for (int i = 0; i < leftIndex; i++) {
			left[i] = vals[first + i];
			counter++;
		}

		for (int j = 0; j < rightIndex; j++) {
			right[j] = vals[mid + j + 1];
			counter++;
		}

		left[leftIndex] = Integer.MAX_VALUE;
		right[rightIndex] = Integer.MAX_VALUE;

		int i = 0, j = 0;

		for (int k = first; k <= last; k++) {
			counter++;
			if (left[i] <= right[j]) {
				vals[k] = left[i];
				i++;
			} else {
				vals[k] = right[j];
				j++;
			}
		}
		
		return counter;
	}
	
	public void runMergeSort() {
		int values[] = { 9, 7, 6, 0, 2, 5, 10, 28, 23, 85, 37, 15, 39, 44, 30, 78, 90, 83, 63, 21 };
		int valuesHalfSorted[] = { 0, 2, 5, 6, 7, 9, 10, 15, 21, 23, 90, 83, 63, 39, 30, 28, 37, 44, 78, 85 };

		int count;
		
		System.out.println("\nMerge Sort O(n log n)\n");
		
		System.out.println("---Worst Case---");
		System.out.println("unsorted array: " + Arrays.toString(values));
		System.out.println("Run Merge Sort on unsorted array");
		count = merge_sort(values, 0, values.length - 1);
		System.out.println("sorted array: " + Arrays.toString(values));
		System.out.println("MergeSort counter: " + count +"\n");
		
		System.out.println("---Average Case---");
		System.out.println("Half sorted array: " + Arrays.toString(valuesHalfSorted));
		System.out.println("Run Merge Sort on half sorted array");
		count = merge_sort(valuesHalfSorted, 0, valuesHalfSorted.length - 1);
		System.out.println("sorted array: " + Arrays.toString(valuesHalfSorted));
		System.out.println("MergeSort counter: " + count +"\n");
		
		System.out.println("---Best Case---");
		System.out.println("sorted array: " + Arrays.toString(values));
		System.out.println("Run Merge Sort on sorted array");
		count = merge_sort(values, 0, values.length - 1);
		System.out.println("sorted array: " + Arrays.toString(values));
		System.out.println("MergeSort counter: " + count +"\n");
	}
}
