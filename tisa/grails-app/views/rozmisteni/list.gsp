<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rozmisteni.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rozmisteni.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                   	        <g:sortableColumn property="nazev" title="Nazev" />
                   	        <g:sortableColumn property="misto" title="Misto" />
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${rozmisteniList}" status="i" var="rozmisteni">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                            <td><g:link action="edit" id="${rozmisteni.id}">${rozmisteni.nazev?.encodeAsHTML()}</g:link></td>
                            <td><g:link controller="misto" action="show" id="${rozmisteni?.misto?.id}">${rozmisteni?.misto?.nazev}</g:link></td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Rozmisteni.count()}" />
            </div>
        </div>
    </body>
</html>
