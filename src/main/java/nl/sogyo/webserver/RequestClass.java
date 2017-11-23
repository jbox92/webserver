package nl.sogyo.webserver;

import java.util.ArrayList;

/**
 * Created by jbox on 7/13/2017.
 */
public class RequestClass implements Request {
    private ArrayList<String> request;
    RequestClass(ArrayList<String> request) {
        this.request = request;
    }
    @Override
    public HttpMethod getHTTPMethod() {
        String method = request.get(0).substring(0,request.get(0).indexOf(' '));
        if (method.equals(HttpMethod.GET.toString())) {
            return HttpMethod.GET;
        } else if (method.equals(HttpMethod.POST.toString())) {
            return HttpMethod.POST;
        } else {
            return null;
        }
    }
    @Override
    public String getResourcePath() {
        String path = request.get(0).substring(request.get(0).indexOf('/'));
        return path.substring(0,path.indexOf(' '));
    }
}
