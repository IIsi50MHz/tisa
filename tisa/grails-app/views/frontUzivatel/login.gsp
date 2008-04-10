<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.uzivatel.login"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.uzivatel.login"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${front_end}">
            <div class="errors">
                <g:renderErrors bean="${front_end}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="login" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">E-mail:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:uzivatel,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo">Heslo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatele,field:'heslo','errors')}">
                                    <input type="password" id="heslo" name="heslo" value="${fieldValue(bean:uzivatel,field:'heslo')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="Přihlásit" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
