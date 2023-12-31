package pack.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GogekDto {
	private String gogek_no,gogek_name,gogek_gen,gogek_age,gogek_tel;

	public String getGogek_no() {
		return gogek_no;
	}

	public void setGogek_no(String gogek_no) {
		this.gogek_no = gogek_no;
	}

	public String getGogek_name() {
		return gogek_name;
	}

	public void setGogek_name(String gogek_name) {
		this.gogek_name = gogek_name;
	}

	public String getGogek_gen() {
		return gogek_gen;
	}

	public void setGogek_gen(String gogek_gen) {
		this.gogek_gen = gogek_gen;
	}

	public String getGogek_age() {
		return gogek_age;
	}

	public void setGogek_age(String gogek_age) {
		this.gogek_age = gogek_age;
	}

	public String getGogek_tel() {
		return gogek_tel;
	}

	public void setGogek_tel(String gogek_tel) {
		this.gogek_tel = gogek_tel;
	}
}
