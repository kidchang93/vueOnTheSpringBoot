package com.example.vueonthespringboot01.dao;

import com.example.vueonthespringboot01.dto.UserDTO;

import java.util.List;

public interface UserDao {
    public List<UserDTO> findAll();
    public int editById(UserDTO userDTO);
    public int delete(int no);
    public int save(UserDTO userDTO);
}
