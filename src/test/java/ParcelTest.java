import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void testParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(3,4,1,10);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void testParcel_getVolumeOfParcel_12() {
    Parcel testParcel = new Parcel(3,4,1,10);
    assertEquals(12,(int) testParcel.getVolume());
  }

  @Test
  public void testParcel_costToShip_() {
    Parcel testParcel = new Parcel(3,4,1,10);
    assertEquals(120,(int) testParcel.costToShip());
  }

}
