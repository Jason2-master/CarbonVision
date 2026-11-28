package kh.carbonvision.member.contoller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import kh.carbonvision.member.model.Service.MemberService;
import kh.carbonvision.member.model.vo.Member;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rest/member")
public class MemberRestController {
	
	private final MemberService mService;
	
	@PostMapping("logIn")
	public String logIn(@ModelAttribute Member m,HttpSession session) {
		Member loginUser = mService.logIn(m);
		
		if(loginUser != null) {
			loginUser.setMemberPwd(null);
			session.setAttribute("loginUser", loginUser);
			return "success";
		}else {
			return "fail";
		}
	}
}
