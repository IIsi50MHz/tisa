<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin_plain" />
        <title><g:message code="tisa.admin.login" /></title>         
    </head>
    <body>

        <div class="body">
            <h1><g:message code="tisa.admin.login" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${akce}">
            <div class="errors">
                <g:renderErrors bean="${akce}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="login" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto"><g:message code="tisa.user.email" />:</label>
                                </td>
																<td valign="top" class="value ${hasErrors(bean:spravce,field:'email','errors')}">
																		<input type="text" id="nazev" name="nazev" value="${fieldValue(bean:spravce,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email"><g:message code="tisa.user.password" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'password','errors')}">
																		<input type="text" id="nazev" name="nazev" value="${fieldValue(bean:spravce,field:'heslo')}"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input type="submit" value="<g:message code="tisa.admin.login" />" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
