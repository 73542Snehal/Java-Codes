package generics;

public class Pair3Object {
	 public static void main(String[] args){

         Pair3<String, Integer> pInner= new Pair3<String, Integer>("ab",100);
         Pair3<Pair3<String, Integer>, String> p= new Pair3<>();
         p.setFirst(pInner);
         System.out.println(p.getFirst());
         System.out.println(p.getFirst().getFirst());
         System.out.println(p.getFirst().getSecond());

   }
}