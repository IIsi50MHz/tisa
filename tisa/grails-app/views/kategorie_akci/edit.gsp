

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.kategorie_akci.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.kategorie_akci.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${kategorie_akci}">
            <div class="errors">
                <g:renderErrors bean="${kategorie_akci}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${kategorie_akci?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="akce">Akce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:kategorie_akci,field:'akce','errors')}">
                                    
<ul>
<g:each var="a" in="${kategorie_akci?.akce?}">
    <li><g:link controller="akce" action="show" id="${a.id}">${a}</g:link></li>
</g:each>
</ul>
<g:link controller="akce" params="["kategorie_akci.id":kategorie_akci?.id]" action="create">Add Akce</g:link>

                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Nazev:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:kategorie_akci,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:kategorie_akci,field:'nazev')}"/>
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