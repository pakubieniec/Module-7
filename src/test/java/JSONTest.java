import org.example.JSONMapper;
import org.example.JSONPlaceholderFetcher;
import org.example.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JSONTest {

    JSONMapper jm = new JSONMapper();
    JSONPlaceholderFetcher fetcher = new JSONPlaceholderFetcher();

    Post post = new Post(5, 55, "Wybory", "Wybory w Polsce w 2023 roku. Kto wygra te wybory?");
    String postString = "{\"userId\":5,\"id\":55,\"title\":\"Wybory\",\"body\":\"Wybory w Polsce w 2023 roku. Kto wygra te wybory?\"}";

    String json = "{\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 1,\n" +
            "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
            "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
            "  },\n";


    @Test
    public void jsonIsEqualsObject() {
        Assertions.assertEquals(jm.mapToJava(json), fetcher.getSinglePost(1));
    }

    @Test
    public void lengthArrayIsEqualOneHunred() {
        Assertions.assertEquals(100, fetcher.getAllPosts().size());
    }

    @Test
    public void postIsEqualStringPost() {
        Assertions.assertEquals(postString, jm.mapToJson(post));
    }

}
