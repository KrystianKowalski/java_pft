package r.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTest {

   @Test

   public void testDistance() {
      //given
      Point p1 = new Point(4,2);
      Point p2 = new Point(6,9);

      //when
      double distanceResult = p1.distance(p2);

      //then
      Assert.assertEquals(distanceResult, 7.280109889280518);
   }
}

