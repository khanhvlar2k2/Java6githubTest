package com.example.PS12154_QuocDat.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="Roles")
public class Role implements Serializable {
    @Id
    private String id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy="role")
    List<EmployeeRole> employeerole;
}
