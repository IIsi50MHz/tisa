<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.poradatel.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.poradatel.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="cele_jmeno" title="Celé jméno" />
                        
                   	        <g:sortableColumn property="email" title="E-mail" />
                        
                   	        <g:sortableColumn property="telefon" title="Telefon" />

                                <g:sortableColumn property="adresa" title="Adresa" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${poradatelList}" status="i" var="poradatel">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${poradatel.id}">${poradatel.cele_jmeno?.encodeAsHTML()}</g:link></td>
                        
                            <td>${poradatel.email?.encodeAsHTML()}</td>
                        
                            <td>${poradatel.telefon?.encodeAsHTML()}</td>
                            
                            <td>${poradatel.adresa?.encodeAsHTML()}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Poradatel.count()}" />
            </div>
        </div>
    </body>
</html>
