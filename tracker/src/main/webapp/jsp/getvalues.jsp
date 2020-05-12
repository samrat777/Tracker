<%@page import="com.ss.tracker.entity.IssueTracker"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Tracker</title>
</head>
<body>
	        <form action="saveData">
        <div align="center">
        <fieldset>
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Project Tracker Information</h2></td>
                </tr>
             
                  <tr>
                    <td>Clientname:</td>
                 <td>  <select id="text" name="Clientname">
				<option value="indosat">Indosat</option>
				<option value="starhub">Starhub</option>
				<option value="dtac">Dtac</option>
				<option value="omantel">Omantel</option>
				<option value="batelco">Batelco</option>
			</select>
			      
                </tr>
               <tr>
                    <td>id:</td>
                    <td><input type="text" name="id"></td>
                </tr>               
                 <tr>
                    <td>Componentname:</td>
                    <td><input type="text" name="componentname"></td>
                </tr>
                 <tr>
                    <td>Time:</td>
                    <td><input type="text" name="Time" ></td>
                </tr>
                 <tr>
                    <td>ServiceImpacted:</td>
                    <td><input type="text" name="ServiceImpacted" ></td>
                </tr>
                 <tr>
                    <td>ServerLogDetails:</td>
                    <td><input type="text" name="ServerLogDetails" ></td>
                </tr>
                <tr>
                    <td>OperationImpact:</td>
                    <td><input type="text" name="OperationImpact" ></td>
                </tr>
                <tr>
                    <td>CommercialImpact:</td>
                    <td><input type="text" name="CommercialImpact" ></td>
                </tr>
                <tr>
                    <td>E-RootCauseAnalysis:</td>
                    <td><input type="text" name="RootCauseAnalysis" ></td>
                </tr>
                <tr>
                    <td>Resolution:</td>
                    <td><input type="text" name="Resolution" ></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save" /></td>
                </tr>
            </table>
            </fieldset>
             </div>
        </form>
        
                                                                <!-- Get All Issues Information  -->
                                                                
	<%--   <%
       List<IssueTracker> list= (List<IssueTracker>)request.getAttribute("getList");
        for(IssueTracker ist: list){
        %>
        <p>
        id : <% out.print(ist.getId()); %>
        Clientname : <% out.print(ist.getClientname()); %>
        Properties : <% out.print(ist.getProperties()); %>
        componentname : <% out.print(ist.getComponentname()); %>
        Time : <% out.print(ist.getTime()); %>
        ServiceImpacted : <% out.print(ist.getServiceImpacted()); %>
        ServerLogDetails : <% out.print(ist.getServerLogDetails()); %>
        OperationImpact : <% out.print(ist.getOperationImpact()); %>
        CommercialImpact : <% out.print(ist.getCommercialImpact()); %>
        RootCauseAnalysis : <% out.print(ist.getRootCauseAnalysis()); %>
        Resolution : <% out.print(ist.getResolution()); %>
        </p>
        <%}%>  --%>

<!-- <form action="getByName">
<fieldset>
<legend>  Search </legend>
 ClientName:<select id="text" name="Clientname">
				<option value="indosat">Indosat</option>
				<option value="starhub">Starhub</option>
				<option value="dtac">Dtac</option>
				<option value="omantel">Omantel</option>
				<option value="batelco">Batelco</option>
			</select> <br>
			<input type = "submit" name ="Search">
			</fieldset>
</form> -->

</body>
</html>