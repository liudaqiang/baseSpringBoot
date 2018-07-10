package com.lq.bite.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户
 * @author l.q
 *
 */
@ApiModel(value = "User", description = "用户信息描述")
public class User {
	@ApiModelProperty("用户id")
	private int id;
	@ApiModelProperty("用户名")
	private String userName;
	@ApiModelProperty("密码")
	private String password;
	@ApiModelProperty("邮箱")
	private String email;
	@ApiModelProperty("创建时间")
	private Date createDate;
	@ApiModelProperty("是否有限 0有效1无效")
	private String yn;//0有效1无效
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getYn() {
		return yn;
	}
	public void setYn(String yn) {
		this.yn = yn;
	}
	
	
}
