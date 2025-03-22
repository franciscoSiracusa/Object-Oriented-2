import org.example.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private static User user1;

    @BeforeAll
    public static void setUp() {
        user1 = new User("name1");
    }

    @Test
    public void postTweetTest() {
        assertEquals(user1.getTweets().size(), 0);
        assertEquals(user1.postTweet("this is the tweet text"), true);
        assertEquals(user1.getTweets().size(), 1);
        assertEquals(user1.postTweet("this is the tweet text"), true);

        assertEquals(user1.postTweet("this is another tweet text"), true);
        assertEquals(user1.getTweets().size(), 3);

        assertEquals(user1.postTweet(""), false);
        assertEquals(user1.postTweet(" "), false);

        String ultraText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc at felis massa. Nunc lobortis ligula odio, condimentum tempor diam viverra nec. Vivamus placerat tincidunt mi. Nulla sollicitudin venenatis malesuada. Donec auctor, ligula id commodo porta, quam urna ullamcorper sapien, ut placerat urna risus ut neque. Nulla vehicula, mauris ut euismod tempor, risus ex vulputate odio, pharetra consectetur turpis urna eu diam. Nunc et condimentum dolor. Aliquam ut fringilla quam. Donec ornare, lectus in placerat congue, nulla neque venenatis mauris, posuere luctus tortor lacus eu mi. Curabitur nibh lacus, suscipit nec arcu et, facilisis convallis lorem.";
        assertEquals(user1.postTweet(ultraText), false);

        String text280 = "La tecnología está cambiando rápidamente la forma en que vivimos y trabajamos. Cada avance nos brinda nuevas oportunidades, pero también plantea desafíos. Es fundamental adaptarse y aprender continuamente para aprovechar al máximo el potencial de la innovación en nuestras vidas.";
        assertEquals(user1.postTweet(text280), true);

        assertEquals(user1.getTweets().size(), 4);
    }
}
