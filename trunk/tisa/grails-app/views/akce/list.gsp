

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.akce.list"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.akce.list"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="nazev" title="Název" />
                        
                   	        <g:sortableColumn property="kategorie" title="Kategorie" />

                                <g:sortableColumn property="zacatek_akce" title="Začátek akce" />

                                <g:sortableColumn property="vstupne_min" title="Min. vstupné" />

                                <g:sortableColumn property="vstupne_max" title="Max. vstupné" />
                   	    
                   	        <g:sortableColumn property="odkaz" title="Odkaz" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />
                        
                   	        <g:sortableColumn property="poradatel" title="Pořadatel" />

                                
                   	    
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${akceList}" status="i" var="akce">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${akce.id}">${akce.nazev?.encodeAsHTML()}</g:link></td>
                        
                            <td><g:link controller="kategorieAkci" action="show" id="${akce?.kategorie?.id}">${akce?.kategorie}</g:link></td>
                        
                            <td>${akce.zacatek_akce?.encodeAsHTML()}</td>
                        
                            <td>${akce.vstupne_min?.encodeAsHTML()}</td>
                            
                            <td>${akce.vstupne_max?.encodeAsHTML()}</td>
                            
                            <td>${akce.odkaz?.encodeAsHTML()}</td>
                        
                            <td>${akce.popis?.encodeAsHTML()}</td>
                        
                            <td><g:link controller="poradatel" action="show" id="${akce?.poradatel?.id}">${akce?.poradatel?.cele_jmeno}</g:link></td>
                            
                           
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${akceList.count()}" />
            </div>
        </div>
    </body>
</html>
