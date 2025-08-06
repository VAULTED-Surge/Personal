
package lunch2;

public class MenuItem {
	private String name;
	private double price;
	
	private int carbs, fat, fiber;

	public MenuItem (String n, double p, int c, int ft, int fb) {
		name = n;
		price = p;
		carbs = c;
		fat = ft;
		fiber = fb;
	}//end of constructor

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		price = p;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int c) {
		carbs = c;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int f) {
		fat = f;
	}

	public int getFiber() {
		return fiber;
	}

	public void setFiber(int f) {
		fiber = f;
	}

	public String toString() {
		return name + "\t" + price + "\t" + carbs;
	}
	

}//end of MenuItem class
