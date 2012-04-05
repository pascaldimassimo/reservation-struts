package com.javisto.struts.reservation.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.javisto.struts.reservation.form.ConfirmationForm;
import com.javisto.struts.reservation.model.ReservationDAO;

public class ConfirmationAction extends Action
{
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        ServletContext context = getServlet().getServletContext();
        WebApplicationContext webAppCtx = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        ReservationDAO dao = webAppCtx.getBean(ReservationDAO.class);
        
        ConfirmationForm confirmationForm = (ConfirmationForm) form;
        dao.confirm(confirmationForm.getAppointmentId());
        
        return mapping.findForward("confirmed");
    }
}
