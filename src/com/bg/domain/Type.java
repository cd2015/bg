package com.bg.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class Type implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2732624910762328697L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy="type")
	private Set<TypeAttribute> typeAttributes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<TypeAttribute> getTypeAttributes() {
		return typeAttributes;
	}

	public void setTypeAttributes(Set<TypeAttribute> typeAttributes) {
		this.typeAttributes = typeAttributes;
	}
}
