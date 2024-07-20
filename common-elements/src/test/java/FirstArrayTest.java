import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


import dev.arturo.models.FirstArray;

public class FirstArrayTest {
    @Test
    void testGetingFirstArray() {

        FirstArray firstArray = new FirstArray();
        ArrayList<Integer> first = firstArray.getingFirstArray();
        assertThat(first, contains(0, 1,2,3));
    }
}
