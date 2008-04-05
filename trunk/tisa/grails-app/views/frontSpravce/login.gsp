<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.spravce.login"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.spravce.register"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${spravce}">
            <div class="errors">
                <g:renderErrors bean="${spravce}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">Email:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:spravce,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo">Heslo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'heslo','errors')}">
                                    <input type="text" id="heslo" name="heslo" value="${fieldValue(bean:spravce,field:'heslo')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="ok" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
