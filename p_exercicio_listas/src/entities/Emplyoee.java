package entities;

import java.io.Serializable;

public class Emplyoee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Double salary;

	public Emplyoee() {
	}

	public Emplyoee(Integer id, String name, Double salary, double percentage) {
		this.id = id;
		this.name = name;
		increaseSalary(percentage);
	}

	public Emplyoee(Integer id, String name) {
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		salary *= 1 + percentage / 100;
	}	
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);

	}
}