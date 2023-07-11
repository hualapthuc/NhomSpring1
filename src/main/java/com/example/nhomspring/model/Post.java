package com.example.nhomspring.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;

    @ManyToOne
    @JoinColumn(name ="company_id")
    private Company company;

    @Column(name = "post_name", nullable = false, length = 255)
    private String post_name;

    @Column(name = "zipcode", nullable = false,length = 255)
    private String zipcode;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @Column(name = "in_telephone", nullable = false,length = 255)
    private String in_telephone;

    @Column(name = "out_telephone", nullable = false,length = 255)
    private String out_telephone;

    @Column(name = "fax_number", nullable = false,length = 255)
    private String fax_number;

    @Column(name = "sort", nullable = false,length = 255)
    private String sort;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Group group;

    @Column(name = "created_date", nullable = false)
    private Date createDate;

    @Column(name = "updated_date", nullable = false)
    private Date updateDate;


}
