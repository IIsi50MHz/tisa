<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>zpusobVyprseniRezervace List</title>
    </head>
    <body>
        <div class="body">
            <h1>zpusobVyprseniRezervace List</h1>
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
                    <g:each in="${zpusobVyprseniRezervaceList}" status="i" var="zpusobVyprseniRezervace">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="edit" id="${zpusobVyprseniRezervace.id}"><g:message code="tisa.zpusobVyprseniRezervace.casy.${zpusobVyprseniRezervace.cas}" /></g:link></td>
                        
                            <td><g:message code="tisa.zpusobVyprseniRezervace.druhy.${zpusobVyprseniRezervace.druh}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${ZpusobVyprseniRezervace.count()}" />
            </div>
        </div>
    </body>
</html>
