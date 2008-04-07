<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.zpusob_vyprseni_rezervace.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.zpusob_vyprseni_rezervace.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${zpusobVyprseniRezervace}">
            <div class="errors">
                <g:renderErrors bean="${zpusobVyprseniRezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${zpusobVyprseniRezervace?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cas">Cas:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:zpusobVyprseniRezervace,field:'cas','errors')}">
                                    <g:select valueMessagePrefix="tisa.zpusobVyprseniRezervace.casy" from="${zpusobVyprseniRezervace.casy}" name="cas" value="${fieldValue(bean:zpusobVyprseniRezervace,field:'cas')}"></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="druh">Druh:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:zpusobVyprseniRezervace,field:'druh','errors')}">
                                    <g:select valueMessagePrefix="tisa.zpusobVyprseniRezervace.druhy" from="${zpusobVyprseniRezervace.druhy}" name="druh" value="${fieldValue(bean:zpusobVyprseniRezervace,field:'druh')}"></g:select>
                                </td>
                            </tr> 
														
				                    <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto">Místo:</label>
                                </td>
				                        <td valign="top" class="value ${hasErrors(bean:zpusobVyprseniRezervace,field:'misto','errors')}">
                                    <g:select optionKey="id" from="${Misto.list()}" name="misto.id" value="${fieldValue(bean:zpusobVyprseniRezervace?.misto)}" ></g:select>
                                </td>
                            </tr> 

                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.update')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
