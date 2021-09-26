package July31;

import java.util.Comparator;
import java.util.Scanner;

public class CarClient {

	public static void main(String[] args) {
		Car[] cars = new Car[7];
		cars[0] = new Car("audi", 2000, 200);
		cars[1] = new Car("lamb", 1500, 160);
		cars[2] = new Car("bmw", 3000, 270);
		cars[3] = new Car("merc", 1200, 100);
		cars[4] = new Car("landrov", 1700, 300);
		cars[5] = new Car("kj", 1000, 120);
		cars[6] = new Car("merc", 2000, 180);

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1 for name,2 for price,3 for speed");
		int n = scn.nextInt();
		System.out.println("Enter true for regular and reverse for irregular");
		boolean b = scn.nextBoolean();

		GenericHeapClass<Car> heap = null;
		if (n == 1 && b)
			heap = new GenericHeapClass<>(Car.speedctor);
		else if (n == 1 && !b)
			heap = new GenericHeapClass<>(Car.speedrevctor);
		else if (n == 2 && b)
			heap = new GenericHeapClass<>(Car.pricector);
		else if (n == 2 && !b)
			heap = new GenericHeapClass<>(Car.pricerevctor);
		else if (n == 3 && b)
			heap = new GenericHeapClass<>(Car.namector);
		else if (n == 3 && !b)
			heap = new GenericHeapClass<>(Car.namerevctor);

		for (Car val : cars) {
			heap.add(val);
		}
		heap.display();
		while (heap.size() != 0) {
			System.out.println(heap.removeHP());
		}
	}

	public static <T> void bubbleSort(Comparator<T> ctor, T[] arr) {
		int c = 1;
		while (c <= arr.length - 1) {
			for (int i = 0; i < arr.length - c; i++) {
				if (ctor.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			c++;
		}
		return;
	}

}
