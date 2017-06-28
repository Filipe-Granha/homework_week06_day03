import static org.junit.Assert.*;
import org.junit.*;
import drivermanagement.*;

public class DodgemCarTest {

  DodgemCar dodgemCar;

  @Before
  public void before(){
    dodgemCar = new DodgemCar(15, 2);
  }
