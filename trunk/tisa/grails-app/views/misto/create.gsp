

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.misto.create"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.misto.create"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${misto}">
            <div class="errors">
                <g:renderErrors bean="${misto}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
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
                                    <g:select optionKey="id" from="${KategorieMist.list()}" name="kategorie.id" value="${misto?.kategorie?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="spravce">Správce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'spravce','errors')}">
                                    <g:select optionKey="id" from="${session.user.listSpravce()}" name="spravce.id" value="${misto?.spravce?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="<g:message code="tisa.create"/>" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
