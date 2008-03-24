

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Edit Zpusob_vyprseni_rezervace</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Zpusob_vyprseni_rezervace List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Zpusob_vyprseni_rezervace</g:link></span>
        </div>
        <div class="body">
            <h1>Edit Zpusob_vyprseni_rezervace</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${zpusob_vyprseni_rezervace}">
            <div class="errors">
                <g:renderErrors bean="${zpusob_vyprseni_rezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${zpusob_vyprseni_rezervace?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cas">Cas:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:zpusob_vyprseni_rezervace,field:'cas','errors')}">
                                    <g:select valueMessagePrefix="tisa.Zpusob_vyprseni_rezervace.casy" from="${zpusob_vyprseni_rezervace.casy}" name="cas" value="${fieldValue(bean:zpusob_vyprseni_rezervace,field:'cas')}"></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="druh">Druh:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:zpusob_vyprseni_rezervace,field:'druh','errors')}">
                                    <g:select valueMessagePrefix="tisa.Zpusob_vyprseni_rezervace.druhy" from="${zpusob_vyprseni_rezervace.druhy}" name="druh" value="${fieldValue(bean:zpusob_vyprseni_rezervace,field:'druh')}"></g:select>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="Update" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
