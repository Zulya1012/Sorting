package srt;
public class Car implements Comparable {
	int speed;
	int price;
	String model;
	String color;
	Car(int speed, int price, String model, String color){
		this.speed = speed;
		this.price = price;
		this.model = model;
		this.color = color;
	}
	public String toString() {
		return this.model + " " + this.color + " " + this.speed + " " + this.price;
	}
	public int compareTo(Object o) {
		int temp = this.speed - ((Car)o).speed;
		if (temp == 0) {
			return this.price - ((Car)o).price;
		}else {
			return temp;
		}

//		return this.model.compareTo(((Car)o).model);
	}
}
