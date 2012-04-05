<%@taglib uri="/tags/struts-bean" prefix="bean"%>
<%@taglib uri="/tags/struts-html" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Please confirm reservation</title>
</head>
<body>
	Next Reservation available:

	<bean:write name="reservationForm" property="date"
		format="yyyy-MM-dd HH:mm" />

	Please confirm.
	<!-- TODO can I skip setting the name and type? -->
	<form:form name="reservationForm"
		type="com.javisto.struts.reservation.form.ReservationForm"
		action="confirm.do">
		<form:hidden property="appointmentId" />
		<form:submit value="Confirm" />
	</form:form>

</body>
</html>