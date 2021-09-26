package July31;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GenericHeapClass<T> {
	private ArrayList<T> data = new ArrayList<>();
	private Comparator<T> ctor;

	public GenericHeapClass(Comparator<T> ctor, T[] arr) {
		this.ctor = ctor;
		for (int i = 0; i < arr.length; i++) {
			data.add(arr[i]);
		}
		for (int j = data.size() / 2 - 1; j >= 0; j--) {
			downheapify(j);
		}
	}

	public GenericHeapClass(Comparator<T> ctor) {
		this.ctor = ctor;
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

	public void add(T value) {
		data.add(value);
		upheapify(data.size() - 1);
	}

	public T getHP() {
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

	public T removeHP() {
		swap(data.size() - 1, 0);
		T rv = data.get(data.size() - 1);
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
		T ith = data.get(i);
		T jth = data.get(j);
		if (ctor.compare(ith, jth) > 0)
			return true;
		else
			return false;
	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);

	}
	public void updatePriority(T value)
	{
		int idx=-1;
		for(int i=0;i<data.size();i++)
		{                          
			if(value.equals(data.get(i)))
			{
				idx=i;
				break;
			}	
		}
		upheapify(idx);
		downheapify(idx);
	}
}
