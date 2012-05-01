package tco2002.utils;

public class QuickSort {

	public static void sort(int[] array, int left, int right) {
		int index = partition(array, left, right);

		if (left < index - 1) {
			sort(array, left, index - 1);
		}
		if (right > index) {
			sort(array, index, right);
		}

	}

	private static int partition(int[] array, int left, int right) {
		int pivot = array[(left + right) / 2];

		while (left <= right) {
			while (pivot > array[left]) {
				left++;
			}
			while (pivot < array[right]) {
				right--;
			}

			if (left <= right) {
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				left++;
				right--;
			}
		}

		return left;
	}

	public static void sort(char[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1) {
			sort(array, left, index - 1);
		}
		if (right > index) {
			sort(array, index, right);
		}
	}

	private static int partition(char[] array, int left, int right) {
		char pivot = array[(left + right) / 2];

		while (left <= right) {
			while (pivot > array[left]) {
				left++;
			}
			while (pivot < array[right]) {
				right--;
			}
			if (left <= right) {
				char tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				left++;
				right--;
			}
		}
		return left;
	}

}
