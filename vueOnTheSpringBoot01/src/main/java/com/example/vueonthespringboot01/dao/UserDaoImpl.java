package com.example.vueonthespringboot01.dao;

import com.example.vueonthespringboot01.dto.UserDTO;
import com.example.vueonthespringboot01.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao{

    private final UserMapper userMapper;

    @Override
    public List<UserDTO> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int editById(UserDTO userDTO) {
        return userMapper.editById(userDTO);
    }

    @Override
    public int delete(int no) {
        return userMapper.delete(no);
    }

    @Override
    public int save(UserDTO userDTO) {
        return userMapper.save(userDTO);
    }
}
