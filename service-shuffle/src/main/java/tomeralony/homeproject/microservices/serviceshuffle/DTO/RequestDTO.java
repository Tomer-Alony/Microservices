package tomeralony.homeproject.microservices.serviceshuffle.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDTO {

    @JsonProperty
    private String remoteHost;
    @JsonProperty
    private String method;
    @JsonProperty
    private String requestURI;

    public RequestDTO(String requestURI, String remoteHost, String method) {
        this.requestURI = requestURI;
        this.remoteHost = remoteHost;
        this.method = method;
    }
}
