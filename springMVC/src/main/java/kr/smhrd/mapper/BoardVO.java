package kr.smhrd.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// DTO와 같은 개념, 웹에선 보통 VO라 많이 부름

@Data
@AllArgsConstructor // 매개변수
@NoArgsConstructor // 기본생성자 디폴트
@RequiredArgsConstructor // 일부분만 받아 매개변수를 만들고 싶다면,
public class BoardVO {
	
	// 전역변수, 멤버변수, 속성, 필드 같은말
	private int idx; // 번호
	@NonNull
	private String title; // 제목
	@NonNull
	private String contents; // 내용
	private int count; // 조회수
	private String writer; // 작성자
	private String indate; // 작성일

}
