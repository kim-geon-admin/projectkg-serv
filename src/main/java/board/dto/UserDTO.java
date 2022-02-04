package board.dto;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDTO {
	private String user_id;
    private String user_name;
    private String password;
	
//	  public int getId() { return id; } public void setId(int id) { this.id = id; }
//	  public String getUsername() { return username; } public void
//	  setUsername(String username) { this.username = username; } public String
//	  getPassword() { return password; } public void setPassword(String password) {
//	  this.password = password; }
	 
}	