package generics;

public class pair1Object {
    public static void main(String[] args){
        pair1 p= new pair1(10,20);
        System.out.println(p.getFirst()+ " " +p.getSecond());

//        PairString pS= new PairString("aa", "bb");
//        PairDouble pS= new PairDouble(3.1, 7.2);
        
        pair1<String> pS= new pair1<String>("aa", "bb");
        System.out.println(pS.getFirst()+" "+ pS.getSecond());
        pS.setFirst("xyz");
        
        
        //generics don't work with primitive data type hece we have to use non primitive data types 
        //that is Integer,Double etc instead of int,double
        pair1<Integer> pI= new pair1<Integer>(10, 20);
        System.out.println(pI.getFirst()+ " " +pI.getSecond());

        pair1<Double> pD= new pair1<Double>(10.1, 20.6);
        System.out.println(pD.getFirst()+ " " +pD.getSecond());
    }
}
