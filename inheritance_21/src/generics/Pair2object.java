package generics;

public class Pair2object {

    public static void main(String[] args){

          Pair2<String, Integer> pSI= new Pair2<String, Integer>("ab",10);

          Pair2 p= new Pair2(10,20);
//        System.out.println(p.getFirst()+ " " +p.getSecond());

//        PairString pS= new PairString("aa", "bb");
//        PairDouble pS= new PairDouble(3.1, 7.2);

          Pair2<String,String> pS= new Pair2<String,String>("aa", "bb");
          System.out.println(pS.getFirst()+" "+ pS.getSecond());
          pS.setFirst("xyz");

          Pair2<Integer,Integer> pI= new Pair2<Integer,Integer>(10, 20);
          System.out.println(pI.getFirst()+ " " +pI.getSecond());

          Pair2<Double,Double> pD= new Pair2<Double,Double>(10.1, 20.6);
          System.out.println(pD.getFirst()+ " " +pD.getSecond());


    }
}