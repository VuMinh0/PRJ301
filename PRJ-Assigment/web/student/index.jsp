<%-- 
    Document   : index
    Created on : Jun 22, 2022, 7:45:42 AM
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
        <div class="container" style="padding-top:5rem; padding-bottom:5rem">
  <table>
   <thead>
      <tr>
         <th rowspan="2">
           <div>
             <div>
                 <span class="auto-style1"><strong>Year</strong></span>
                 <select name="ctl00$mainContent$drpYear" onchange="javascript:setTimeout('__doPostBack(\'ctl00$mainContent$drpYear\',\'\')', 0)" id="ctl00_mainContent_drpYear">
                   <option value="2019">2019</option>
                   <option value="2020">2020</option>
                   <option value="2021">2021</option>
                   <option selected="selected" value="2022">2022</option>
                   <option value="2023">2023</option>
                 </select>
             </div>
             <div>
              Week
              <select name="ctl00$mainContent$drpSelectWeek" onchange="javascript:setTimeout('__doPostBack(\'ctl00$mainContent$drpSelectWeek\',\'\')', 0)" id="ctl00_mainContent_drpSelectWeek">
                 <option value="1">03/01 To 09/01</option>
                 <option value="2">10/01 To 16/01</option>
                 <option value="3">17/01 To 23/01</option>
                 <option value="4">24/01 To 30/01</option>
                 <option value="5">31/01 To 06/02</option>
                 <option value="6">07/02 To 13/02</option>
                 <option value="7">14/02 To 20/02</option>
                 <option value="8">21/02 To 27/02</option>
                 <option value="9">28/02 To 06/03</option>
                 <option value="10">07/03 To 13/03</option>
                 <option value="11">14/03 To 20/03</option>
                 <option value="12">21/03 To 27/03</option>
                 <option value="13">28/03 To 03/04</option>
                 <option value="14">04/04 To 10/04</option>
                 <option value="15">11/04 To 17/04</option>
                 <option value="16">18/04 To 24/04</option>
                 <option value="17">25/04 To 01/05</option>
                 <option value="18">02/05 To 08/05</option>
                 <option value="19">09/05 To 15/05</option>
                 <option value="20">16/05 To 22/05</option>
                 <option value="21">23/05 To 29/05</option>
                 <option value="22">30/05 To 05/06</option>
                 <option value="23">06/06 To 12/06</option>
                 <option selected="selected" value="24">13/06 To 19/06</option>
                 <option value="25">20/06 To 26/06</option>
                 <option value="26">27/06 To 03/07</option>
                 <option value="27">04/07 To 10/07</option>
                 <option value="28">11/07 To 17/07</option>
                 <option value="29">18/07 To 24/07</option>
                 <option value="30">25/07 To 31/07</option>
                 <option value="31">01/08 To 07/08</option>
                 <option value="32">08/08 To 14/08</option>
                 <option value="33">15/08 To 21/08</option>
                 <option value="34">22/08 To 28/08</option>
                 <option value="35">29/08 To 04/09</option>
                 <option value="36">05/09 To 11/09</option>
                 <option value="37">12/09 To 18/09</option>
                 <option value="38">19/09 To 25/09</option>
                 <option value="39">26/09 To 02/10</option>
                 <option value="40">03/10 To 09/10</option>
                 <option value="41">10/10 To 16/10</option>
                 <option value="42">17/10 To 23/10</option>
                 <option value="43">24/10 To 30/10</option>
                 <option value="44">31/10 To 06/11</option>
                 <option value="45">07/11 To 13/11</option>
                 <option value="46">14/11 To 20/11</option>
                 <option value="47">21/11 To 27/11</option>
                 <option value="48">28/11 To 04/12</option>
                 <option value="49">05/12 To 11/12</option>
                 <option value="50">12/12 To 18/12</option>
                 <option value="51">19/12 To 25/12</option>
                 <option value="52">26/12 To 01/01</option>
              </select>
             </div>
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
         <th align="center">13/06</th>
         <th align="center">14/06</th>
         <th align="center">15/06</th>
         <th align="center">16/06</th>
         <th align="center">17/06</th>
         <th align="center">18/06</th>
         <th align="center">19/06</th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>Slot 1 </td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=922434">SWD392-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=XfkfEl1rYW3%2bJ2hWcAslTw%3d%3d&amp;SessionNo=kIpDEdUxtpjrvnJByUa6DA%3d%3d" target="_blank">View Materials</a><br> at DE-C310 <a> </a><a class="label label-primary" href="https://fu.edunext.vn?CampusCode=APHL&amp;subjectCode=SWD392&amp;semester=Summer2022&amp;ClassName=SE1507-NET&amp;SessionN0=16">-EduNext </a><br>(<font color="Green">attended</font>)<br><span class="label label-success">(7:30-9:00)</span><br></td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=924054">PRU211m-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=83bRrCwi%2f12JI1i8vLvPcA%3d%3d&amp;SessionNo=kIpDEdUxtpjrvnJByUa6DA%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/xub-uapb-tbo" target="_blank">Meet URL</a><a> <br>(<font color="red">Not yet</font>)<br></a></td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=922444">SWD392-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=XfkfEl1rYW3%2bJ2hWcAslTw%3d%3d&amp;SessionNo=newYZN3qFQ03aWiXQF8XRQ%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/zij-pytu-zhf" target="_blank">Meet URL</a><a> </a><a class="label label-primary" href="https://fu.edunext.vn?CampusCode=APHL&amp;subjectCode=SWD392&amp;semester=Summer2022&amp;ClassName=SE1507-NET&amp;SessionN0=17">-EduNext </a><br>(<font color="red">Not yet</font>)<br></td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=924074">PRU211m-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=83bRrCwi%2f12JI1i8vLvPcA%3d%3d&amp;SessionNo=yZZBT4vgbimNawN8%2fLK0Mw%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/xub-uapb-tbo" target="_blank">Meet URL</a><a> <br>(<font color="red">Not yet</font>)<br></a></td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=922454">SWD392-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=XfkfEl1rYW3%2bJ2hWcAslTw%3d%3d&amp;SessionNo=yZZBT4vgbimNawN8%2fLK0Mw%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/zij-pytu-zhf" target="_blank">Meet URL</a><a> </a><a class="label label-primary" href="https://fu.edunext.vn?CampusCode=APHL&amp;subjectCode=SWD392&amp;semester=Summer2022&amp;ClassName=SE1507-NET&amp;SessionN0=18">-EduNext </a><br>(<font color="red">Not yet</font>)<br></td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 2 </td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=923034">PRN221-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=ws6x%2bh%2fPwun1IUXYhSYtiA%3d%3d&amp;SessionNo=kIpDEdUxtpjrvnJByUa6DA%3d%3d" target="_blank">View Materials</a><br> at DE-C310 <a> </a><a class="label label-primary" href="https://fu.edunext.vn?CampusCode=APHL&amp;subjectCode=PRN221&amp;semester=Summer2022&amp;ClassName=SE1507-NET&amp;SessionN0=16">-EduNext </a><br>(<font color="Green">attended</font>)<br><span class="label label-success">(9:10-10:40)</span><br></td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=924064">PRU211m-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=83bRrCwi%2f12JI1i8vLvPcA%3d%3d&amp;SessionNo=newYZN3qFQ03aWiXQF8XRQ%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/xub-uapb-tbo" target="_blank">Meet URL</a><a> <br>(<font color="red">Not yet</font>)<br></a></td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=923044">PRN221-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=ws6x%2bh%2fPwun1IUXYhSYtiA%3d%3d&amp;SessionNo=newYZN3qFQ03aWiXQF8XRQ%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/vru-dvjn-ysk" target="_blank">Meet URL</a><a> </a><a class="label label-primary" href="https://fu.edunext.vn?CampusCode=APHL&amp;subjectCode=PRN221&amp;semester=Summer2022&amp;ClassName=SE1507-NET&amp;SessionN0=17">-EduNext </a><br>(<font color="red">Not yet</font>)<br></td>
         <td>-</td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=923054">PRN221-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=ws6x%2bh%2fPwun1IUXYhSYtiA%3d%3d&amp;SessionNo=yZZBT4vgbimNawN8%2fLK0Mw%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/vru-dvjn-ysk" target="_blank">Meet URL</a><a> </a><a class="label label-primary" href="https://fu.edunext.vn?CampusCode=APHL&amp;subjectCode=PRN221&amp;semester=Summer2022&amp;ClassName=SE1507-NET&amp;SessionN0=18">-EduNext </a><br>(<font color="red">Not yet</font>)<br></td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 3 </td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=923514">PRM392-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=K%2btqEEAO0OVd6pVpwO3prA%3d%3d&amp;SessionNo=kIpDEdUxtpjrvnJByUa6DA%3d%3d" target="_blank">View Materials</a><br> at DE-C310 <a> <br>(<font color="Green">attended</font>)<br><span class="label label-success">(10:50-12:20)</span><br></a></td>
         <td>-</td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=923524">PRM392-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=K%2btqEEAO0OVd6pVpwO3prA%3d%3d&amp;SessionNo=newYZN3qFQ03aWiXQF8XRQ%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/suo-jttt-xxu" target="_blank">Meet URL</a><a> <br>(<font color="red">Not yet</font>)<br></a></td>
         <td>-</td>
         <td><a href="../Schedule/ActivityDetail.aspx?id=923534">PRM392-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=K%2btqEEAO0OVd6pVpwO3prA%3d%3d&amp;SessionNo=yZZBT4vgbimNawN8%2fLK0Mw%3d%3d" target="_blank">View Materials</a><br> at DE-C310 - <a class="label label-default" href="https://meet.google.com/suo-jttt-xxu" target="_blank">Meet URL</a><a> <br>(<font color="red">Not yet</font>)<br></a></td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 4 </td>
         <td>
            <a href="../Schedule/ActivityDetail.aspx?id=925176">ENW492c-</a><a class="label label-warning" href="http://flm.fpt.edu.vn/gui/role/guest/ListScheduleSyllabus?subjectCode=rtmlPKtcIJpCjcQBarGPSg%3d%3d&amp;SessionNo=VdF9zrq%2bg8qFJrK2mtWogw%3d%3d" target="_blank">View Materials</a><br> at AL-L202 
            <a>
               <br>(<font color="Red">absent</font>)<br><span class="label label-success">(12:50-14:20)</span><br>
               <div class="online-indicator"><span class="blink"></span></div>
            </a>
         </td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 5 </td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 6 </td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 7 </td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
      </tr>
      <tr>
         <td>Slot 8 </td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
         <td>-</td>
      </tr>
   </tbody>
  </table>
</div>

    </body>
</html>