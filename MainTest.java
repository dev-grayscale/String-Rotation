import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void isRotationV1() {
    Assertions.assertFalse(Main.isRotationV1(null, null));
    Assertions.assertFalse(Main.isRotationV1(null, ""));
    Assertions.assertFalse(Main.isRotationV1(null, "   "));
    Assertions.assertFalse(Main.isRotationV1("", null));
    Assertions.assertFalse(Main.isRotationV1("  ", null));
    Assertions.assertFalse(Main.isRotationV1("", ""));
    Assertions.assertFalse(Main.isRotationV1("", "  "));
    Assertions.assertFalse(Main.isRotationV1("  ", ""));
    Assertions.assertFalse(Main.isRotationV1("  ", "  "));
    Assertions.assertFalse(Main.isRotationV1("hello", "ellohh"));
    Assertions.assertFalse(Main.isRotationV1("hi", "i"));

    Assertions.assertTrue(Main.isRotationV1("h", "h"));
    Assertions.assertTrue(Main.isRotationV1("waterbottle", "erbottlewat"));
    Assertions.assertTrue(Main.isRotationV1("Testing the logic", " the logicTesting"));
    Assertions.assertTrue(Main.isRotationV1("dummystring", "stringdummy"));
  }
}
