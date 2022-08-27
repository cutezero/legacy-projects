package in.co.irctc.web.provider.pojo;

public class PassengerInfo {

	private String name;
	private int age;
	private String proofId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	@Override
	public String toString() {
		return "PassengerInfo [name=" + name + ", age=" + age + ", proofId="
				+ proofId + "]";
	}
	
}
