

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.kategorieMist.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.kategorieMist.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${kategorieMist.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Nazev:</td>
                            
                            <td valign="top" class="value">${kategorieMist.nazev}</td>
                            
                        </tr>

                        <tr class="prop">
                            <td valign="top" class="name">Místa:</td>
                            
                            <td  valign="top" style="text-align:left;" class="value">
                                <ul>
                                <g:each var="m" in="${kategorieMist.misto}">
                                    <li><g:link controller="frontMisto" action="show" id="${m.id}">${m.nazev}</g:link></li>
                                </g:each>
                                </ul>
                            </td>
                        </tr>

                        <tr class="prop">
                          <td><g:link action="list" controller="frontKategorieMist">zpět na Kategorie míst</g:link></td>
                        </tr>
                    
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
