package com.example.vueonthespringboot01.service;

import com.example.vueonthespringboot01.dao.UserDao;
import com.example.vueonthespringboot01.dao.UserDaoImpl;
import com.example.vueonthespringboot01.dto.ResultDTO;
import com.example.vueonthespringboot01.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserDao userDao;
    private ResultDTO resultDTO;

    @Override
    public ResultDTO findAll() {
        resultDTO = new ResultDTO();
        List<UserDTO> resultList = userDao.findAll();
        if (resultList != null){
            resultDTO.setState(true);
            resultDTO.setResult(resultList);
        }else {
            resultDTO.setState(false);
        }
        return resultDTO;

    }

    @Override
    public ResultDTO findById(UserDTO userDTO) {
        return resultDTO;
    }

    @Override
    public ResultDTO delete(int no) {
        return resultDTO;
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {
        return resultDTO;
    }
}
