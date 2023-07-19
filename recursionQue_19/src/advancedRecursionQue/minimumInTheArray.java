package advancedRecursionQue;

public class minimumInTheArray {

	public static void printMin2(int []a, int startIndex, int minSoFar) {
		if(startIndex == a.length) {
			System.out.println(minSoFar);
			return;
		}
		int newMinimum = minSoFar;
		if(a[startIndex] < minSoFar){
			newMinimum = a[startIndex];
		}
		printMin2(a,startIndex +1, newMinimum);
	}
	public static void main(String[] args) {
		int a[] = {3,4,2,5,7,8};
		printMin2(a,0,Integer.MAX_VALUE);
	}
}