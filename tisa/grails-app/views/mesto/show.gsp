

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.mesto.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.mesto.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${mesto.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Jméno:</td>
                            
                            <td valign="top" class="value">${mesto.jmeno}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Mapa:</td>
                            
                            <td valign="top" class="value">${mesto.mapa}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Popis:</td>
                            
                            <td valign="top" class="value">${mesto.popis}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Místa:</td>
                            
                            <td  valign="top" style="text-align:left;" class="value">
                                <ul>
                                <g:each var="a" in="${mesto.misto}">
                                    <li><g:link controller="misto" action="show" id="${a.id}">${a.nazev}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${mesto?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code:'tisa.edit')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
