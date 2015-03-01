<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head> 
		<title> Edit Creator </title>  
		<style>
			.error{
			color: #ff0000;
			font-weight: bold;
			}
		</style>
	</head>
	<body>
		<div id="formsContent">
			<form:form id="editIdeatorForm" method="POST" modelAttribute="ideator" class="form-horizontal" role="form"> 
			<form:errors path="*" cssClass="error" />
				<fieldset>
			  		<legend> Personal Details</legend>
			  		
			  		<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="firstName"> 
							First Name <form:errors path="firstName" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="firstName" class="form-control" placeholder="firstName"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="middleName"> 
							Middle Name <form:errors path="middleName" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="middleName" class="form-control" placeholder="middleName"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="lastName"> 
							Last Name <form:errors path="lastName" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="lastName" class="form-control" placeholder="lastName"/>
						</div>
					</div>
					
					<div class="form-group">
						<form:label class="col-lg-2 control-label" path="sex">
							Sex
						</form:label>
						<div class="col-lg-6">
							<form:select class="form-control" path="sex">
								<form:option class="form-control" value="MALE">Male</form:option>
								<form:option class="form-control" value="FEMALE">Female</form:option>
								<form:option class="form-control" value="OTHERS">Others</form:option>
							</form:select>
						</div>
					</div>
					
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="dateOfBirth"> 
							Date of Birth <form:errors path="dateOfBirth" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="dateOfBirth" class="form-control" placeholder="dateOfBirth"/>
						</div>
					</div>

					<legend> Contact Details </legend>
					
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="address.streetAddress"> 
							Street Address <form:errors path="address.streetAddress" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="address.streetAddress" class="form-control" placeholder="address.streetAddress"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="address.postCode"> 
							Post Code <form:errors path="address.postCode" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="address.postCode" class="form-control" placeholder="address.postCode"/>
						</div>
					</div>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="address.city"> 
							City <form:errors path="address.city" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="address.city" class="form-control" placeholder="address.city"/>
						</div>
					</div>
					<div class="form-group">
						<form:label class="col-lg-2 control-label" path="address.country">
							Country
						</form:label>
						<div class="col-lg-6">
							<form:select class="form-control" path="address.country">
								<form:option class="form-control" value="UNITED_KINGDOM">United Kingdom</form:option>
								<form:option class="form-control" value="INDIA">India</form:option>
								<form:option class="form-control" value="USA">USA</form:option>
								<form:option class="form-control" value="OTHERS">Others</form:option>
							</form:select>
						</div>
					</div>
					
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="phoneNumber"> 
							Phone Number <form:errors path="phoneNumber" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="phoneNumber" class="form-control" placeholder="phoneNumber"/>
						</div>
					</div>
					
					<legend>Work Details </legend>
					
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="companyName"> 
							Company Name <form:errors path="companyName" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="companyName" class="form-control" placeholder="companyName"/>
						</div>
					</div>
					
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="website"> 
							Website <form:errors path="website" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="website" class="form-control" placeholder="website"/>
						</div>
					</div>
					
					<legend>Skills Details </legend>
					<div class="form-group error">
						<form:label class="col-lg-2 control-label" path="projects[0]"> 
							Projects <form:errors path="projects[0]" cssClass="error" />
						</form:label>
						<div class="col-lg-6">
							<form:input path="projects[0]" class="form-control" placeholder="projects[0]"/>
						</div>
					</div>
					
		  		</fieldset>
		  		<hr/>
				<p><button type="submit" class="btn btn-primary">Save</button></p>
			</form:form>
		</div>
	</body>
</html>