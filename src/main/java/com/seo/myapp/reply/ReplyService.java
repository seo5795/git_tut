package com.seo.myapp.reply;

import java.util.List;


public interface ReplyService {
	public void insertReply(ReplyVO vo);
	public void updateReply(ReplyVO vo);
	public void deleteReply(ReplyVO vo);
	public List<ReplyVO> getReplyList(ReplyVO vo);
}
