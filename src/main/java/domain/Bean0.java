package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bean0")
public class Bean0 {
	
	
	
    @Id
    @GeneratedValue
    private long id;
	private String code;
	private String name;
	
	
	/**
	 * 
	 * @return
	 */
	public String getCode() {
		return code;
	}

	
	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
}
