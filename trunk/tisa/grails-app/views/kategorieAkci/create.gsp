

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.kategorieAkci.create"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.kategorieAkci.create"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${kategorieAkci}">
            <div class="errors">
                <g:renderErrors bean="${kategorieAkci}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Název:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:kategorieAkci,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:kategorieAkci,field:'nazev')}"/>
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
