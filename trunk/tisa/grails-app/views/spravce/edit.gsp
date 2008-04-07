<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.spravce.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.spravce.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${spravce}">
            <div class="errors">
                <g:renderErrors bean="${spravce}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" action="save">
                <input type="hidden" name="id" value="${spravce?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>                       
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cele_jmeno">Cele jmeno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'cele_jmeno','errors')}">
                                    <input type="text" id="cele_jmeno" name="cele_jmeno" value="${fieldValue(bean:spravce,field:'cele_jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">Email:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:spravce,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo"><g:message code="tisa.user.password"/>:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'heslo','errors')}">
                                    <input type="password" id="heslo" name="heslo" value=""/>
                                </td>
                            </tr> 
                
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo"><g:message code="tisa.user.password_again"/>:</label>
                                </td>
                                <td valign="top" class="value">
                                    <input type="password" id="heslo" name="heslo_znova" value=""/>
                                </td>
                            </tr> 
                
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="telefon">Telefon:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'telefon','errors')}">
                                    <input type="text" id="telefon" name="telefon" value="${fieldValue(bean:spravce,field:'telefon')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="adresa">Adresa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'adresa','errors')}">
                                    <input type="text" id="adresa" name="adresa" value="${fieldValue(bean:spravce,field:'adresa')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vsechna_prava">Vsechnaprava:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'vsechna_prava','errors')}">
                                    <g:checkBox name="vsechna_prava" value="${spravce?.vsechna_prava}" ></g:checkBox>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.save')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
