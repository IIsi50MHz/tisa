

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Show Rezervace</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Rezervace List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Rezervace</g:link></span>
        </div>
        <div class="body">
            <h1>Show Rezervace</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${rezervace.id}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Akce:</td>
                            
                            <td valign="top" class="value"><g:link controller="akce" action="show" id="${rezervace?.akce?.id}">${rezervace?.akce}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Mista:</td>
                            
                            <td valign="top" class="value">${rezervace.mista}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Rezervovano:</td>
                            
                            <td valign="top" class="value">${rezervace.rezervovano}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Prodano:</td>
                            
                            <td valign="top" class="value">${rezervace.prodano}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${rezervace?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="Edit" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
