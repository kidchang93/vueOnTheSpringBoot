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
    public ResultDTO editById(UserDTO userDTO) {

        resultDTO = new ResultDTO();

        int state = userDao.editById(userDTO);

        if (state == 1){
            resultDTO.setState(true);
            resultDTO.setMessage("사용자 수정이 성공 하였습니다.");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 수정이 실패 하였습니다.");
        }


        return resultDTO;
    }


    @Override
    public ResultDTO findById(UserDTO userDTO) {
        return resultDTO;
    }

    @Override
    public ResultDTO delete(int no) {

        resultDTO = new ResultDTO();
        int state = userDao.delete(no);
        if (state == 1){
          resultDTO.setState(true);
          resultDTO.setMessage("사용자 삭제가 성공하였습니다.");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 삭제가 실패하였습니다.");
        }

        return resultDTO;
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {
        resultDTO = new ResultDTO();
        int state = userDao.save(userDTO);
        if (state == 1){
            resultDTO.setState(true);
            resultDTO.setMessage("사용자 생성이 성공하였습니다.");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 생성이 실패하였습니다.");
        }

        return resultDTO;
    }


}
