

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.poradatel.create"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.poradatel.create"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${poradatel}">
            <div class="errors">
                <g:renderErrors bean="${poradatel}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cele_jmeno">Celé jméno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'cele_jmeno','errors')}">
                                    <input type="text" id="cele_jmeno" name="cele_jmeno" value="${fieldValue(bean:poradatel,field:'cele_jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">E-mail:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:poradatel,field:'email')}"/>
                                </td>
                            </tr> 
                        
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="telefon">Telefon:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'telefon','errors')}">
                                    <input type="text" id="telefon" name="telefon" value="${fieldValue(bean:poradatel,field:'telefon')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="adresa">Adresa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'adresa','errors')}">
                                    <input type="text" id="adresa" name="adresa" value="${fieldValue(bean:poradatel,field:'adresa')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="<g:message code="tisa.create"/>" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
