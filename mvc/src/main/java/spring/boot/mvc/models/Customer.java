package spring.boot.mvc.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
@NotNull(message = "Last name should not be null")
@Size(max = 20, min = 5 , message = "The lastName should be between 5 to 20")

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
}
