<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Kategorie_mist List</title>
    </head>
    <body>
        <div class="body">
            <h1>Kategorie_mist List</h1>
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
                    <g:each in="${kategorie_mistList}" status="i" var="kategorie_mist">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${kategorie_mist.id}">${kategorie_mist.nazev?.encodeAsHTML()}</g:link></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Kategorie_mist.count()}" />
            </div>
        </div>
    </body>
</html>
