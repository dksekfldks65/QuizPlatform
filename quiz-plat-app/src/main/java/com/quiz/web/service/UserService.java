package com.quiz.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.web.dao.UserDao;
import com.quiz.web.dto.UserDto;

@Service
public class UserService {
	
	@Autowired
    private UserDao userDao;
	
    /*
     ** ���� ���  
     */
    public void insertUser(UserDto userDto) throws Exception{
    	userDao.insertUser(userDto);
    }
    
    /*
     ** �г��� ȹ��
     */
    public String getNickname() throws Exception{
    	return userDao.getNickname();
    }
    
    /*
     ** ���� ���̵� Ȯ��
     */
    public int chekUserId(String user_id) throws Exception{
    	return userDao.chekUserId(user_id);
    }
    
    /*
     ** �г��� ��뿩�� 'Y' ������Ʈ 
     */
    public void updateNickname(String nickname) throws Exception{
    	userDao.updateNickname(nickname);
    }
}