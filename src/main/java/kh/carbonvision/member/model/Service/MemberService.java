package kh.carbonvision.member.model.Service;

import org.springframework.stereotype.Service;

import kh.carbonvision.member.model.mapper.MemberMapper;
import kh.carbonvision.member.model.vo.Member;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberMapper mapper;

	public Member logIn(Member m) {
		return mapper.logIn(m);
	}
}
