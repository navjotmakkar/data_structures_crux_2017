package July29;

import java.util.ArrayList;
import java.util.Scanner;

public class HeapClass {
	private ArrayList<Integer> data = new ArrayList<>();
	private boolean ismin;

	public HeapClass(boolean ismin, int[] arr) {
		this.ismin = ismin;
		for (int i = 0; i < arr.length; i++) {
			data.add(arr[i]);
		}
		for (int j = data.size() / 2 - 1; j >= 0; j--) {
			downheapify(j);
		}
	}

	public HeapClass(boolean ismin) {
		this.ismin = ismin;
	}

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(int value) {
		data.add(value);
		upheapify(data.size() - 1);
	}

	public int getHP() {
		return data.get(0);
	}

	private void upheapify(int ci) {
		if (ci == 0)
			return;

		int pi = (ci - 1) / 2;
		if (isLarger(ci, pi)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	public int removeHP() {
		swap(data.size() - 1, 0);
		int rv = data.get(data.size() - 1);
		data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int max = pi;
		if (lci < data.size() && isLarger(lci, max)) {
			max = lci;
		}
		if (rci < data.size() && isLarger(rci, max)) {
			max = rci;
		}
		if (max != pi) {
			swap(max, pi);
			downheapify(max);
		}
	}

	private boolean isLarger(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		if (ismin)
			return ith < jth;
		else
			return jth > ith;
	}

	private void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);

	}
}
