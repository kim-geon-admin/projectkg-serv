package board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import board.dao.UserDAO;
import board.dto.UserDTO;
import board.service.BoardService;

@RestController
@RequestMapping("/api")
public class BoardController {

	@Autowired
	BoardService boardService;// UserDAO bean을 자동으로 주입

	   //localhost:8080/api/getParameter?id=1234&password=abcd 물음표 뒤부터가 파라미터터
	@GetMapping("/getContents")
	public List<Map> getContents() throws Exception{	
	// public List<Map> getContents(@RequestParam String id, @RequestParam String password){
		Map<String,Object> id = new HashMap();
		  List<Map> contents = boardService.selectContents(id);
		  return contents; 
	}



}