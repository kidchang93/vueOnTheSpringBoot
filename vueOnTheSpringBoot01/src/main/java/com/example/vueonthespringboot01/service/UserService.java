package com.example.vueonthespringboot01.service;

import com.example.vueonthespringboot01.dto.ResultDTO;
import com.example.vueonthespringboot01.dto.UserDTO;

public interface UserService {

    public ResultDTO findAll();
    public ResultDTO findById(UserDTO userDTO);
    public ResultDTO delete(int no);
    public ResultDTO save(UserDTO userDTO);


}
