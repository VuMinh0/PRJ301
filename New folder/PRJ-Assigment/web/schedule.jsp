<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="helper.TimeHelper" %>
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
        <c:if test="${sessionScope.role == 'STUDENT'}">
            <h1 class="text-center">
                STUDENT SCHEDULE
            </h1>
        </c:if>
        <c:if test="${sessionScope.role == 'LECTURER'}">
            <h1 class="text-center">
                LECTURER SCHEDULE
            </h1>
        </c:if>
        <div class="container" style="padding-top:5rem; padding-bottom:5rem">
            <table>
                <thead>
                    <tr>
                        <th rowspan="2">
                            <div>
                                <form id="dateFilterForm" action="schedule" method="POST">
                                    <div>
                                        <span class="auto-style1"><strong>Year</strong></span>
                                        <select name="ctl00$mainContent$drpYear" id="ctl00_mainContent_drpYear">
                                            <c:forEach var="i" begin="${thisYear-3}" end="${thisYear+1}">
                                                <option value="${i}" ${i==thisChooseYear?'selected="selected"':''}>${i}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div>
                                        Week
                                        <select name="ctl00$mainContent$drpSelectWeek" id="ctl00_mainContent_drpSelectWeek">
                                            <c:forEach var="i" items="${allWeek}">
                                                <option value="${i['key']}" ${i['key']==thisWeek?'selected="selected"':''}>${i['value']}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </form>
                            </div>
                        </th>
                        <th align="center">Mon</th>
                        <th align="center">Tue</th>
                        <th align="center">Wed</th>
                        <th align="center">Thu</th>
                        <th align="center">Fri</th>
                        <th align="center">Sat</th>
                        <th align="center">Sun</th>
                    </tr>
                    <tr>
                        <c:forEach var="i" items="${listWeekWithDate}">
                            <th align="center">${i['value']}</th>
                            </c:forEach>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="i" items="${slots}">
                        <tr>
                            <td>
                                <div class="cell">
                                    Slot ${i.slot} 
                                </div>
                            </td>
                            <c:forEach var="k" items="${listWeekWithDate}">
                                <td>
                                    <c:forEach var="j" items="${studentClassList}">
                                        <c:if test="${j.slot.id == i.slot && j.attendance.day == k['value']}">
                                            <div class="cell">
                                                <a>${j.subject.shortName}-</a><a class="label label-warning" href="#">View Materials</a>
                                                <br> at ${j.building} <a> </a>
                                                <a class="label label-primary" href="#">-EduNext </a>
                                                <br>
                                                <c:if test="${j.attendance.attendanceStatus == 1}">
                                                    (<font color="red">Not yet</font>)
                                                </c:if>
                                                <c:if test="${j.attendance.attendanceStatus == 2}">
                                                    (<font color="green">Attended</font>)
                                                </c:if>
                                                <c:if test="${j.attendance.attendanceStatus == 3}">
                                                    (<font color="red">Absent</font>)
                                                </c:if>
                                                <br>
                                                <span class="label label-success">(${j.slot.startTime}-${j.slot.endTime})</span>
                                            </div>
                                        </c:if>
                                    </c:forEach>
                                </td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </body>
    <script src="../Assets/Javascript/schedule.js"></script>
</html>
