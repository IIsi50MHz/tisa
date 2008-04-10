

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.misto.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.misto.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${misto.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Nazev:</td>
                            
                            <td valign="top" class="value">${misto.nazev}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Popis:</td>
                            
                            <td valign="top" class="value">${misto.popis}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Odkazmapa:</td>
                            
                            <td valign="top" class="value">${misto.odkaz_mapa}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Mesto:</td>
                            
                            <td valign="top" class="value"><g:link controller="mesto" action="show" id="${misto?.mesto?.id}">${misto?.mesto}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Kategorie:</td>
                            
                            <td valign="top" class="value"><g:link controller="kategorieMist" action="show" id="${misto?.kategorie?.id}">${misto?.kategorie}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Akce:</td>
                            
                            <td  valign="top" style="text-align:left;" class="value">
                                <ul>
                                <g:each var="a" in="${misto.rozmisteni}">
                                    <li><g:link controller="akce" action="show" id="${a.akce.id}">${a.akce.nazev}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Rozmisteni:</td>
                            
                            <td  valign="top" style="text-align:left;" class="value">
                                <ul>
                                <g:each var="r" in="${misto.rozmisteni}">
                                    <li><g:link controller="rozmisteni" action="show" id="${r.id}">${r.nazev}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Spravce:</td>
                            
                            <td valign="top" class="value"><g:link controller="spravce" action="show" id="${misto?.spravce?.id}">${misto?.spravce.cele_jmeno}</g:link></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${misto?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="${message(code:'tisa.edit')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
