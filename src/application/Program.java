package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
		public static void main(String[] args) {
				List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
				List<Double> myDoubles = Arrays.asList(3.14, 6.28);
				List<Object> myObjs = new ArrayList<Object>();
				copy(myInts, myObjs);
				printList(myObjs);
				copy(myDoubles, myObjs);
				printList(myObjs);
		}
		/*
		 * List<? extends Number> source: List of any type that is a subclass of Number that presents the wildcard "?" with covariance.
		 * List<? super Number> destiny: List of any type that is a superclass of Number that presents the wildcard "?" with contravariance.
		 */
		public static void copy(List<? extends Number> source, List<? super Number> destiny) {
				destiny.addAll(source);
		}
		public static void printList(List<?> list) {
				for (Object obj : list) {
						System.out.print(obj + " ");
				}
				System.out.println();
		}
}