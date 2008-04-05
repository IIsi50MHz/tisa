

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Edit Spravce</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Spravce List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Spravce</g:link></span>
        </div>
        <div class="body">
            <h1>Spravce</h1>
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
                                    <label for="heslo">Heslo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'heslo','errors')}">
                                    <input type="text" id="heslo" name="heslo" value="${fieldValue(bean:spravce,field:'heslo')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="sul">Sul:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:spravce,field:'sul','errors')}">
                                    <input type="text" id="sul" name="sul" value="${fieldValue(bean:spravce,field:'sul')}"/>
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
                    <span class="button"><g:actionSubmit class="save" value="Ssave" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
