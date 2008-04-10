<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="front_end" />

        <title><g:message code="tisa.frmisto.list"/></title>

    </head>
    <body>
        <div class="body">

            <h1><g:message code="tisa.frmisto.list"/></h1>

            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                   	        <g:sortableColumn property="nazev" title="Název" />

                                <g:sortableColumn property="kategorie" title="Kategorie" />

                                 <g:sortableColumn property="mesto" title="Město" />
                        
                                <th> </th>
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${mistoList}" status="i" var="misto">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${misto.id}">${misto.nazev?.encodeAsHTML()}</g:link></td>

                            <td>${misto.kategorie.nazev?.encodeAsHTML()}</td>

                            <td>${misto.mesto?.encodeAsHTML()}</td>
                                               
                            <td>
                                  <g:link controller="frontAkce" action="ukaz_misto" id="${misto.id}" >ukázat akce &raquo;</g:link>
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
