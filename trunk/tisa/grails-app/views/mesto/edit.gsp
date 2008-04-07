

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.mesto.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.mesto.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${mesto}">
            <div class="errors">
                <g:renderErrors bean="${mesto}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${mesto?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="jmeno">Jmeno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:mesto,field:'jmeno','errors')}">
                                    <input type="text" id="jmeno" name="jmeno" value="${fieldValue(bean:mesto,field:'jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="mapa">Mapa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:mesto,field:'mapa','errors')}">
                                    <input type="text" id="mapa" name="mapa" value="${fieldValue(bean:mesto,field:'mapa')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="popis">Popis:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:mesto,field:'popis','errors')}">
                                    <input type="text" id="popis" name="popis" value="${fieldValue(bean:mesto,field:'popis')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.update')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
