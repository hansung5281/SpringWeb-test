package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

	// -페이지를 요청할 때
	List<NoticeView> getViewList(boolean pub); 

	// -검색을 요청할 때
	List<NoticeView> getViewList(String field, String query,boolean pub);

	// -페이지를 요청할 때
	List<NoticeView> getViewList(int page, String field, String query, boolean pub);

	int getCount();

	int getCount(String field, String query, boolean pub);

	// -자세한 페이지 요청할 때
	NoticeView getView(int id);

	Notice getNext(int id);

	Notice getPrev(int id);

	// -일괄공개를 요청할 때
	int updatePubAll(int[] pubIds, int[] closeIds);
	 //-일괄삭제를 요청할 때
	int deleteAll(int[] ids);

	// -수정 페이지를 요청할 떄
	int update(Notice notice);

	int delete(int id);

	int insert(Notice notice);
}
