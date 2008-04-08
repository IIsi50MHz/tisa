<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.operatorka.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.operatorka.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="cele_jmeno" title="Celejmeno" />
                        
                   	        <g:sortableColumn property="vsechny_mista" title="Vsechnymista" />
                        
                   	        <g:sortableColumn property="email" title="Email" />
                        
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${operatorkaList}" status="i" var="operatorka">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${operatorka.id}">${operatorka.cele_jmeno?.encodeAsHTML()}</g:link></td>
                        
                            <td>${operatorka.vsechny_mista?.encodeAsHTML()}</td>
                        
                            <td>${operatorka.email?.encodeAsHTML()}</td>
                        

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Operatorka.count()}" />
            </div>
        </div>
    </body>
</html>
