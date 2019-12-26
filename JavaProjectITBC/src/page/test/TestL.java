package page.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(page.test.StringComparatorListener.class)
public class TestL {
  @Test
  public void testAdd() {
      String str = "One string";
      assertEquals("Other string", str);
  }
}
