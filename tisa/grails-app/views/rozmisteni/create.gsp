

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Create Rozmisteni</title>         
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Rozmisteni List</g:link></span>
        </div>
        <div class="body">
            <h1>Create Rozmisteni</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rozmisteni}">
            <div class="errors">
                <g:renderErrors bean="${rozmisteni}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Nazev:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:rozmisteni,field:'nazev')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="plan_salu">Plansalu:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'plan_salu','errors')}">
                                    <input type="text" id="plan_salu" name="plan_salu" value="${fieldValue(bean:rozmisteni,field:'plan_salu')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto">Misto:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rozmisteni,field:'misto','errors')}">
                                    <g:select optionKey="id" from="${Misto.list()}" name="misto.id" value="${rozmisteni?.misto?.id}" ></g:select>
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
