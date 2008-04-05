

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Poradatel List</title>
    </head>
    <body>
        <div class="body">
            <h1>Poradatel List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="cele_jmeno" title="Celejmeno" />
                        
                   	        <g:sortableColumn property="email" title="Email" />
                        
                   	        <g:sortableColumn property="heslo" title="Heslo" />
                        
                   	        <g:sortableColumn property="sul" title="Sul" />
                        
                   	        <g:sortableColumn property="telefon" title="Telefon" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${poradatelList}" status="i" var="poradatel">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${poradatel.id}">${poradatel.id?.encodeAsHTML()}</g:link></td>
                        
                            <td>${poradatel.cele_jmeno?.encodeAsHTML()}</td>
                        
                            <td>${poradatel.email?.encodeAsHTML()}</td>
                        
                            <td>${poradatel.heslo?.encodeAsHTML()}</td>
                        
                            <td>${poradatel.sul?.encodeAsHTML()}</td>
                        
                            <td>${poradatel.telefon?.encodeAsHTML()}</td>
                        
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
