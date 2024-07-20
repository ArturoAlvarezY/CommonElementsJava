import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dev.arturo.models.Comparation;
import dev.arturo.models.FirstArray;
import dev.arturo.models.SecondArray;

public class ComparationTest {
    @Test
    void testFindCommons() {

        Comparation comparation = new Comparation();
        FirstArray instanceFirstArray = new FirstArray();
        SecondArray instantSecondArray = new SecondArray();

        ArrayList<Integer> firstArray= instanceFirstArray.getingFirstArray();
        ArrayList<Integer> secondArray= instantSecondArray.getingSecondArrayList();

        assertThat(comparation.findCommons(firstArray, secondArray), contains(0,3));
    
    }
}
