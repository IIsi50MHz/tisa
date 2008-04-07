<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.frmisto.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.frmisto.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Nazev:</td>
                            
                            <td valign="top" class="value">${misto.nazev}</td>
                            
                        </tr>

                        <tr class="prop">
                            <td valign="top" class="name">Kategorie</td>
                            
                            <td valign="top" class="value">${misto.kategorie}</td>
                            
                        </tr>

                        <tr class="prop">
                            <td valign="top" class="name">Město:</td>
                            
                            <td valign="top" class="value">${misto.mesto}</td>
                            
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
                            <td valign="top" class="name">Správce</td>
                            
                            <td valign="top" class="value">${misto.spravce}</td>
                            
                        </tr>

                        <tr class="prop">
                          <td><g:link action="list" controller="frontMisto">zpět na seznam míst</g:link></td>
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
