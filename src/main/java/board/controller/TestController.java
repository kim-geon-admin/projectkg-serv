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
import board.service.UserService;

@RestController
@RequestMapping("/api")
public class TestController {

	@Autowired
	UserService userService;// UserDAO bean을 자동으로 주입

	@GetMapping("/ip")
	public List<UserDTO> users() throws Exception { // query String으로 county를 받도록 설정
		List<UserDTO> dd = userService.users(null);
		/*
		 * System.out.println("여기는요 : "+dd.size()); HashMap hs = new HashMap();
		 * hs.put("name", "김건"); hs.put("age", "16"); List li = new ArrayList();
		 * li.add(hs); return li;
		 */

		return dd;
	}

	
	  @RequestMapping("/userInfo")
	  @PostMapping("/userInfo") 
	  public List<Map> userInfo(@RequestBody Map<String,Object> param) throws Exception { //query String으로 county를 받도록 설정
	  
		  System.out.println(param); 
		  List<Map> dd = userService.usersPost(param);
		  return dd; 
	  }
	 
	//  @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd 물음표 뒤부터가 파라미터터
	//   public String getParameter(@RequestParam String id, @RequestParam String password){
	/*
	 * @RequestMapping("/userInfo")
	 * 
	 * @getMapping("/userInfo") public List<Map> userInfo(@RequestBody
	 * Map<String,Object> param) throws Exception { //query String으로 county를 받도록 설정
	 * System.out.println(param); List<Map> dd = userService.usersPost(param);
	 * 
	 * 
	 * return dd; }
	 */
	/*
	 * @PostMapping("/user") public ResponseEntity<List<board.dto.UserDTO>> ip
	 * (HttpServletRequest request) throws Exception { System.out.println("여기"); //
	 * 요청을 보낸 클라이언트의 IP주소를 반환합니다. return ResponseEntity.ok(userService.users(null));
	 * }
	 */

}