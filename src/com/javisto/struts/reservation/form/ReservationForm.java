package com.javisto.struts.reservation.form;

import java.util.Date;

import org.apache.struts.action.ActionForm;

public class ReservationForm extends ActionForm
{
    private static final long serialVersionUID = -3351145673236229639L;

    private long              appointmentId;

    private Date              date;

    public long getAppointmentId()
    {
        return appointmentId;
    }

    public void setAppointmentId(long appointmentId)
    {
        this.appointmentId = appointmentId;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "ReservationForm [appointmentId=" + appointmentId + ", date=" + date + "]";
    }
}
