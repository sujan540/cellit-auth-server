## Running application for first time
To build application for first time execute following command from project root directory
```
mvn clean install liquibase:update package
```


## Building the application
To build application execute following command from project root directory

```
mvn clean liquibase:update package
```

## Running the application

### Spring Boot Plugin
```
mvn package spring-boot:run
```


## Other Sources
```
https://spring.io/guides/tutorials/spring-boot-oauth2/
https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes
```
