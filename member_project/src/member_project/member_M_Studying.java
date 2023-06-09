package member_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class user {

	private String userId;
	private String userPw;
	private String name;
	private String phone;
	private String grade;
	private int age;

	public void User() {
	};

	public void User(String userId, String userPw, String name, String phone, String grade, int age) {
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.phone = phone;
		this.grade = grade;
		this.age = age;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userPw
	 */
	public String getUserPw() {
		return userPw;
	}

	/**
	 * @param userPw the userPw to set
	 */
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(userId).append(" \t | ").append(userPw).append(" \t | ").append(name).append(" \t | ")
				.append(phone).append(" \t | ").append(grade).append(" \t | ").append(age);
		return builder.toString();
	}
}



public class member_M_Studying {

	public static void main(String[] args) {



	}

}
