package com.seo.myapp.reply.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seo.myapp.reply.ReplyService;
import com.seo.myapp.reply.ReplyVO;

@Service("BoardService")
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyDAO2 replyDAO;
	
	@Override
	public void insertReply(ReplyVO vo) {
		// TODO Auto-generated method stub
		replyDAO.insertReply(vo);
	}

	@Override
	public void updateReply(ReplyVO vo) {
		// TODO Auto-generated method stub
		replyDAO.updateReply(vo);
	}

	@Override
	public void deleteReply(ReplyVO vo) {
		// TODO Auto-generated method stub
		replyDAO.deleteReply(vo);
	}


}
