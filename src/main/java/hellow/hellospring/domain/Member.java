package hellow.hellospring.domain;

/*
데이터 : 회원ID, 이름
기능: 회원 등록, 조회
아직 데이터 저장소가 선정되지 않음, DB가 아직 선정X(가상 시나리오)
 */
public class Member {

	private Long id; // 시스템이 정하는 아이디(고객이 정하는 아이디가 아님)
	private String name; // 닉네임의 개념


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}