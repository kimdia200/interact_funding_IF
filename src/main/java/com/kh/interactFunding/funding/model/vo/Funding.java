package com.kh.interactFunding.funding.model.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funding {
	
	
	//이승우
	private int fundingNo;
	private String title;
	private String categoryCode;
	private int nowAmount;
	private int goalAmount;
	private String ratePlanCode;
	private int writerNo;
	private int readCount;
	private int likeCount;
	private String content;
	private String earlyContent;
	
	//김주연 start_day date로 변환
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	//김주연 d_day date로 변환
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dDay;
	
	private Date regDate;
	private String phone;
	
	
}
