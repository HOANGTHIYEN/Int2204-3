/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Admin
 */
public class student {
	private String id;
	private String name;
	private String group;
        private String email;
	
	public student() {
            
	}

	public student(String id, String name, String group, String email) {
		this.id = id;
		this.name = name;
		this.group = group;
                this.email =email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgroup() {
		return group;
	}

	public void setgroup(String group) {
		this.group = group;
	}
        
        public String getemail (){
            return email;
        }
        
        public void setemail (String email) {
            this.email = email;
        }       
}        
    