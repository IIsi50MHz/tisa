

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Zpusob_vyprseni_rezervace List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Zpusob_vyprseni_rezervace</g:link></span>
        </div>
        <div class="body">
            <h1>Zpusob_vyprseni_rezervace List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="cas" title="Cas" />
                        
                   	        <g:sortableColumn property="druh" title="Druh" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${zpusob_vyprseni_rezervaceList}" status="i" var="zpusob_vyprseni_rezervace">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${zpusob_vyprseni_rezervace.id}">${zpusob_vyprseni_rezervace.id?.encodeAsHTML()}</g:link></td>
                        
                            <td>${zpusob_vyprseni_rezervace.cas?.encodeAsHTML()}</td>
                        
                            <td>${zpusob_vyprseni_rezervace.druh?.encodeAsHTML()}</td>
                        
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
