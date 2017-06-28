import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  
  

  @Before
  public void before(){
    driver = new Driver("John", dodgemCar);
  }

  @Test
  public void hasName(){
    assertEquals("John", driver.getName());
  }
}