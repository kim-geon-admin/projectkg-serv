package board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import board.dao.BoardDAO;


@Service
public class BoardService {
	@Autowired
	BoardDAO boardDao;
	
	
	public List<Map> selectContents(Map<String,Object> param) throws Exception { //query String으로 county를 받도록 설정
		
		System.out.println("컨텐츠 조회 시작");
		final List<Map> userList = boardDao.selectContents(param);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		System.out.println(userList.size());
		return userList;
		
	}
	
}
