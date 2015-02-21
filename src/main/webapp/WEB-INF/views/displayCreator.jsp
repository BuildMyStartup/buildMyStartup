<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
	<body>  
		<div id="displayCreator">
			<legend> Personal Details</legend>
			<c:out value="${creator.firstName}"/><br/>
			<c:out value="${creator.middleName}"/><br/>
			<c:out value="${creator.lastName}"/><br/>
			<c:out value="${creator.sex}"/><br/>
			<c:out value="${creator.dateOfBirth}"/><br/>
			
			<legend> Contact Details </legend>
			<c:out value="${creator.address.streetAddress}"/><br/>
			<c:out value="${creator.address.postCode}"/><br/>
			<c:out value="${creator.address.city}"/><br/>
			<c:out value="${creator.address.country}"/><br/>
			<c:out value="${creator.phoneNumber}"/><br/>
			
			<legend>Work Details </legend>
			<c:out value="${creator.companyName}"/><br/>
			<c:out value="${creator.website}"/><br/>
			
			<legend>Skills </legend>
			<c:out value="${creator.skills[0]}"/><br/>
			
			<legend>Experience </legend>
			<c:out value="${creator.experience.years}"/><br/>
			<c:out value="${creator.experience.months}"/><br/>
			
			<legend>Rate </legend>
			<c:out value="${creator.rate.amount}"/><br/>
			<c:out value="${creator.rate.currency}"/><br/>
			<c:out value="${creator.rate.frequency}"/><br/>
			
			<legend>Availability </legend>
			<c:out value="${creator.availabilityStatus}"/><br/>
			<c:out value="${creator.availabilityDate}"/><br/>
		</div>
	</body>
</html>