package com.coding404.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coding404.board.model.BoardVO;

public interface BoardService {

	void regist(HttpServletRequest request, HttpServletResponse response); //등록기능
	List<BoardVO> getList(HttpServletRequest request, HttpServletResponse response);
	BoardVO getContent(HttpServletRequest request, HttpServletResponse response);//상세화면
	void update(HttpServletRequest request, HttpServletResponse response);

}
