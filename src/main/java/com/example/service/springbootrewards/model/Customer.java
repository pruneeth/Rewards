package com.example.service.springbootrewards.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.criteria.CriteriaBuilder.In;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@JsonIgnore
	
	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<MyTransaction> transactions;
	@JsonInclude
	@Transient
	private Long rewardPoints;
	@JsonInclude
	@Transient
	private Double totalPurchases;
	
	@JsonInclude
	@Transient
	private Map<Integer, Long> map;
	
	public Customer() {
		super();
	}
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<MyTransaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<MyTransaction> transactions) {
		this.transactions = transactions;
	}
	public Long getRewardPoints() {
		if (transactions == null || transactions.isEmpty()) return 0l;
		
		return transactions.stream().map(x -> x.getPoints().intValue()).reduce(0, (a,b) -> a + b).longValue();
	}
	public Double getTotalPurchases() {
		if (transactions == null || transactions.isEmpty()) return 0d;
		
		return transactions.stream().map(x -> x.getTotal().doubleValue()).reduce(0d, (a,b) -> a + b).doubleValue();
	}
	
	public Map<Integer, Long> getMonths() {
		if (transactions == null || transactions.isEmpty()) return null;
		else
		{
			map= new HashMap<Integer, Long>();
			for (MyTransaction obj : transactions) 
			{
				
				if(map.containsKey(obj.getSaveDate().getMonth()+1))
				{
					map.put(obj.getSaveDate().getMonth()+1, map.get(obj.getSaveDate().getMonth()+1)+obj.getPoints());
				}
				else
				{
					map.put(obj.getSaveDate().getMonth()+1, obj.getPoints());
				}
		    }
		}
		return map;
	}
	
	
}
