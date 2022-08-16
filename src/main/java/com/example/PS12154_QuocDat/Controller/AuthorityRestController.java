package com.example.PS12154_QuocDat.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PS12154_QuocDat.DAO.EmployeeDAO;
import com.example.PS12154_QuocDat.DAO.EmployeeRoleDAO;
import com.example.PS12154_QuocDat.DAO.RoleDAO;
import com.example.PS12154_QuocDat.Model.EmployeeRole;

@RestController
public class AuthorityRestController {
    @Autowired
    EmployeeDAO employeeDAO;
    @Autowired
    RoleDAO roleDAO;
    @Autowired
    EmployeeRoleDAO employeeRoleDAO;

    @GetMapping("/rest/authorities")
    public Map<String, Object> getAuthorities() {
        Map<String, Object> data = new HashMap<>();
        data.put("authorities", employeeRoleDAO.findAll());
        data.put("roles", roleDAO.findAll());
        data.put("accounts", employeeDAO.findAll());
        return data;
    }   

    @DeleteMapping("/rest/authorities/{id}")
    public void delete(@PathVariable("id") Integer id) {
        employeeRoleDAO.deleteById(id);
    }

    @PostMapping("/rest/authorities")
    public EmployeeRole create(@RequestBody EmployeeRole employeeRole){
         return employeeRoleDAO.save(employeeRole);
    }

}
