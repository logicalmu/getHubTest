package hello.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hello {
	@Id
	@GeneratedValue
	int id;

	String name;

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

	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}
	
	public Hello(){}
	
	public Hello(String name){
		this.name = name;
	}
	
	public Hello(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Hello(int id){
		this.id = id;
	}

	
}