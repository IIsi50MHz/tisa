

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Rezervace List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Rezervace</g:link></span>
        </div>
        <div class="body">
            <h1>Rezervace List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <th>Akce</th>
                   	    
                   	        <g:sortableColumn property="mista" title="Mista" />
                        
                   	        <g:sortableColumn property="rezervovano" title="Rezervovano" />
                        
                   	        <g:sortableColumn property="prodano" title="Prodano" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${rezervaceList}" status="i" var="rezervace">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${rezervace.id}">${rezervace.id?.encodeAsHTML()}</g:link></td>
                        
                            <td>${rezervace.akce?.encodeAsHTML()}</td>
                        
                            <td>${rezervace.mista?.encodeAsHTML()}</td>
                        
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
