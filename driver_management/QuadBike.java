package driver_management;
import behaviours.*;

public class QuadBike implements Driveable {

  int avgSpeed;
  String engine;

  public DodgemCar(int avgSpeed, String engine) {
    this.avgSpeed = avgSpeed;
    this.engine = engine;
  }

  public int getAvgSpeed() {
    return this.avgSpeed;
  }


  public String getEngine(){
    return this.engine;
  }
}
