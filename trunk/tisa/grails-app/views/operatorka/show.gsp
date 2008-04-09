<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.operatorka.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.operatorka.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${operatorka.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Vsechnymista:</td>
                            
                            <td valign="top" class="value"><g:message code="tisa.user.allrights.${operatorka.vsechny_mista}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Celejmeno:</td>
                            
                            <td valign="top" class="value">${operatorka.cele_jmeno}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Email:</td>
                            
                            <td valign="top" class="value">${operatorka.email}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Telefon:</td>
                            
                            <td valign="top" class="value">${operatorka.telefon}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Adresa:</td>
                            
                            <td valign="top" class="value">${operatorka.adresa}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${operatorka?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="${message(code:'tisa.edit')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
