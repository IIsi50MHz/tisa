

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Rozmisteni List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Rozmisteni</g:link></span>
        </div>
        <div class="body">
            <h1>Rozmisteni List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="nazev" title="Nazev" />
                        
                   	        <g:sortableColumn property="plan_salu" title="Plansalu" />
                        
                   	        <th>Misto</th>
                   	    
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${rozmisteniList}" status="i" var="rozmisteni">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${rozmisteni.id}">${rozmisteni.id?.encodeAsHTML()}</g:link></td>
                        
                            <td>${rozmisteni.nazev?.encodeAsHTML()}</td>
                        
                            <td>${rozmisteni.plan_salu?.encodeAsHTML()}</td>
                        
                            <td>${rozmisteni.misto?.encodeAsHTML()}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Rozmisteni.count()}" />
            </div>
        </div>
    </body>
</html>
