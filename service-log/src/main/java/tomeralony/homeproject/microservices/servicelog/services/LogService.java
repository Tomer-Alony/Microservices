package tomeralony.homeproject.microservices.servicelog.services;

public interface LogService {
    void Log(String requestURI, String remoteUser, String method);
}
