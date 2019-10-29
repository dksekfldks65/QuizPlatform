package com.quiz.web.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WritingDtlDto extends BaseDto{
	
	private int    writing_no;        //게시글번호
	private String title;             //게시글 제목
	private String summary;           //요약
	private String ques_type_div_cd;  //글타입
	private String content;           //본문 내용
	private String fir_writ_content;  //첫번째 투표 내용 
	private String sec_writ_content;  //두번째 투표 내용
	private String fact_content;      //팩트 체크 정보
	private String fact_link;         //팩트링크 정보
	private String title_img_path;    //제목 이미지 경로
	private String nickname;          //닉네임
	private int    hits;              //조회수
	private int    sum_vote;          //총 투표수
	private int    sum_comment;       //총 댓글수
	private double popularity;        //인기도
	private int    fir_vote_no;       //첫번째 투표 수
	private int    sec_vote_no;       //두번째 투표 수
	private int    fir_vote_perc;     //첫번째 투표 퍼센트
	private int    sec_vote_perc;     //두번째 투표 퍼센트
	private int    vote_diff;         //투표율 차이
	private boolean report;           //0:신고x, 1:신고
	private Integer vote;             // 찬성1, 반대2, 투표값 없으면 null
	private List<CommentDto> detailCommentList; //댓글 리스트
	private boolean isMine;           //내가 쓴 게시글일경우 true, 아니면 false
	private boolean isSuccess;        //게시글 삭제 성공시 true, 실패시 false

	public int getWriting_no() {
		return writing_no;
	}
	public void setWriting_no(int writing_no) {
		this.writing_no = writing_no;
	}
	public String getQues_type_div_cd() {
		return ques_type_div_cd;
	}
	public void setQues_type_div_cd(String ques_type_div_cd) {
		this.ques_type_div_cd = ques_type_div_cd;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFir_writ_content() {
		return fir_writ_content;
	}
	public void setFir_writ_content(String fir_writ_content) {
		this.fir_writ_content = fir_writ_content;
	}
	public String getSec_writ_content() {
		return sec_writ_content;
	}
	public void setSec_writ_content(String sec_writ_content) {
		this.sec_writ_content = sec_writ_content;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getSum_vote() {
		return sum_vote;
	}
	public void setSum_vote(int sum_vote) {
		this.sum_vote = sum_vote;
	}
	public int getSum_comment() {
		return sum_comment;
	}
	public void setSum_comment(int sum_comment) {
		this.sum_comment = sum_comment;
	}
	public int getFir_vote_perc() {
		return fir_vote_perc;
	}
	public void setFir_vote_perc(int fir_vote_perc) {
		this.fir_vote_perc = fir_vote_perc;
	}
	public int getSec_vote_perc() {
		return sec_vote_perc;
	}
	public void setSec_vote_perc(int sec_vote_perc) {
		this.sec_vote_perc = sec_vote_perc;
	}
	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	public List<CommentDto> getDetailCommentList() {
		return detailCommentList;
	}

	public void setDetailCommentList(List<CommentDto> detailCommentList) {
		this.detailCommentList = detailCommentList;
	}
	public int getVote_diff() {
		return vote_diff;
	}
	public void setVote_diff(int vote_diff) {
		this.vote_diff = vote_diff;
	}
	public Integer getVote() {
		return vote;
	}
	public void setVote(Integer vote) {
		this.vote = vote;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getFir_vote_no() {
		return fir_vote_no;
	}
	public void setFir_vote_no(int fir_vote_no) {
		this.fir_vote_no = fir_vote_no;
	}
	public int getSec_vote_no() {
		return sec_vote_no;
	}
	public void setSec_vote_no(int sec_vote_no) {
		this.sec_vote_no = sec_vote_no;
	}
	public boolean isReport() {
		return report;
	}
	public void setReport(boolean report) {
		this.report = report;
	}
	public boolean isMine() {
		return isMine;
	}
	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTitle_img_path() {
		return title_img_path;
	}
	public void setTitle_img_path(String title_img_path) {
		this.title_img_path = title_img_path;
	}
	public String getFact_content() {
		return fact_content;
	}
	public void setFact_content(String fact_content) {
		this.fact_content = fact_content;
	}
	public String getFact_link() {
		return fact_link;
	}
	public void setFact_link(String fact_link) {
		this.fact_link = fact_link;
	}
}
