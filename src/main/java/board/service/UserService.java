package board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import board.dao.UserDAO;
import board.dto.UserDTO;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	
	public List<UserDTO> users(@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String으로 county를 받도록 설정
		final UserDTO param = new UserDTO();//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		final List<UserDTO> userList = userDAO.selectUsers(param);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		System.out.println(userList.size());
		return userList;
		
	}
	
	public List<Map> usersPost(Map<String,Object> param) throws Exception { //query String으로 county를 받도록 설정
		
		final List<Map> userList = userDAO.selectUsersPost(param);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		System.out.println(userList.size());
		return userList;
		
	}
	
}
