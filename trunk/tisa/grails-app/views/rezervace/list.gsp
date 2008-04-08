<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rezervace.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rezervace.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="mista" title="Mista" />
                        
                   	        <g:sortableColumn property="akce" title="Akce" />

                                <g:sortableColumn property="uzivatel" title="Uzivatel" />
                            
                   	        <g:sortableColumn property="rezervovano" title="Rezervovano" />
                        
                   	        <g:sortableColumn property="prodano" title="Prodano" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${rezervaceList}" status="i" var="rezervace">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${rezervace.id}">${rezervace.mista?.encodeAsHTML()}</g:link></td>
                            
                            <td><g:link controller="akce" action="show" id="${rezervace?.akce?.id}">${rezervace?.akce?.nazev}</g:link></td>

                            <td><g:link controller="uzivatel" action="show" id="${rezervace?.uzivatel?.id}">${rezervace?.uzivatel?.cele_jmeno}</g:link></td>
                        
                            <td>${rezervace.rezervovano?.encodeAsHTML()}</td>
                        
                            <td>${rezervace.prodano?.encodeAsHTML()}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Rezervace.count()}" />
            </div>
        </div>
    </body>
</html>
