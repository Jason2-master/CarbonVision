package kh.carbonvision.member.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberViewController {

	@GetMapping("logIn")
	public String signInPage() {
		return "logIn";
	}
	
}
