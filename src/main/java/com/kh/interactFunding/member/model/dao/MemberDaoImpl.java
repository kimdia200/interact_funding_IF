package com.kh.interactFunding.member.model.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.interactFunding.member.model.vo.Coupon;
import com.kh.interactFunding.member.model.vo.Member;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSessionTemplate session;

	// 김윤수
	@Override
	public int selectEmailCheck(Map<String, Object> map) {
		log.debug("map@dao = {}", map);
		return session.selectOne("member.selectEmailCheck", map);
	}

	@Override
	public int insertMemberIf(Member member) {
		return session.insert("member.insertMemberIf", member);
	}

	@Override
	public Member selectOneMember(Member member) {
		log.debug("member.email={}",member.getEmail());
		return session.selectOne("member.selectOneMember", member);
	}

	@Override
	public int insertPoint(Map<String, Object> map) {
		return session.insert("member.insertPoint",map);
	}

	@Override
	public Coupon selectOneCoupon(Map<String, Object> map) {
		return session.selectOne("member.selectOneCoupon",map);
	}

	@Override
	public int selectCouponRecordCheck(Map<String, Object> map) {
		return session.selectOne("member.selectCouponRecordCheck",map);
	}

	@Override
	public int insertCoupon(Map<String, Object> map) {
		return session.insert("member.insertCoupon",map);
	}
	
	

	// 김경태

	// 김주연

	// 박요한

	// 배기원

	// 이승우

	// 천호현
}
