# Custom-Exception-SpringBoot-

## Overview

This project demonstrates how to create and handle a custom exception in Spring Boot using:

* Custom Exception (`UserNotFoundException`)
* Service Layer
* Global Exception Handler (`@RestControllerAdvice`)

## Configuration

### application.yml

```yaml
server:
  port: 9096
```

The application runs on:

```text
http://localhost:9096
```

## Custom Exception

```java
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
```

## Global Exception Handler

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleUserNotFoundException(
            UserNotFoundException ex) {

        return new ErrorResponse(
                "USER_NOT_FOUND",
                ex.getMessage()
        );
    }
}
```

## Example Response

```json
{
  "errorCode": "USER_NOT_FOUND",
  "message": "User not found with id: 5"
}
```

## Run the Application

```bash
mvn spring-boot:run
```

This example shows how to create a custom exception, throw it from the service layer, and handle it globally using `@RestControllerAdvice`.
