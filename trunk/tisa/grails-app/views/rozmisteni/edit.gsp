<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rozmisteni.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rozmisteni.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rozmisteni}">
            <div class="errors">
                <g:renderErrors bean="${rozmisteni}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${rozmisteni?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Nazev:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:rozmisteni,field:'nazev')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="plan_salu">Plansalu:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'plan_salu','errors')}">
                                    <input type="text" id="plan_salu" name="plan_salu" value="${fieldValue(bean:rozmisteni,field:'plan_salu')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto">Misto:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'misto','errors')}">
                                    <g:select optionKey="id" from="${Misto.list()}" name="misto.id" value="${rozmisteni?.misto?.id}" ></g:select>
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