package com.progress.github_packages_example;

import java.util.Arrays;

public class Utilitys {

	public static int findLargestNo(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[n - 1];
	}

}
