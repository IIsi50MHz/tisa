

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.kategorieAkci.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.kategorieAkci.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${kategorieAkci.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Akce:</td>
                            
                            <td  valign="top" style="text-align:left;" class="value">
                                <ul>
                                <g:each var="a" in="${kategorieAkci.akce}">
                                    <li><g:link controller="frontAkce" action="show" id="${a.id}">${a.nazev}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Nazev:</td>
                            
                            <td valign="top" class="value">${kategorieAkci.nazev}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                          <td><g:link action="list" controller="frontKategorieAkci">zpět na Kategorie akcí</g:link></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
