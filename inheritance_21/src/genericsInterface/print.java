package genericsInterface;
//to print vehicle class elements in array format we used both generics and interface concept here
public class print {

	public static<T extends PrintInterface> void printArray(T arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i].print();

		}
	}

	public static void main(String[] args) {

		vehicle v[] = new vehicle[5];
		for(int i=0;i<v.length;i++){
			v[i]= new vehicle(10*i,"ab");
		}
		printArray(v);




	}




}
