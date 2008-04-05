<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Akce List</title>
    </head>
    <body>
        <div class="body">
            <h1>Akce List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="nazev" title="Nazev" />

                   	        <th>Misto</th>
                                
                                <th>Poradatel</th>
                        
                   	        <g:sortableColumn property="odkaz" title="Odkaz" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />
                        
                   	        <g:sortableColumn property="vstupne_max" title="Vstupnemax" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${akceList}" status="i" var="akce">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td>${akce.id?.encodeAsHTML()}</td>
                        
                            <td><g:link action="edit" id="${akce.id}">${akce.nazev?.encodeAsHTML()}</g:link></td>
                            
                            <td><g:link controller="misto" action="show" id="${akce.misto.id}">${akce.misto?.encodeAsHTML()}</g:link></td>
                                                                            
                            <td>${akce.poradatel?.encodeAsHTML()}</td>
                            
                            <td>${akce.odkaz?.encodeAsHTML()}</td>
                        
                            <td>${akce.popis?.encodeAsHTML()}</td>
                        
                            <td>${akce.vstupne_max?.encodeAsHTML()}</td>
                            
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Akce.count()}" />
            </div>
        </div>
    </body>
</html>
