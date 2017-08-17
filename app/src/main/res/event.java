/**
 * Created by Tal Tzafrir on 8/17/2017.
 */

public class event {
    private String title;
    private String body;

    public event(String ttl, String bdy){
        title = ttl;
        body = bdy;
    }
    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
