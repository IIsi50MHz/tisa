

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.frakce.show"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.frakce.show"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>
            
                        <tr class="prop">
                            <td valign="top" class="name">Název:</td>
                            
                            <td valign="top" class="value">${akce.nazev}</td>
                            
                        </tr>
                        
                        <tr class="prop">
                            <td valign="top" class="name">Konání</td>
                            <td valign="top" class="value"><g:link id="${akce.rozmisteni.misto.id}" action="show" controller="frontMisto">${akce.rozmisteni.misto}</g:link></td>
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Kategorie:</td>
                            <td valign="top" class="value">${akce.kategorie}</td>
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
                            <td valign="top" class="name">Maximální vstupné</td>
                            
                            <td valign="top" class="value">${akce.vstupne_max}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Minimální vstupné</td>
                            
                            <td valign="top" class="value">${akce.vstupne_min}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Začátek akce</td>
                            <td valign="top" class="value">${akce.zacatek_akce}</td>
                        </tr>
                        
                        <tr class="prop">
                            <td valign="top" class="name">&nbsp;</td>
                            <td valign="top" class="value"><g:link action="rezervovat" id="${akce.id}"><g:message code="tisa.rezervace.reserve"/></g:link></td>
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            
        </div>
    </body>
</html>
