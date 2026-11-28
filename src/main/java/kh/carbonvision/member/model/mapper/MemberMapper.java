package kh.carbonvision.member.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import kh.carbonvision.member.model.vo.Member;

@Mapper
public interface MemberMapper {

	Member logIn(Member m);

}
