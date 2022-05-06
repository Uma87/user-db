package ru.telegram.userdb.entity;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    @NonNull
    private String firsName;
    private String lastName;
    private String userName;
    private Double longitude;
    private Double latitude;
}
