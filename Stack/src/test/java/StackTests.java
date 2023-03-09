import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    @DisplayName("size 테스트")
    public void sizeTest() {
        int size = stack.size();

        assertEquals(0, size);
    }

    @Test
    @DisplayName("item을 넣었을 때 size 테스트")
    public void sizeWhenInsertItemTest() {
        stack.push(0);
        int size = stack.size();

        assertEquals(1, size);
    }

    @Test
    @DisplayName("empty 테스트")
    public void emptyTest() {
        boolean isEmpty = stack.empty();
        assertTrue(isEmpty);
    }
}