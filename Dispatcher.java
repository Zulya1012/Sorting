package srt;
import java.util.Arrays;
public class Dispatcher {
	public static void main(String[] args) {
		int [] x = {3, 2, 7, 4, 9, 4, 1, 8, 5};
		String [] s = {"Serg", "Mary", "Paul", "Bohdan", "Lucy"};
		Arrays.sort(x);
		Arrays.sort(s);
		for(int temp : x) {
//			System.out.print(temp + " ");
		}
//		System.out.println();
		for (String temp : s) {
//			System.out.print(temp + " ");
		}
		Car c1 = new Car(190, 8000, "BMW", "Red");
		Car c2 = new Car(120, 1000, "Tavria", "Green");
		Car c3 = new Car(190, 9000, "Citroen", "White");
		Car[] c = {c1, c2, c3};
		Arrays.sort(c);
		for (Car temp : c) {
			System.out.println(temp);
		}
	}

}
