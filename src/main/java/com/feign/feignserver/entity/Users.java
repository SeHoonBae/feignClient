package com.feign.feignserver.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
public class Users {

    @Id
    private String userId;

    @Column
    private String userName;

}
