<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
	<body>  
		<div id="displayIdeator">
			<legend> Personal Details</legend>
			<c:out value="${ideator.firstName}"/><br/>
			<c:out value="${ideator.middleName}"/><br/>
			<c:out value="${ideator.lastName}"/><br/>
			<c:out value="${ideator.sex}"/><br/>
			<c:out value="${ideator.dateOfBirth}"/><br/>
			
			<legend> Contact Details </legend>
			<c:out value="${ideator.address.streetAddress}"/><br/>
			<c:out value="${ideator.address.postCode}"/><br/>
			<c:out value="${ideator.address.city}"/><br/>
			<c:out value="${ideator.address.country}"/><br/>
			<c:out value="${ideator.phoneNumber}"/><br/>
			
			<legend>Work Details </legend>
			<c:out value="${ideator.companyName}"/><br/>
			<c:out value="${ideator.website}"/><br/>
			
			<legend>Project Details </legend>
			<c:out value="${ideator.projects[0]}"/><br/>
		</div>
	</body>
</html>