

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Create Mesto</title>         
    </head>
    <body>
        <div class="body">
            <h1>Create Mesto</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${mesto}">
            <div class="errors">
                <g:renderErrors bean="${mesto}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="jmeno">Jmeno:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:mesto,field:'jmeno','errors')}">
                                    <input type="text" id="jmeno" name="jmeno" value="${fieldValue(bean:mesto,field:'jmeno')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="mapa">Mapa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:mesto,field:'mapa','errors')}">
                                    <input type="text" id="mapa" name="mapa" value="${fieldValue(bean:mesto,field:'mapa')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="popis">Popis:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:mesto,field:'popis','errors')}">
                                    <input type="text" id="popis" name="popis" value="${fieldValue(bean:mesto,field:'popis')}"/>
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
