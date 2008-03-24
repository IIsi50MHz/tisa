

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Show Zpusob_vyprseni_rezervace</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Zpusob_vyprseni_rezervace List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Zpusob_vyprseni_rezervace</g:link></span>
        </div>
        <div class="body">
            <h1>Show Zpusob_vyprseni_rezervace</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Cas:</td>
                            
                            <td valign="top" class="value"><g:message code="tisa.Zpusob_vyprseni_rezervace.casy.${zpusob_vyprseni_rezervace.cas}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Druh:</td>
                            
                            <td valign="top" class="value"><g:message code="tisa.Zpusob_vyprseni_rezervace.druhy.${zpusob_vyprseni_rezervace.druh}" /></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${zpusob_vyprseni_rezervace?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="Edit" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
