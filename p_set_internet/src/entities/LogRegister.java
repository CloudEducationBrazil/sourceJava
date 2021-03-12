package entities;

import java.util.Date;

public class LogRegister implements Comparable<LogRegister> {
	private String username;
	private Date moment; // Padrão ISO 8601

	public LogRegister() {
	}

	public LogRegister(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogRegister other = (LogRegister) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public int compareTo(LogRegister other) {
		
		return username.toUpperCase().compareTo(other.getusername().toUpperCase());
	}

	@Override
	public String toString() {
		return "LogRegister [username=" + username + ", moment=" + moment + "]";
	}
}