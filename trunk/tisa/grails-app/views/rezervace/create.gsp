

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rezervace.create"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rezervace.create"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rezervace}">
            <div class="errors">
                <g:renderErrors bean="${rezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="akce">Akce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'akce','errors')}">
                                    <g:select optionKey="id" from="${Akce.list()}" name="akce.id" value="${rezervace?.akce?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="mista">Mista:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'mista','errors')}">
                                    <input type="text" id="mista" name="mista" value="${fieldValue(bean:rezervace,field:'mista')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="rezervovano">Rezervovano:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'rezervovano','errors')}">
                                    <g:datePicker name="rezervovano" value="${rezervace?.rezervovano}" ></g:datePicker>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="prodano">Prodano:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'prodano','errors')}">
                                    <g:checkBox name="prodano" value="${rezervace?.prodano}" ></g:checkBox>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="<g:message code="tisa.create"/>" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
