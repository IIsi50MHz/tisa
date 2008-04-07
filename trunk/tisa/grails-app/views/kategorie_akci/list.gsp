

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.kategorie_akci.list"/></title>
    </head>
    <body>
       <div class="body">
            <h1><g:message code="tisa.kategorie_akci.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	      <g:sortableColumn property="nazev" title="Nazev" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${kategorie_akciList}" status="i" var="kategorie_akci">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${kategorie_akci.id}">${kategorie_akci.nazev?.encodeAsHTML()}</g:link></td>
                                                                           
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Kategorie_akci.count()}" />
            </div>
        </div>
    </body>
</html>
