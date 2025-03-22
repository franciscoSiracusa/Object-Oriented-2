import org.example.Twitter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwitterTest {

    private static Twitter twitter;

    @BeforeAll
    public static void setUp() {
        twitter = new Twitter();
    }

    @Test
    public void registerUserTest() {
        assertEquals(twitter.registerUser("user1"), true);
        assertEquals(twitter.registerUser("user1"), false);
        assertEquals(twitter.getUsers().size(), 1);

        assertEquals(twitter.registerUser("user2"), true);
        assertEquals(twitter.getUsers().size(), 2);
    }
}
