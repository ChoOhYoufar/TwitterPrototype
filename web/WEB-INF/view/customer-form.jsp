<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: cho.oh
  Date: 西暦17/07/04
  Time: 午前11:35
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Save Customer</title>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>

    <div id="container">
        <h3>Save Customer</h3>
        <form:form action="saveCustomer" modelAttribute="customer" method="POST">
            <table>
                <tbody>
                    <tr>
                        <td><label>First name:</label></td>
                        <td><form:input path="firstName" /></td>
                    </tr>

                    <tr>
                        <td><label>Last name:</label></td>
                        <td><form:input path="lastName" /></td>
                    </tr>

                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email" /></td>
                    </tr>

                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save" /></td>
                    </tr>

                </tbody>
            </table>
        </form:form>

        <div style="clear; both;"></div>

        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
        </p>

    </div>
</body>
</html>
