package com.tttt;

public class Love {
	private String name;
	private String sex;
	private String age;

	public Love(String name, String sex, String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private void makelove() {

	}

	@Override
	public String toString() {
		return "Love [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
}
