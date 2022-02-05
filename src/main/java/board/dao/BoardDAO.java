package board.dao;

import java.util.List;



import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import board.dto.UserDTO;
//실질적으로 mapper와  연결된 선언부
@Mapper
public interface BoardDAO {
	
	 
	List<Map> selectContents(Map param) throws Exception;
}
