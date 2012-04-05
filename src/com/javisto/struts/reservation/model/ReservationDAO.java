package com.javisto.struts.reservation.model;

import java.util.Date;

public interface ReservationDAO
{
    static final Appointment BLANK_APPOINTMENT = new Appointment(0, new Date(), 0);

    /**
     * Reserve next appointment available for user.
     * 
     * The user will still have to confirm the reservation.
     * 
     * If no more appointment is available, return BLANK_APPOINTMENT.
     * 
     * @param email
     *            user's email
     * @return next appointment or BLANK_APPOINTMENT
     */
    Appointment reserveNextAppointment(String email);

    /**
     * Confirm the reservation.
     * 
     * @param appointmentId
     */
    void confirm(long appointmentId);
}
