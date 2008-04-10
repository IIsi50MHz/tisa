<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />

        <title><g:message code="tisa.frakce.list"/></title>

    </head>
    <body>
        <div class="body">

            <h1><g:message code="tisa.frakce.list"/> - ${misto}</h1>

            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:if test="${akceList.size() != 0}">
            <div class="list">
                <table>
                    <thead>
                        <tr>                        
                   	    <g:sortableColumn property="nazev" title="Název" />
                            <g:sortableColumn property="kategorie" title="Kategorie" />
		            <g:sortableColumn property="zacatek_akce" title="Začátek akce" />
                            <g:sortableColumn property="vstupne_max" title="Max. vstupné" />
                            <g:sortableColumn property="vstupne_min" title="Min. vstupné" />
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${akceList}" status="i" var="akce">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                            <td><g:link action="show" id="${akce.id}">${akce.nazev?.encodeAsHTML()}</g:link></td>
                            <td>${akce.kategorie?.encodeAsHTML()}</td>
                            <td>${akce.zacatek_akce?.encodeAsHTML()}</td>
                            <td>${akce.vstupne_max?.encodeAsHTML()}</td>
                            <td>${akce.vstupne_min?.encodeAsHTML()}</td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${akceList.count()}" />
            </div>
             </g:if>
            <g:else>
                <div class="message"><g:message code="tisa.akce.notfound_misto"/></div>
            </g:else>
        </div>
    </body>
</html>
