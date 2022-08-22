package kr.smhrd.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.mapper.BoardVO;

// 내가바로 Controller = POJO

// Controller를 달아주어야만 dispatcher Servlet가 컨트롤러임을 알아봄
@Controller // 자동완성하면 import까지 같이됨
public class BoardController {

	// 게시판 기능

	// localhost:8081/web/boardList.do
	@RequestMapping("/boardList.do")
	public String boardList(HttpServletRequest request) {
		// 데이터베이스 연결
		// 번호, 제목, 내용, 조회수, 작성자, 작성일 -> DTO, VO
		// -> 게시글 하나를 묶어줄 수 있는 데이터 타입

		BoardVO vo1 = new BoardVO(1, "오늘은 시원해", "연습용", 14, "송정", "2021.09.08");
		BoardVO vo2 = new BoardVO(2, "자바", "자반고등어", 4, "자반고등어", "2021.09.07");
		BoardVO vo3 = new BoardVO(3, "콜론콜론", "세미콜론", 1, "세미콜론", "2021.09.03");
		BoardVO vo4 = new BoardVO(4, "누구세요", "뚱인데요", 11, "뚱인데요", "2021.09.02");
		BoardVO vo5 = new BoardVO(5, "연습", "연습", 6, "연습", "2021.09.01");
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);
		
		// 값 보내기
		request.setAttribute("list", list);
		// 동적바인딩 : request에 데이터를 담아 views의 boardList.jsp로 전달해 줌, 이러한 기능을 동적 바인딩이라 함
		// 위까지가 기존 JSP방식
		// 스프링에서는 request가 아닌 Model이라는 것을 사용함
		
		
		
		
		return "boardList"; // WEB-INF/views/boardList.jsp
	}
}