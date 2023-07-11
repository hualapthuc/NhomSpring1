package com.example.nhomspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "group1")
@NoArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "group_name", nullable = false, length = 200)
    private String name;

    @Column(name = "objectdata", nullable = false, length = 200)
    private String objectData;

    @Column(name = "group_alias_name", nullable = false, length = 200)
    private String groupAliasName;

    @Column(name = "public_flag", nullable = false, length = 200)
    private String publicFlag;
    @OneToOne(mappedBy = "group")
    private Post post;
}
