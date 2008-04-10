<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rezervace.rezervovat"/></title>
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
                            <td valign="top" class="name">Akce:</td>
                            <td valign="top" class="value"><g:link controller="akce" action="show" id="${rezervace?.akce?.id}">${rezervace?.akce?.nazev}</g:link></td>
                        </tr>
                        
                        <tr class="prop">
                            <td valign="top" class="name">Uzivatel:</td>
                            <td valign="top" class="value"><g:link controller="uzivatel" action="show" id="${rezervace?.uzivatel?.id}">${rezervace?.uzivatel?.cele_jmeno}</g:link></td>
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Mista:</td>
                            <td valign="top" class="value">${rezervace.akce.rozmisteni}</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${rezervace?.id}" />
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.rezervace.reserve')}" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
