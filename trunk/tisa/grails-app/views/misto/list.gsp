

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
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="nazev" title="Nazev" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />
                        
                   	        <g:sortableColumn property="odkaz_mapa" title="Odkazmapa" />
                        
                   	        <th>Mesto</th>
                   	    
                   	        <th>Kategorie</th>

                                <th>Akce</th>
                   	    
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${mistoList}" status="i" var="misto">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${misto.id}">${misto.id?.encodeAsHTML()}</g:link></td>
                        
                            <td>${misto.nazev?.encodeAsHTML()}</td>
                        
                            <td>${misto.popis?.encodeAsHTML()}</td>
                        
                            <td>${misto.odkaz_mapa?.encodeAsHTML()}</td>
                        
                            <td>${misto.mesto?.encodeAsHTML()}</td>
                        
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
