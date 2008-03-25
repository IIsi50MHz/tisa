

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Create Zpusob_vyprseni_rezervace</title>         
    </head>
    <body>
        <div class="body">
            <h1>Create Zpusob_vyprseni_rezervace</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${zpusob_vyprseni_rezervace}">
            <div class="errors">
                <g:renderErrors bean="${zpusob_vyprseni_rezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cas">Cas:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:zpusob_vyprseni_rezervace,field:'cas','errors')}">
                                    <g:select valueMessagePrefix="tisa.zpusob_vyprseni_rezervace.casy" from="${zpusob_vyprseni_rezervace.casy}" name="cas" value="${fieldValue(bean:zpusob_vyprseni_rezervace,field:'cas')}"></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="druh">Druh:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:zpusob_vyprseni_rezervace,field:'druh','errors')}">
                                    <g:select valueMessagePrefix="tisa.zpusob_vyprseni_rezervace.druhy" from="${zpusob_vyprseni_rezervace.druhy}" name="druh" value="${fieldValue(bean:zpusob_vyprseni_rezervace,field:'druh')}"></g:select>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="Create" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
