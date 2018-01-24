<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" action="/bmfinal/multiply" modelAttribute="Numbers">
             <table>
                <tr>
                    <td><form:label path="number1">Number1</form:label></td>
                    <td><form:input path="number1"/></td>
                </tr>
                <tr>
                    <td><form:label path="number2">Number2</form:label></td>
                    <td><form:input path="number2"/></td>
                </tr>

                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
                
                 <tr>
                    <td><form:label path="result">Result</form:label></td>
                    <td><form:input path="result"/></td>
                </tr>
            </table>
        </form:form>
        ${error}
    </body>
</html>