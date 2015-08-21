package com.bg.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9093306784861472479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private Type type;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="user", cascade = CascadeType.ALL)
	private Set<UserAttribute> userAttributes;
	
	private int enabled = 1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Set<UserAttribute> getUserAttributes() {
		return userAttributes;
	}

	public void setUserAttributes(Set<UserAttribute> userAttributes) {
		this.userAttributes = userAttributes;
	}
}
