package com.javisto.struts.reservation.form;

import org.apache.struts.action.ActionForm;

public class ConfirmationForm extends ActionForm
{
    private static final long serialVersionUID = 122777209919181786L;

    private long              appointmentId;

    public long getAppointmentId()
    {
        return appointmentId;
    }

    public void setAppointmentId(long appointmentId)
    {
        this.appointmentId = appointmentId;
    }
}
