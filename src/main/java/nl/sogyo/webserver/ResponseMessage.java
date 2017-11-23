package nl.sogyo.webserver;

import java.time.ZonedDateTime;

/**
 * Created by jbox on 7/14/2017.
 */
public class ResponseMessage implements Response{
    HttpStatusCode status;
    String content;
    @Override
    public HttpStatusCode getStatus() {
        return status;
    }

    @Override
    public void setStatus(HttpStatusCode status) {
        this.status = status;
    }

    @Override
    public ZonedDateTime getDate() {
        return ZonedDateTime.now();
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
