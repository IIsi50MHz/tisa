<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.akce.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.akce.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${akce}">
            <div class="errors">
                <g:renderErrors bean="${akce}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${akce?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="kategorie">Kategorie:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'kategorie','errors')}">
                                    <g:select optionKey="id" from="${Kategorie_akci.list()}" name="kategorie.id" value="${akce?.kategorie?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Název:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:akce,field:'nazev')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="odkaz">Odkaz:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'odkaz','errors')}">
                                    <input type="text" id="odkaz" name="odkaz" value="${fieldValue(bean:akce,field:'odkaz')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="popis">Popis:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'popis','errors')}">
                                    <input type="text" id="popis" name="popis" value="${fieldValue(bean:akce,field:'popis')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="poradatel">Pořadatel:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'poradatel','errors')}">
                                    <g:select optionKey="id" from="${Poradatel.list()}" name="poradatel.id" value="${akce?.poradatel?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="rezervace">Rezervace:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'rezervace','errors')}">
                                    
<ul>
<g:each var="r" in="${akce?.rezervace?}">
    <li><g:link controller="rezervace" action="show" id="${r.id}">${r}</g:link></li>
</g:each>
</ul>
<g:link controller="rezervace" params="["akce.id":akce?.id]" action="create">Add Rezervace</g:link>

                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="rozmisteni">Rozmístění:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'rozmisteni','errors')}">
                                    <g:select optionKey="id" from="${Rozmisteni.list()}" name="rozmisteni.id" value="${akce?.rozmisteni?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vstupne_max">Maximální vstupné</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'vstupne_max','errors')}">
                                    <input type="text" id="vstupne_max" name="vstupne_max" value="${fieldValue(bean:akce,field:'vstupne_max')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vstupne_min">Minimální vstupné</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'vstupne_min','errors')}">
                                    <input type="text" id="vstupne_min" name="vstupne_min" value="${fieldValue(bean:akce,field:'vstupne_min')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="zacatek_akce">Začátek akce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'zacatek_akce','errors')}">
                                    <g:datePicker name="zacatek_akce" value="${akce?.zacatek_akce}" ></g:datePicker>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="zpusobVyprseniRezervace">Způsob vypršení rezervace:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'zpusobVyprseniRezervace','errors')}">
                                    <g:select optionKey="id" from="${ZpusobVyprseniRezervace.list()}" name="zpusobVyprseniRezervace.id" value="${akce?.zpusobVyprseniRezervace?.id}" ></g:select>
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
