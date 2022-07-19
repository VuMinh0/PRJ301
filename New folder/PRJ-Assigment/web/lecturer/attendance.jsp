<%-- 
    Document   : attendance
    Created on : Jul 19, 2022, 4:19:28 PM
    Author     : dttnb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="Stylesheet" href="https://fap.fpt.edu.vn/fu.css" type="text/css">
    </head>
    <body>
        <div id="ctl00_mainContent_divStudents" class="container">
            <table class="sortable" id="id" summary="Student list">
                <caption>... then see student list (<a href="Groups.aspx?group=24054&amp;export=1">Export data</a>)</caption>
                <thead>
                    <tr>
                        <th>Index</th>
                        <th>Code</th>
                        <th>Full name</th>
                        <th>Attended</th>
                        <th>Absent</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>HE141428</td>
                        <td><a href="../User/StudentDetails.aspx?rollNumber=HE141428">MinhNPBHE141428</a></td>
                        <td><input type="radio" name="ad1" value="adten" /></td>
                        <td><input type="radio" name="ad1" value="adten" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Save" style="float:right;" />
        </div>
    </body>
</html>
