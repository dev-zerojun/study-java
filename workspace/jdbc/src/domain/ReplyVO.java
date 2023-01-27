package domain;

public class ReplyVO {
//	REPLY_ID NUMBER CONSTRAINT PK_REPLY PRIMARY KEY,
//	REPLY_CONTENT VARCHAR2(1000) NOT NULL,
//	REPLY_REGISTER_DATE DATE DEFAULT SYSDATE,
//	REPLY_UPDATE_DATE DATE DEFAULT SYSDATE,
//	USER_ID NUMBER NOT NULL,
//	BOARD_ID NUMBER NOT NULL,
//	REPLY_GROUP NUMBER NOT NULL,
//	REPLY_DEPTH NUMBER NOT NULL
	
	private Long replyId;
	private String replyContent;
	private String replyRegisterDate;
	private String replyUpdateDate;
	private Long userId;
	private Long boardId;
	private Long replyGroup;
	private Long replyDeapth;
	
	public ReplyVO() {;}

	public Long getReplyId() {
		return replyId;
	}

	public void setReplyId(Long replyId) {
		this.replyId = replyId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyRegisterDate() {
		return replyRegisterDate;
	}

	public void setReplyRegisterDate(String replyRegisterDate) {
		this.replyRegisterDate = replyRegisterDate;
	}

	public String getReplyUpdateDate() {
		return replyUpdateDate;
	}

	public void setReplyUpdateDate(String replyUpdateDate) {
		this.replyUpdateDate = replyUpdateDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getBoardId() {
		return boardId;
	}

	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}

	public Long getReplyGroup() {
		return replyGroup;
	}

	public void setReplyGroup(Long replyGroup) {
		this.replyGroup = replyGroup;
	}

	public Long getReplyDeapth() {
		return replyDeapth;
	}

	public void setReplyDeapth(Long replyDeapth) {
		this.replyDeapth = replyDeapth;
	}

	@Override
	public String toString() {
		return "ReplyVO [replyId=" + replyId + ", replyContent=" + replyContent + ", replyRegisterDate="
				+ replyRegisterDate + ", replyUpdateDate=" + replyUpdateDate + ", userId=" + userId + ", boardId="
				+ boardId + ", replyGroup=" + replyGroup + ", replyDeapth=" + replyDeapth + "]";
	}
	

	
	
}