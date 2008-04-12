<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rezervace.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rezervace.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${rezervace.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Akce:</td>
                            
                            <td valign="top" class="value"><g:link controller="akce" action="show" id="${rezervace?.akce?.id}">${rezervace?.akce?.nazev}</g:link></td>
                            
                        </tr>
                        
                        <tr class="prop">
                            <td valign="top" class="name">Uzivatel:</td>
                            
                            <td valign="top" class="value"><g:link controller="uzivatel" action="show" id="${rezervace?.uzivatel?.id}">${rezervace?.uzivatel?.cele_jmeno}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Mista:</td>
                            
                            <td valign="top" class="value">${rezervace.mista}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Rezervovano:</td>
                            
                            <td valign="top" class="value">${rezervace.rezervovano}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Prodano:</td>
                            
                            <td valign="top" class="value"><g:message code="tisa.user.allrights.${rezervace.prodano}" /></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${rezervace?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code:'tisa.edit')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
