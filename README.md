# Microservices
microservices with spring boot and eureka.

discovery-server
- Eureka discovery server, to manage microservices communication.

service-shuffle
- Gets a number N from 1 to 1000 and returns a shuffled array with no duplicates.
- For every request received, sending a request to service-log to log said request.

service-log
- Gets a request object and logs it to the console.
