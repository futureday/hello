package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class RoleCntroller {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/getRoles")
    public List<Role> getRoles(){
        return roleService.getRoles();
    }

    @RequestMapping("/delete/{id}")
    public void deleteRole(@PathVariable Integer id){
        roleService.deleteRole(id);
    }



}
