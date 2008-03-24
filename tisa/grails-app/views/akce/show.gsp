

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Show Akce</title>
    </head>
    <body>
        <div class="body">
            <h1>Show Akce</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${akce.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Misto:</td>
                            
                            <td valign="top" class="value"><g:link controller="misto" action="show" id="${akce?.misto?.id}">${akce?.misto}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Nazev:</td>
                            
                            <td valign="top" class="value">${akce.nazev}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Odkaz:</td>
                            
                            <td valign="top" class="value">${akce.odkaz}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Popis:</td>
                            
                            <td valign="top" class="value">${akce.popis}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Vstupnemax:</td>
                            
                            <td valign="top" class="value">${akce.vstupne_max}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Vstupnemin:</td>
                            
                            <td valign="top" class="value">${akce.vstupne_min}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Zacatekakce:</td>
                            
                            <td valign="top" class="value">${akce.zacatek_akce}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${akce?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="Edit" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
