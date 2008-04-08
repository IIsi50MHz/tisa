

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.misto.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.misto.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                        
                   	        <g:sortableColumn property="nazev" title="Nazev" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />
                        
                   	        <g:sortableColumn property="odkaz_mapa" title="Odkazmapa" />
                        
                   	        <g:sortableColumn property="mesto" title="Mesto" />

                                <g:sortableColumn property="spravce" title="Spravce" />
                   	    
                   	        <g:sortableColumn property="kategorie" title="Kategorie" />

                                <th> </th>
                   	    
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${mistoList}" status="i" var="misto">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${misto.id}">${misto.nazev?.encodeAsHTML()}</g:link></td>
                        
                        
                            <td>${misto.popis?.encodeAsHTML()}</td>
                        
                            <td>${misto.odkaz_mapa?.encodeAsHTML()}</td>
                        
                            <td><g:link controller="mesto" action="show" id="${misto?.mesto?.id}">${misto?.mesto?.jmeno}</g:link></td>
                        
                            <td><g:link controller="spravce" action="show" id="${misto?.spravce?.id}">${misto?.spravce?.cele_jmeno}</g:link></td>
                        
                            <td>${misto.kategorie?.encodeAsHTML()}</td>

                            <td>
                                  <g:link action="list" controller="akce" id="${misto.id}" >
                                    ukázat akce &raquo;
                                   </g:link>
                            </td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Misto.count()}" />
            </div>
        </div>
    </body>
</html>
