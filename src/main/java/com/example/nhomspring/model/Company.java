package com.example.nhomspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name", nullable = false, length = 200)
    private String company_name;
    @Column(name = "company_name_kana", nullable = false, length = 200)
    private String nameKana;

    @Column(name = "zipcode", nullable = false, length = 200)
    private String zipCode;

    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Column(name = "telephone", nullable = false, length = 200)
    private String telephone;

    @Column(name = "fax_number", nullable = false, length = 200)
    private String faxNumber;

    @Column(name = "url", nullable = false, length = 200)
    private String url;

    @Column(name = "ipaddress", nullable = false, length = 200)
    private String ipAddress;

    @Column(name = "port", nullable = false, length = 200)
    private String port;

    @Column(name = "ipaddress_internal", nullable = false, length = 200)
    private String ipAddressInternal;

    @Column(name = "port_internal", nullable = false, length = 200)
    private String portInternal;

    @Column(name = "create_date", nullable = false, length = 200)
    private Date createDate;

    @Column(name = "update_date", nullable = false, length = 200)
    private Date updateDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "company")
    private List<User> listUser;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Post> listPost;
}
