package com.example.PS12154_QuocDat.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "EmployeeRoles", uniqueConstraints = { @UniqueConstraint(columnNames = { "username", "roleId" }) })
public class EmployeeRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "username")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;
}
