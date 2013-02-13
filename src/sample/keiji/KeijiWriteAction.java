package sample.keiji;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class KeijiWriteAction extends Action {


	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {

		KeijiWriteForm kform = (KeijiWriteForm)form;

		try{
			MyDBAccess db = new MyDBAccess();
			db.open();
			//フォームに入力された値をDBに保存
			db.execute("INSERT INTO USER VALUES (\"" + kform.getUsername()+"\",\""+ kform.getEmail() + "\",\"" + kform.getTitle() + "\",\"" + kform.getMsg() + "\")");

			db.close();
		}catch(Exception e){

		}

		return mapping.findForward("success");
	}
}
