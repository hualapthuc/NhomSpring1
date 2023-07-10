package com.example.nhomspring.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
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

    @Column(name = "sort", nullable = false, length = 255)
    private String sort;

    @Column(name = "created_date", nullable = false, length = 200)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createDate = new Date();

    @Column(name = "updated_date", nullable = false, length = 200)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updateDate = new Date();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "position")
    private List<User> listUser;
}
