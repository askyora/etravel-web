package com.yd.etravel.domain.user.role;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.yd.etravel.domain.common.BaseObject;

@Entity
@Table(name = "T_ROLE")
public class Role extends BaseObject {

    @ManyToMany
    private List<Function> function;

    public Role(String name) {
	super(name);
    }

    public Role() {
	super();
    }

    @Column(unique = true, nullable = true)
    public String getName() {
	return super.getName();
    }

    public void setName(String name) {
	super.setName(name);
    }

    public List<Function> getFunction() {
	return function;
    }

    public void setFunction(List<Function> function) {
	this.function = function;
    }

    public boolean hasFunction(String key) {
	return this.function.contains(new Function(key));
    }

    public boolean hasFunctionId(Long key) {
	for (Function function : getFunction()) {
	    if (function.getId() == key)
		return true;
	}
	return false;
    }

    public Set<String> getFunctionNames() {
	Set<String> set = new HashSet<String>();
	for (Function function : getFunction()) {
	    set.add(function.getKey());
	}
	return set;
    }

}