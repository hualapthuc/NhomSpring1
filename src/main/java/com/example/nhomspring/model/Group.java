package com.example.nhomspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "group_name", nullable = false, length = 200)
    private String name;

    @Column(name = "objectdata", nullable = false, length = 200)
    private String objectData;

    @Column(name = "owner_id", nullable = false, length = 200)
    private String ownerId;

    @Column(name = "group_alias_name", nullable = false, length = 200)
    private String groupAliasName;

    @Column(name = "public_flag", nullable = false, length = 200)
    private String publicFlag;
}
