

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.misto.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.misto.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${misto}">
            <div class="errors">
                <g:renderErrors bean="${misto}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${misto?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Název:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:misto,field:'nazev')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="popis">Popis:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'popis','errors')}">
                                    <textarea rows="5" cols="40" name="popis">${misto?.popis?.encodeAsHTML()}</textarea>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="odkaz_mapa">Odkaz na mapu:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'odkaz_mapa','errors')}">
                                    <input type="text" id="odkaz_mapa" name="odkaz_mapa" value="${fieldValue(bean:misto,field:'odkaz_mapa')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="mesto">Město:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'mesto','errors')}">
                                    <g:select optionKey="id" from="${Mesto.list()}" name="mesto.id" value="${misto?.mesto?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="kategorie">Kategorie:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'kategorie','errors')}">
                                    <g:select optionKey="id" from="${Kategorie_mist.list()}" name="kategorie.id" value="${misto?.kategorie?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="akce">Akce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'akce','errors')}">
                                    
<ul>
<g:each var="a" in="${misto?.akce?}">
    <li><g:link controller="akce" action="show" id="${a.id}">${a}</g:link></li>
</g:each>
</ul>
<g:link controller="akce" params="["misto.id":misto?.id]" action="create">Add Akce</g:link>

                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="spravce">Správce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'spravce','errors')}">
                                    <g:select optionKey="id" from="${Spravce.list()}" name="spravce.id" value="${misto?.spravce?.id}" ></g:select>
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
