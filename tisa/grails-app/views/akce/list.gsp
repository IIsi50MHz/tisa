

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
                        
                   	        <g:sortableColumn property="nazev" title="Nazev" />
                        
                   	        <g:sortableColumn property="kategorie" title="Kategorie" />

                                <g:sortableColumn property="zacatek_akce" title="Zacatek akce" />

                                <g:sortableColumn property="vstupne_min" title="Vstupne min" />

                                <g:sortableColumn property="vstupne_max" title="Vstupne max" />
                   	    
                   	        <g:sortableColumn property="odkaz" title="Odkaz" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />
                        
                   	        <g:sortableColumn property="poradatel" title="Poradatel" />

                                <g:sortableColumn property="misto" title="Misto" />
                   	    
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${akceList}" status="i" var="akce">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${akce.id}">${akce.nazev?.encodeAsHTML()}</g:link></td>
                        
                            <td>${akce.kategorie?.encodeAsHTML()}</td>
                        
                            <td>${akce.zacatek_akce?.encodeAsHTML()}</td>
                        
                            <td>${akce.vstupne_min?.encodeAsHTML()}</td>
                            
                            <td>${akce.vstupne_max?.encodeAsHTML()}</td>
                            
                            <td>${akce.odkaz?.encodeAsHTML()}</td>
                        
                            <td>${akce.popis?.encodeAsHTML()}</td>
                        
                            <td><g:link controller="poradatel" action="show" id="${akce?.poradatel?.id}">${akce?.poradatel?.cele_jmeno}</g:link></td>
                            
                            <td><g:link controller="misto" action="show" id="${akce?.misto?.id}">${akce?.misto?.nazev}</g:link></td>
                        
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
