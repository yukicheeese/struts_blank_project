package sample.keiji;
import org.apache.struts.action.ActionForm;

public class KeijiWriteForm extends ActionForm{
	private String username, email, title, msg;

	public void setUsername(String val){
		username = val;
	}
	public String getUsername(){
		return username;
	}

	public void setEmail(String val){
		email = val;
	}
	public String getEmail(){
		return email;
	}

	public void setTitle(String val){
		title = val;
	}
	public String getTitle(){
		return title;
	}

	public void setMsg(String val){
		msg = val;
	}
	public String getMsg(){
		return msg;
	}

}