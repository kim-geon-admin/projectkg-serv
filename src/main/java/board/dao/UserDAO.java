package board.dao;

import java.util.List;


import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import board.dto.UserDTO;

@Mapper
public interface UserDAO {
	List<UserDTO> selectUsers(UserDTO param) throws Exception;
	
	List<Map> selectUsersPost(Map param) throws Exception;
}
