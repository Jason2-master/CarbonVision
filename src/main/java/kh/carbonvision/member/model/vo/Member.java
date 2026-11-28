package kh.carbonvision.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
	
	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String name;
	private String nickname;
	private String email;
	private String phone;
	private Date enrollDate;
	private String memberStatus;
	private String profile;
	private Date suspendEndDate;
	private String memberRole;
	
}
