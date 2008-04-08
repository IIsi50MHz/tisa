<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.uzivatel.create"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.user.registration"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${uzivatel}">
            <div class="errors">
                <g:renderErrors bean="${uzivatel}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cele_jmeno">Vaše jméno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'cele_jmeno','errors')}">
                                    <input type="text" id="cele_jmeno" name="cele_jmeno" value="${fieldValue(bean:uzivatel,field:'cele_jmeno')}"/>
                                </td>
                            </tr> 
                        
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
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'heslo','errors')}">
                                    <input type="password" maxlength="30" id="heslo" name="heslo" value="${fieldValue(bean:uzivatel,field:'heslo')}"/>
                                </td>
                            </tr> 
                                               
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="telefon">Telefon:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'telefon','errors')}">
                                    <input type="text" id="telefon" name="telefon" value="${fieldValue(bean:uzivatel,field:'telefon')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="adresa">Adresa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'adresa','errors')}">
                                    <input type="text" id="adresa" name="adresa" value="${fieldValue(bean:uzivatel,field:'adresa')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="<g:message code="tisa.user.confirm_registration"/>" /></span>
                    
                </div>
            </g:form>
        </div>
    </body>
</html>
