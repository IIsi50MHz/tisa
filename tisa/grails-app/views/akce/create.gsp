

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title>Create Akce</title>         
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Akce List</g:link></span>
        </div>
        <div class="body">
            <h1>Create Akce</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${akce}">
            <div class="errors">
                <g:renderErrors bean="${akce}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto">Misto:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'misto','errors')}">
                                    <g:select optionKey="id" from="${Misto.list()}" name="misto.id" value="${akce?.misto?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="nazev">Nazev:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'nazev','errors')}">
                                    <input type="text" id="nazev" name="nazev" value="${fieldValue(bean:akce,field:'nazev')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="odkaz">Odkaz:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'odkaz','errors')}">
                                    <input type="text" id="odkaz" name="odkaz" value="${fieldValue(bean:akce,field:'odkaz')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="popis">Popis:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'popis','errors')}">
                                    <input type="text" id="popis" name="popis" value="${fieldValue(bean:akce,field:'popis')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vstupne_max">Vstupnemax:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'vstupne_max','errors')}">
                                    <input type="text" id="vstupne_max" name="vstupne_max" value="${fieldValue(bean:akce,field:'vstupne_max')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vstupne_min">Vstupnemin:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'vstupne_min','errors')}">
                                    <input type="text" id="vstupne_min" name="vstupne_min" value="${fieldValue(bean:akce,field:'vstupne_min')}" />
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="zacatek_akce">Zacatekakce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:akce,field:'zacatek_akce','errors')}">
                                    <g:datePicker name="zacatek_akce" value="${akce?.zacatek_akce}" ></g:datePicker>
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
