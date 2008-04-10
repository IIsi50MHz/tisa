<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.uzivatel.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.uzivatel.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="cele_jmeno" title="Celé jméno" />
                        
                   	        <g:sortableColumn property="email" title="E-mail" />
                        
                   	        <g:sortableColumn property="adresa" title="Adresa" />
                        
                   	        <g:sortableColumn property="telefon" title="Telefon" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${uzivatelList}" status="i" var="uzivatel">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${uzivatel.id}">${uzivatel.cele_jmeno?.encodeAsHTML()}</g:link></td>
                        
                            <td>${uzivatel.email?.encodeAsHTML()}</td>
                        
                            <td>${uzivatel.adresa?.encodeAsHTML()}</td>
                        
                            <td>${uzivatel.telefon?.encodeAsHTML()}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Uzivatel.count()}" />
            </div>
        </div>
    </body>
</html>
