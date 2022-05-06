package ru.telegram.userdb.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users {
    @Id
    private Long id;
    @NotNull
    @Column(name = "firstname")
    @NonNull
    private String firsName;
    @Column(name = "lasttname")
    private String lastName;
    @Column(name = "username")
    private String userName;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
}
