package com.kapture.elk.pro.dto;

import lombok.Data;
import javax.persistence.*;

@Table
@Entity(name = "client_customer")
public @Data class ClientCustomer extends BaseObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "client_id")
    long clientId;

    @Column(name = "name")
    String name;

    @Column(name = "password")
    String password;

    @Column(name = "email")
    String email;

    @Column(name = "phone")
    String phone;

    @Column(name = "address")
    String address;

}
