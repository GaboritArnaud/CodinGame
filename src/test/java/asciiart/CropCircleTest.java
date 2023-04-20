package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.Mockito;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CropCircleTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(CropCircleTestCase.INPUT1, CropCircleTestCase.EXPECTED1),
                Arguments.of(CropCircleTestCase.INPUT2, CropCircleTestCase.EXPECTED2),
                Arguments.of(CropCircleTestCase.INPUT3, CropCircleTestCase.EXPECTED3),
                Arguments.of(CropCircleTestCase.INPUT4, CropCircleTestCase.EXPECTED4)
        );
    }

    @Test
    void when_cropCircle_circle_getNewValue_withoutType_then_should_throw_illegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CropCircle.Circle("TESTag11");
        });
        var expected = String.format("Impossible de convertir %s en cercle", "TESTag11");
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_cropCircle_circle_getNewValue_withoutType_then_should_throw_illegalStateException() {
        var circle = new CropCircle.Circle(null, 0, null);
        var exception = "";
        try {
            circle.getNewValue(Mockito.any());
        } catch (Exception e) {
            exception = e.getMessage();
        }
        var expected = String.format("Le type de cercle %s est inconnu", (Object) null);
        assertEquals(expected, exception);
    }

    @Test
    void  when_cropCircle_circle_getX_then_should_return_x() {
        int excpectedX = 1;
        CropCircle.Point point = new CropCircle.Point(excpectedX, Mockito.anyInt());
        assertEquals(excpectedX, point.x());
    }

    @Test
    void  when_cropCircle_circle_getY_then_should_return_y() {
        int excpectedY = 1;
        CropCircle.Point point = new CropCircle.Point(Mockito.anyInt(), excpectedY);
        assertEquals(excpectedY, point.y());
    }

}
