package com.progress.github_packages_example;

import java.util.Arrays;

class Utilitys {

	int findLargestNo(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[n - 1];
	}

}

public class App {
	public static void main(String[] args) {
	}
}
