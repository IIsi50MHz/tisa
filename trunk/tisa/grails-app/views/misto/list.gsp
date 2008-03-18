<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Misto List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Misto</g:link></span>
        </div>
        <div class="body">
            <h1>Misto List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                   	        <g:sortableColumn property="nazev" title="Nazev" />
                        
                   	        <g:sortableColumn property="popis" title="Popis" />

                                <th>akce</th>
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${mistoList}" status="i" var="misto">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${misto.id}">${misto.nazev?.encodeAsHTML()}</g:link></td>
                        
                            <td>${misto.popis?.encodeAsHTML()}</td>
                        
                            <td>
                                  <g:link action="list" controller="akce" id="${misto.id}" >
                                    ukázat akce &raquo;
                                   </g:link>
                            </td>

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Misto.count()}" />
            </div>
        </div>
    </body>
</html>
