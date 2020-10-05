package tomeralony.homeproject.microservices.servicelog.DTO;

public class RequestDTO {

    private String remoteHost;
    private String method;
    private String requestURI;

    public RequestDTO(String requestURI, String remoteHost, String method) {
        this.requestURI = requestURI;
        this.remoteHost = remoteHost;
        this.method = method;
    }

    public String remoteHost() {
        return remoteHost;
    }

    public String getMethod() {
        return method;
    }

    public String getRequestURI() {
        return requestURI;
    }
}
