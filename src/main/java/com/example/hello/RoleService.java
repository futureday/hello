package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> getRoles() {
        return roleMapper.getAllRole();
    }

    public void deleteRole(Integer id) {
        roleMapper.Delete(id);
    }
}
