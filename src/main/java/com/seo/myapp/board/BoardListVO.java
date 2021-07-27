package com.seo.myapp.board;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="boardList")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardListVO {
   private List<BoardVO> boardList;

   public List<BoardVO> getBoardList() {
      return boardList;
   }

   public void setBoardList(List<BoardVO> boardList) {
      this.boardList = boardList;
   }
}