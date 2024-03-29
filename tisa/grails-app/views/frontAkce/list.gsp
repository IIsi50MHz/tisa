<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />

        <title><g:message code="tisa.frakce.list"/></title>

    </head>
    <body>
        <div class="body">

            <h1><g:message code="tisa.frakce.list"/></h1>

            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                   	        <g:sortableColumn property="nazev" title="Název" />
                            <g:sortableColumn property="kategorie" title="Kategorie" />
                   	        <th>Místo konání</th>
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
                            <td><g:link controller="frontMisto" action="show" id="${akce.rozmisteni.misto.id}">${akce.rozmisteni.misto?.encodeAsHTML()}</g:link></td>
                            <td>${akce.zacatek_akce?.encodeAsHTML()}</td>
                            <td>${akce.vstupne_max?.encodeAsHTML()}</td>
                            <td>${akce.vstupne_min?.encodeAsHTML()}</td>
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
