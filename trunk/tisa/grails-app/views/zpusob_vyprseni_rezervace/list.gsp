

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Zpusob_vyprseni_rezervace List</title>
    </head>
    <body>
        <div class="body">
            <h1>Zpusob_vyprseni_rezervace List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="cas" title="Cas" />
                        
                   	        <g:sortableColumn property="druh" title="Druh" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${zpusob_vyprseni_rezervaceList}" status="i" var="zpusob_vyprseni_rezervace">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${zpusob_vyprseni_rezervace.id}"><g:message code="tisa.zpusob_vyprseni_rezervace.casy.${zpusob_vyprseni_rezervace.cas}" /></g:link></td>
                        
                            <td><g:message code="tisa.zpusob_vyprseni_rezervace.druhy.${zpusob_vyprseni_rezervace.druh}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Zpusob_vyprseni_rezervace.count()}" />
            </div>
        </div>
    </body>
</html>
