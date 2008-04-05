

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Show zpusobVyprseniRezervace</title>
    </head>
    <body>
        <div class="body">
            <h1>Show zpusobVyprseniRezervace</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Cas:</td>
                            
                            <td valign="top" class="value"><g:message code="tisa.zpusobVyprseniRezervace.casy.${zpusobVyprseniRezervace.cas}" /></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Druh:</td>
                            
                            <td valign="top" class="value"><g:message code="tisa.zpusobVyprseniRezervace.druhy.${zpusobVyprseniRezervace.druh}" /></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${zpusobVyprseniRezervace?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="Edit" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
