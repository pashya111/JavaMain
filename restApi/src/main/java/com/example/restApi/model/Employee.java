package com.example.restApi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

@Getter
@Data
@Entity
@Table(name = "Empl")
public class Employee {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @NotBlank
    private String name;

    @Setter
    @Email
    @Column(unique = true)
    private String email;

    @Setter
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must have at least 8 characters, one uppercase, one lowercase, one numeric, and one special character.")
    private String password;

    @Setter
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits.")
    @Column(unique = true)
    private String phone;

    @Lob
    private byte[] image;

    public Employee() {
    }

    public void setImage(byte[] image) throws IOException {
        this.image = image;
    }
}
