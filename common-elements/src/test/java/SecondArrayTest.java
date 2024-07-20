import org.junit.jupiter.api.Test;

import dev.arturo.models.SecondArray;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class SecondArrayTest {
    @Test
    void testGetingSecondArrayList() {
        SecondArray secondArray = new SecondArray();
        assertThat(secondArray.getingSecondArrayList(), contains(0,10,12,4,5,3));
    }
}
