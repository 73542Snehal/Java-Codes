package interfaces;

public class car extends vehicle implements VehicleInterface, Carinterface{

    @Override
    public boolean isMotorized(){
      return true;
    }

    @Override
    public String getCompany(){
      return null;
     }

     @Override
     public int numGears(){
       return 5;
      }

      void print(){
          System.out.println(PI);
      }
}
