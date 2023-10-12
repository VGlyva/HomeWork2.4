package pro.sky.skyprospringdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyException extends RuntimeException{

    public EmployeeAlreadyException() {
    }

    public EmployeeAlreadyException(String message) {
        super(message);
    }

    public EmployeeAlreadyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAlreadyException(Throwable cause) {
        super(cause);
    }

    public EmployeeAlreadyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
