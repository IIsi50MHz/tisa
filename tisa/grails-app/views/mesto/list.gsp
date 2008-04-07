

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.mesto.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.mesto.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="jmeno" title="Jmeno" />
                        
                   	        <g:sortableColumn property="mapa" title="Mapa" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${mestoList}" status="i" var="mesto">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${mesto.id}">${mesto.id?.encodeAsHTML()}</g:link></td>
                        
                            <td>${mesto.jmeno?.encodeAsHTML()}</td>
                        
                            <td>${mesto.mapa?.encodeAsHTML()}</td>
                        
                            <td>${mesto.popis?.encodeAsHTML()}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Mesto.count()}" />
            </div>
        </div>
    </body>
</html>
