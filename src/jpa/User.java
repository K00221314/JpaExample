/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rob
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
	, @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId")
	, @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name")
	, @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
	, @NamedQuery (query = "Select e from User e where e.userId = :userId", name = "find user by id")
})
public class User implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userId")
	private Integer userId;
	@Basic(optional = false)
    @Column(name = "name")
	private String name;
	@Basic(optional = false)
    @Column(name = "password")
	private String password;

	public User()
	{
	}

	public User(Integer userId)
	{
		this.userId = userId;
	}

	public User(Integer userId, String name, String password)
	{
		this.userId = userId;
		this.name = name;
		this.password = password;
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (userId != null ? userId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof User))
		{
			return false;
		}
		User other = (User) object;
		if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId)))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "jpa.User[ userId=" + userId + " ]";
	}
	
}
