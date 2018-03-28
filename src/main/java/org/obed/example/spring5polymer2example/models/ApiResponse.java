package org.obed.example.spring5polymer2example.models;

/**
 * Created by obed on 3/27/18.
 */
public class ApiResponse<T> {

    private boolean success;

    private T content;

    private String message;

    public ApiResponse(boolean success, T content, String message) {

        this.success = success;
        this.content = content;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
