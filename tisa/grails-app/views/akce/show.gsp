

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.akce.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.akce.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${akce.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Kategorie:</td>
                            
                            <td valign="top" class="value"><g:link controller="kategorie_akci" action="show" id="${akce?.kategorie?.id}">${akce?.kategorie}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Nazev:</td>
                            
                            <td valign="top" class="value">${akce.nazev}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Odkaz:</td>
                            
                            <td valign="top" class="value">${akce.odkaz}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Popis:</td>
                            
                            <td valign="top" class="value">${akce.popis}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Poradatel:</td>
                            
                            <td valign="top" class="value"><g:link controller="poradatel" action="show" id="${akce?.poradatel?.id}">${akce?.poradatel?.cele_jmeno}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Rezervace:</td>
                            
                            <td  valign="top" style="text-align:left;" class="value">
                                <ul>
                                <g:each var="r" in="${akce.rezervace}">
                                    <li><g:link controller="rezervace" action="show" id="${r.id}">${r}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Rozmisteni:</td>
                            
                            <td valign="top" class="value"><g:link controller="rozmisteni" action="show" id="${akce?.rozmisteni?.id}">${akce?.rozmisteni}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Vstupnemax:</td>
                            
                            <td valign="top" class="value">${akce.vstupne_max}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Vstupnemin:</td>
                            
                            <td valign="top" class="value">${akce.vstupne_min}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Zacatekakce:</td>
                            
                            <td valign="top" class="value">${akce.zacatek_akce}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Zpusob Vyprseni Rezervace:</td>
                            
                            <td valign="top" class="value"><g:link controller="zpusobVyprseniRezervace" action="show" id="${akce?.zpusobVyprseniRezervace?.id}">${akce?.zpusobVyprseniRezervace}</g:link></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${akce?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="${message(code:'tisa.edit')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
