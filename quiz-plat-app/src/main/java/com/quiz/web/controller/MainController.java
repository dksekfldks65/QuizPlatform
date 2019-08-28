package com.quiz.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.web.dto.UserDto;
import com.quiz.web.dto.WritingDtlDto;
import com.quiz.web.service.UserService;
import com.quiz.web.service.WritingDtlService;

import common.paging.dto.PagingDto;

/**
 * 메인페이지 컨트롤러
 * @ author : GOOHOON
 * @ version 1.0
 */
@Controller
public class MainController {
	
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
    
    @Autowired
    private WritingDtlService writingDtlService;
    
    @Autowired
    private UserService userService;
    
    /**
     * 인기순 조회(메인)
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(HttpSession session, HttpServletRequest request) throws Exception{
    	
        return "home";
    }

    /*
     ** 메인페이지 비동기 페이징 처리
     */    
    @CrossOrigin
    @RequestMapping(value = "/getPagingList", method = RequestMethod.GET)
    public @ResponseBody List<WritingDtlDto> getPagingList(HttpSession session, HttpServletRequest request
    		          , @RequestParam(value="page") String page, @RequestParam(value="mainCategory") String mainCategory) throws Exception{
    	
    	//유저정보 획득
    	UserDto userDto = userService.getUesrSettingDto(session, request);
    	
    	//parameter로 줄 pagingDto 값 세팅
    	PagingDto pagingDto = new PagingDto();
    	pagingDto.setPage_num(Integer.parseInt(page));
    	pagingDto.setUser_id(userDto.getUser_id());
    	pagingDto.setMainCategory(Integer.parseInt(mainCategory));
    	
    	List<WritingDtlDto> writingDtlDtoList = writingDtlService.getMainPageWritingList(pagingDto);

        return writingDtlDtoList;
    }
}
