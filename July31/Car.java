package July31;

import java.util.Comparator;

public class Car implements Comparable<Car> {
	private String name;
	private int price;
	private int speed;
	public static final CarSpeedComparator speedctor=new CarSpeedComparator();
	public static final CarSpeedRevComparator speedrevctor=new CarSpeedRevComparator();
	public static final CarPriceComparator pricector=new CarPriceComparator();
	public static final CarPriceRevComparator pricerevctor=new CarPriceRevComparator();
	public static final CarNameComparator namector=new CarNameComparator();
	public static final CarNameRevComparator namerevctor=new CarNameRevComparator();
	@Override
	public int compareTo(Car other) {
		
		return this.speed-other.speed;
	}
	Car(String name, int price, int speed)
	{
		this.name=name;
		this.speed=speed;
		this.price=price;
	}
	
	public String toString()
	{
		return this.name+" "+this.price+" "+this.speed;
	}
	private static class CarSpeedComparator implements Comparator<Car>
	{
		public int compare(Car o1, Car o2)
		{
			return o1.speed-o2.speed;
		}
	}
	private static class CarSpeedRevComparator implements Comparator<Car>
	{
		public int compare(Car o1, Car o2)
		{
			return o2.speed-o1.speed;
		}
	}
	private static class CarPriceComparator implements Comparator<Car>
	{
		public int compare(Car o1, Car o2)
		{
			return o2.price-o1.price;
		}
	}
	private static class CarPriceRevComparator implements Comparator<Car>
	{
		public int compare(Car o1, Car o2)
		{
			return o1.price-o2.price;
		}
	}
	private static class CarNameComparator implements Comparator<Car>
	{
		public int compare(Car o1, Car o2)
		{
			return o1.name.compareTo(o2.name);
		}
	}
	private static class CarNameRevComparator implements Comparator<Car>
	{
		public int compare(Car o1, Car o2)
		{
			return o2.name.compareTo(o1.name);
		}
	}
	
	
	
}
