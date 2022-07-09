<%-- 
    Document   : login
    Created on : Jun 22, 2022, 12:01:59 AM
    Author     : dttnb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="Stylesheet" href="Content/bootstrap.css" type="text/css">
        <link rel="Stylesheet" href="Content/bootstrap.min.css" type="text/css">
        <link rel="Stylesheet" href="Content/bootstrap-theme.min.css" type="text/css">
        <link rel="Stylesheet" href="JavaScript/jquery.css" type="text/css">
        <link rel="Stylesheet" href="JavaScript/jquery-ui.css" type="text/css">
        <link rel="Stylesheet" href="JavaScript/jquery.alerts.css" type="text/css">
    </head>
    <body>
              <form action="login" method="POST">
<div>
<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="">
<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="">
<input type="hidden" name="__LASTFOCUS" id="__LASTFOCUS" value="">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUKLTY3OTU5Mzc4OQ9kFgJmD2QWAgIDD2QWBgIBDxYCHgdWaXNpYmxlaGQCAw8PFgIeBFRleHQFEjxiPlRyYW5nIGNo4bunPC9iPmRkAgUPZBYCAgEPEGRkFgFmZBgBBR5fX0NvbnRyb2xzUmVxdWlyZVBvc3RCYWNrS2V5X18WAQUdY3RsMDAkbWFpbkNvbnRlbnQkY2hrUmVtZW1iZXKPkE2U9dWV9G/qWWTQwNnhLby5TDeO1LQHmYFb7nQoHA==">
</div>

<script type="text/javascript">
//<![CDATA[
var theForm = document.forms['aspnetForm'];
if (!theForm) {
    theForm = document.aspnetForm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
</script>


<div>

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="E8BFBE2E">
	<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAAw7wX0nKIr5yqEU7e28rLslsqMpMw/WBMjFKMWzvNIrzL+vpkTapkHJvNOQ5VkKEg4nLFZdrVceVHxjosrZ799agvSls0O5x3ASqCk3pzhXBB5Ek7MDSou1VqduZjj3ixVfK58D2nozb/xYZ94Chz7l67csnnxfeHvSkDnTljS2Ob81lSys6kqIZPzn80+sbSIPYtJYvNkxRovMxtsmMccVLhMErShmc5HA0hSPleKR3+EzpcgeFj+ByKH5vmmoycicij8bnVqozrKoJfexI4GlyVXawtx7dx7XKiauqpygAw==">
</div>
  
            
    <div class="container">

      
              <center>
          <fieldset>
		  <legend><b> Login</b></legend>
		  <table>
		  <tbody>
		      <tr>
		  <td>Tên đăng nhập:</td>
			  <td>
            <input name="ctl00$mainContent$txtUser" type="text" id="ctl00_mainContent_txtUser" class="input-block-level" placeholder="Tên đăng nhập"></td>
			</tr>
			<tr>
			  <td>Mật khẩu:</td>
			  <td>
        <input name="ctl00$mainContent$txtPass" type="password" id="ctl00_mainContent_txtPass" class="input-block-level" placeholder="Mật khẩu"></td>
			</tr>
			
			<tr>
			      <td></td>
			  <td>
        <input type="submit" name="ctl00$mainContent$btLogin" value="Đăng nhập" id="ctl00_mainContent_btLogin">              
         <input name="ctl00$mainContent$chkRemember" type="checkbox" id="ctl00_mainContent_chkRemember">Nhớ mật khẩu</td>
			</tr><tr>
				<td colspan="2">
        <span id="ctl00_mainContent_lblError" style="color:Red;"></span>
                   </td>
			</tr>	
			</tbody></table>
		  </fieldset>
         
        </center>
      
    </div>

        </div></form>
    </body>
</html>
