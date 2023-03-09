import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTests {
    @Test
    @DisplayName("스택 생성 테스트")
    public void createStackTest() {
        Stack stack = new Stack();
    }

    @Test
    @DisplayName("push 테스트")
    public void pushTest() {
        //given
        Stack stack = new Stack();

        //when
        int pushedItem = stack.push(5);

        //then
        assertEquals(5, pushedItem);
    }
}
