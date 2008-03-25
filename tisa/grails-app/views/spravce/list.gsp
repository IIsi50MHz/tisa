

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Spravce List</title>
    </head>
    <body>
        <div class="body">
            <h1>Spravce List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="cele_jmeno" title="Celejmeno" />
                        
                   	        <g:sortableColumn property="email" title="Email" />
                        
                   	        <g:sortableColumn property="telefon" title="Telefon" />
                        
                   	        <g:sortableColumn property="vsechna_prava" title="Všechna práva" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${spravceList}" status="i" var="spravce">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td>${spravce.id?.encodeAsHTML()}</td>
                        
                            <td><g:link action="edit" id="${spravce.id}">${spravce.cele_jmeno?.encodeAsHTML()}</g:link></td>
                        
                            <td>${spravce.email?.encodeAsHTML()}</td>
                        
                            <td>${spravce.telefon?.encodeAsHTML()}</td>
                        
												
                            <td><g:message code="tisa.spravce.allrights.${spravce.vsechna_prava}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Spravce.count()}" />
            </div>
        </div>
    </body>
</html>
