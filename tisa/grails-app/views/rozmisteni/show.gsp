<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rozmisteni.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rozmisteni.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${rozmisteni.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Název:</td>
                            
                            <td valign="top" class="value">${rozmisteni.nazev}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Plán sálu:</td>
                            
                            <td valign="top" class="value">${rozmisteni.plan_salu}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Místo:</td>
                            
                            <td valign="top" class="value"><g:link controller="misto" action="show" id="${rozmisteni?.misto?.id}">${rozmisteni?.misto}</g:link></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${rozmisteni?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code:'tisa.edit')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
