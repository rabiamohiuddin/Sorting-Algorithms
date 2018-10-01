import java.util.Arrays;

public class InsertionSort {
	private static int insertion_sort(int vals[]) {
		int count = 0;
		
		int key, i;
		for (int j = 1; j < vals.length; j++) {
			count++;
			
			key = vals[j];
			i = j - 1;
			while (i >= 0 && vals[i] > key) {
				count++;
				vals[i + 1] = vals[i];
				i = i - 1;
			}
			vals[i + 1] = key;
		}
		
		return count;
	}
	
	public void runInsertionSort() {
		int values[] = { 9, 7, 6, 0, 2, 5, 10, 28, 23, 85, 37, 15, 39, 44, 30, 78, 90, 83, 63, 21 };
		int valuesHalfSorted[] = { 0, 2, 5, 6, 7, 9, 10, 15, 21, 23, 90, 83, 63, 39, 30, 28, 37, 44, 78, 85 };

		int count;
		
		System.out.println("\nInsertion Sort O(n^2)\n");
		
		System.out.println("---Worst Case---");
		System.out.println("unsorted array: " + Arrays.toString(values));
		System.out.println("Run Insertion Sort on unsorted array");
		count = insertion_sort(values);
		System.out.println("sorted array: " + Arrays.toString(values));
		System.out.println("InsertionSort counter: " + count +"\n");
		
		System.out.println("---Average Case---");
		System.out.println("Half sorted array: " + Arrays.toString(valuesHalfSorted));
		System.out.println("Run Insertion Sort on half sorted array");
		count = insertion_sort(valuesHalfSorted);
		System.out.println("sorted array: " + Arrays.toString(valuesHalfSorted));
		System.out.println("InsertionSort counter: " + count +"\n");
		
		System.out.println("---Best Case---");
		System.out.println("sorted array: " + Arrays.toString(values));
		System.out.println("Run Insertion Sort on sorted array");
		count = insertion_sort(values);
		System.out.println("sorted array: " + Arrays.toString(values));
		System.out.println("InsertionSort counter: " + count +"\n");
	}
}
