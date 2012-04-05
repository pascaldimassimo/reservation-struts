package com.javisto.struts.reservation.model;

import java.util.Date;

/**
 * TODO is it completely immutable?
 */
public class Appointment
{
    private final long id;

    private final Date timestamp;

    private final long doctorId;

    public Appointment(long id, Date timestamp, long doctorId)
    {
        this.id = id;
        this.timestamp = timestamp;
        this.doctorId = doctorId;
    }

    public long getId()
    {
        return id;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public long getDoctorId()
    {
        return doctorId;
    }

    @Override
    public String toString()
    {
        return "Appointment [id=" + id + ", timestamp=" + timestamp + ", doctorId=" + doctorId + "]";
    }
}
