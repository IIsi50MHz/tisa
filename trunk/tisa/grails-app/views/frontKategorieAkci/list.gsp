

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />
        <title><g:message code="tisa.kategorieAkci.list"/></title>
    </head>
    <body>
       <div class="body">
            <h1><g:message code="tisa.kategorieAkci.list"/></h1>
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
                    <g:each in="${kategorieAkciList}" status="i" var="kategorieAkci">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${kategorieAkci.id}">${kategorieAkci.nazev?.encodeAsHTML()}</g:link></td>
                                                                           
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${KategorieAkci.count()}" />
            </div>
        </div>
    </body>
</html>
