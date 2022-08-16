package com.example.PS12154_QuocDat.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="Employees")
public class Employee implements Serializable {
    @Id
    private String username;
    private String password;
    private String fullname;
    private String email;
    @JsonIgnore
    @OneToMany(mappedBy="employee",fetch = FetchType.EAGER)
    //List<EmployeeRole> employeeRole;
    List<EmployeeRole> employeerole;
}
