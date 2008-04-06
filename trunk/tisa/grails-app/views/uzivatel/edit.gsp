<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.uzivatel.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.uzivatel.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${uzivatel}">
            <div class="errors">
                <g:renderErrors bean="${uzivatel}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${uzivatel?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cele_jmeno">Celejmeno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'cele_jmeno','errors')}">
                                    <input type="text" id="cele_jmeno" name="cele_jmeno" value="${fieldValue(bean:uzivatel,field:'cele_jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">Email:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:uzivatel,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo">Heslo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'heslo','errors')}">
                                    <input type="text" maxlength="30" id="heslo" name="heslo" value="${fieldValue(bean:uzivatel,field:'heslo')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="sul">Sul:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'sul','errors')}">
                                    <input type="text" id="sul" name="sul" value="${fieldValue(bean:uzivatel,field:'sul')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="telefon">Telefon:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'telefon','errors')}">
                                    <input type="text" id="telefon" name="telefon" value="${fieldValue(bean:uzivatel,field:'telefon')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="adresa">Adresa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'adresa','errors')}">
                                    <input type="text" id="adresa" name="adresa" value="${fieldValue(bean:uzivatel,field:'adresa')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="rezervace">Rezervace:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:uzivatel,field:'rezervace','errors')}">
                                    
<ul>
<g:each var="r" in="${uzivatel?.rezervace?}">
    <li><g:link controller="rezervace" action="show" id="${r.id}">${r}</g:link></li>
</g:each>
</ul>
<g:link controller="rezervace" params="["uzivatel.id":uzivatel?.id]" action="create">Add Rezervace</g:link>

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
