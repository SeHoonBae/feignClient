package com.feign.feignserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Users {
    @Id
    private String userId;
    @Column
    private String userName;
}
