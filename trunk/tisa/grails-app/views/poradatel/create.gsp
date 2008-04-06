

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Create Poradatel</title>         
    </head>
    <body>
        <div class="body">
            <h1>Create Poradatel</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${poradatel}">
            <div class="errors">
                <g:renderErrors bean="${poradatel}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="cele_jmeno">Celejmeno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'cele_jmeno','errors')}">
                                    <input type="text" id="cele_jmeno" name="cele_jmeno" value="${fieldValue(bean:poradatel,field:'cele_jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">Email:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:poradatel,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="heslo">Heslo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'heslo','errors')}">
                                    <input type="text" maxlength="30" id="heslo" name="heslo" value="${fieldValue(bean:poradatel,field:'heslo')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="sul">Sul:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'sul','errors')}">
                                    <input type="text" id="sul" name="sul" value="${fieldValue(bean:poradatel,field:'sul')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="telefon">Telefon:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'telefon','errors')}">
                                    <input type="text" id="telefon" name="telefon" value="${fieldValue(bean:poradatel,field:'telefon')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="adresa">Adresa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:poradatel,field:'adresa','errors')}">
                                    <input type="text" id="adresa" name="adresa" value="${fieldValue(bean:poradatel,field:'adresa')}"/>
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