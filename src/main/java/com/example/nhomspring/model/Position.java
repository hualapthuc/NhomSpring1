package com.example.nhomspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "position")
@Data
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "position_name", nullable = false, length = 255)
    private String name;

    @Column(name = "sort", nullable = false)
    private String sort;

    @Column(name = "created_date", nullable = false)
    private Date createDate;

    @Column(name = "updated_date", nullable = false)
    private Date updateDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "position")
    private List<User> listUser;
}
