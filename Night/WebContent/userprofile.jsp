
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.Map,java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Insert title here</title>
<%
List<Map> formdetails=(List<Map>)request.getAttribute("personidtimesheet");
System.out.println(formdetails);
Map guarddetails= (Map)request.getAttribute("personid");
%>

<script>
function validateForm() {
	  var x = document.forms["myform"]["personid"].value;
	  if (x != <%=guarddetails.get("gid") %>) {
	    alert(" please enter the correct id ");
	    return false;
	  }
	}
	
	




</script>
</head>
<body>
	<div class="container-fluid">

		<div class="row">
			<div class="col-sm-6" style="background-color: lavender;">
				<div class="card">
					<div class="card-body">
						<div class="row">
							<div class="col-md-12">
								<h4>Welcome Officer</h4>
								<hr>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<form>
									<div class="form-group row">
										<label for="username" class="col-4 col-form-label">ID</label>
										<div class="col-8">
											<label><%=guarddetails.get("gid") %></label>
										</div>
									</div>
									<div class="form-group row">
										<label for="name" class="col-4 col-form-label">First
											Name</label>
										<div class="col-8">
											<label><%=guarddetails.get("fname")%></label>
										</div>
									</div>
									<div class="form-group row">
										<label for="lastname" class="col-4 col-form-label">Last
											Name</label>
										<div class="col-8">
											<label> <%=guarddetails.get("lname")%> </label>
										</div>
									</div>
									<div class="form-group row">
										<label for="text" class="col-4 col-form-label">Designation</label>
										<div class="col-8">
											<label> <%=guarddetails.get("desig")%> </label>
										</div>
									</div>

									<div class="form-group row">
										<label for="email" class="col-4 col-form-label">Contact</label>
										<div class="col-8">
											<label><%=guarddetails.get("mobile")%></label>
										</div>
									</div>
									<div class="form-group row">
										<label for="website" class="col-4 col-form-label">Manager</label>
										<div class="col-8">
											<label><%=guarddetails.get("manager")%></label>
										</div>
									</div>
								</form>
							</div>
						</div>

					</div>
				</div>
			</div>
		


	

	<div class="col-sm-6" style="background-color: lavenderblush;">	<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-10">
		                    <form name="myform" action="TimesheetController" onsubmit="return validateForm()" method="post">
		                    <div class="form-group row">
                                <label for="personid" class="col-4 col-form-label">PersonID</label> 
                                <div class="col-8">
                                  <input id="personid" name="personid" class="form-control here" required="required" type="text">
                                </div>
                                <br>
                                <br>
                              <div class="form-group row">
                              <label for="date" class="col-4 col-form-label">Date</label> 
                                <div class="col-8">
                                  <input id="date" type="date" name="date" placeholder="Date" class="form-control here" required="required" type="text" max="2018-12-25" required>
                                </div>
                              </div> 
                              <br>
                              <div class="form-group row">
                                <label for="timein" class="col-4 col-form-label">Time-In</label> 
                                <div class="col-8">
                                  <input id="timein" type="time" name="timein" placeholder="Hour:Min" class="form-control here" required="required" type="text" required>
                                </div>
                              </div>
                              <br>
                              <div class="form-group row">
                                <label for="timeout" class="col-4 col-form-label">Time-Out</label> 
                                <div class="col-8">
                                  <input id="timeout" type="time" name="timeout" placeholder="Hour:Min" class="form-control here" required="required" type="text" required>
                                </div>
                                <br>
                                <br>
                                <div class="form-group row">
                                <label for="remarks" class="col-4 col-form-label">Remarks</label> 
                                <div class="col-8">
                                  <input id="remarks" name="remarks" placeholder="enter observations" class="form-control here"  type="text">
                                </div>
                                 <div class="form-group">
                               <label for="Location" class="col-4-form-label">Location</label>
                               <select class="form-control" id="location1" name="locid">
                                        <option value="1">Main Gate</option>
                                        <option value="2">Tower-1</option>
                                        <option value="3">Tower-2</option>
                                         <option value="4">Main Gate-A</option>
                                         </select>
                                        </div>
                              </div>
                              <div class="container">
                              	<input type="submit" class="btn btn-info" value="Save">
                               	<input type="submit" class="btn btn-Link" value="Search">
                                 </div>
                            </form>
		                </div>
		            </div>
		            
		        </div>
		    </div>
		</div>
	</div>
</div></div>
	</div>
	<div class="row">
		<div class="col-sm-12" style="background-color: lavender;">
			<div class="container">
				<table
					class="table table-bordered table table-hover table table-striped table table-fixed">



					<thead class="thead-dark">
						<tr>
							<th>ID</th>
							
							<th>Location</th>
							<th>Date</th>
							<th>Time- In</th>
							<th>Time-Out</th>
							<th>Remarks</th>
							<th>status</th>
						</tr>
					</thead>
					<tbody>
					<% if(formdetails!= null)for(int i=0;i< formdetails.size();i++){ 
						Map map = formdetails.get(i);
					%>
						<tr>
							<td><%= map.get("gid") %> </td>
							<td><%= map.get("locid") %></td>
							<td><%= map.get("date") %></td>
							<td><%= map.get("timein") %></td>
							<td><%= map.get("timeout") %></td>
							<td><%= map.get("remarks") %></td>
							<td><%= map.get("status") %></td>
						</tr>
						
					<%} %>
					</tbody>
				</table>
			</div>
			
			<button type="button" class="btn btn-info">Send For Approval</button>
		</div>
	</div>

	</div>
</body>
</html>