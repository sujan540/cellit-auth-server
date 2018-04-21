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