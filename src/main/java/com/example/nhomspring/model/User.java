package com.example.nhomspring.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login_name", nullable = false, length = 200)
    private String name;

    @Column(name = "password", nullable = false, length = 200)
    private String password;

    @Column(name = "first_name", nullable = false, length = 200)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 200)
    private String lastName;

    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Column(name = "phone", nullable = false, length = 200)
    private String phone;

    @Column(name = "created_date", nullable = false, length = 200)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}
