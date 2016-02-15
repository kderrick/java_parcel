import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void testParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(3,4);
    assertEquals(true, testParcel instanceof Parcel);

  }

}
