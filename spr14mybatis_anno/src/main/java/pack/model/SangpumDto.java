package pack.model;

import org.springframework.stereotype.Component;

@Component
public class SangpumDto {
	private String jikwon_no, jikwon_name, buser_name, ibsa, count, jikwon_pay;

	public String getJikwon_no() {
		return jikwon_no;
	}

	public void setJikwon_no(String jikwon_no) {
		this.jikwon_no = jikwon_no;
	}

	public String getJikwon_name() {
		return jikwon_name;
	}

	public void setJikwon_name(String jikwon_name) {
		this.jikwon_name = jikwon_name;
	}

	public String getBuser_name() {
		return buser_name;
	}

	public void setBuser_name(String buser_name) {
		this.buser_name = buser_name;
	}

	public String getIbsa() {
		return ibsa;
	}

	public void setIbsa(String ibsa) {
		this.ibsa = ibsa;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getJikwon_pay() {
		return jikwon_pay;
	}

	public void setJikwon_pay(String jikwon_pay) {
		this.jikwon_pay = jikwon_pay;
	}
	
	
}


