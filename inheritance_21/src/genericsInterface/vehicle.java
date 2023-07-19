package genericsInterface;

public class vehicle implements PrintInterface{
    int maxSpeed;
    String company;

    public vehicle(int maxSpeed,String company){

        super();
        this.maxSpeed=maxSpeed;
        this.company= company;
    }

    public void print(){
        System.out.println(maxSpeed+" "+company);
    }
}
