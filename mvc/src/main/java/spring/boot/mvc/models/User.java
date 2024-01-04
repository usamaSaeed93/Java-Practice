package spring.boot.mvc.models;
import javax.validation.constraints.*;
public class User {

    @NotBlank(message = "Username is required")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Email(message = "Please provide a valid email")
    private String email;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

}

