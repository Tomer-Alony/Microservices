package tomeralony.homeproject.microservices.serviceshuffle.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import reactor.core.publisher.Mono;
import tomeralony.homeproject.microservices.serviceshuffle.DTO.RequestDTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LogInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Value("${services.log.path}")
    private String logServicePath;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        RequestDTO req = new RequestDTO(request.getRequestURI(),
                request.getRemoteHost(), request.getMethod());

        // Make a request to other ms to log the current request
        webClientBuilder
                .build()
                .post()
                .uri(logServicePath)
                .body(Mono.just(req), RequestDTO.class)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe();

        return true;
    }
}
