import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTests {
    Stack stack;
    @BeforeEach
    public void init() {
        stack = new Stack();
    }

    @Test
    @DisplayName("push 테스트")
    public void pushTest() {

        //when
        int pushedItem = (int) stack.push(5);

        //then
        assertEquals(5, pushedItem);
    }
}
