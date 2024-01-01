package com.dextracodes.propertymgt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//This annotation prevents null return as a response.
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long Id;
    private String ownerName;
    @NotNull(message = "Owner Email is mandatory")
    @NotEmpty(message = "Owner email can not be empty")
    @Size(min = 10, max = 50, message = "Owner email should be 10 to 50 character length")
    private String ownerEmail;
    private String phone;

    @NotNull(message = "Password is mandatory")
    @NotEmpty(message = "Password can not be empty")
    private String password;
}
