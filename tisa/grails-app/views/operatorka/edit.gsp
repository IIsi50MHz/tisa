<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.operatorka.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.operatorka.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${operatorka}">
            <div class="errors">
                <g:renderErrors bean="${operatorka}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${operatorka?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                        <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vsechny_mista">Všechny místa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'vsechny_mista','errors')}">
                                    <g:checkBox name="vsechny_mista" value="${operatorka?.vsechny_mista}" ></g:checkBox>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cele_jmeno">Celé jméno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'cele_jmeno','errors')}">
                                    <input type="text" id="cele_jmeno" name="cele_jmeno" value="${fieldValue(bean:operatorka,field:'cele_jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">E-mail:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:operatorka,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo">Heslo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'heslo','errors')}">
                                    <input type="text" maxlength="30" id="heslo" name="heslo" value="${fieldValue(bean:operatorka,field:'heslo')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="sul">Sůl:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'sul','errors')}">
                                    <input type="text" id="sul" name="sul" value="${fieldValue(bean:operatorka,field:'sul')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="telefon">Telefon:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'telefon','errors')}">
                                    <input type="text" id="telefon" name="telefon" value="${fieldValue(bean:operatorka,field:'telefon')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="adresa">Adresa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'adresa','errors')}">
                                    <input type="text" id="adresa" name="adresa" value="${fieldValue(bean:operatorka,field:'adresa')}"/>
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
