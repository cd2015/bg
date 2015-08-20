package com.bg.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_attribute")
public class UserAttribute implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2072512791990317443L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="type_attribute_id")
	private TypeAttribute typeAttribute;
	
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TypeAttribute getTypeAttribute() {
		return typeAttribute;
	}

	public void setTypeAttribute(TypeAttribute typeAttribute) {
		this.typeAttribute = typeAttribute;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
