<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.operatorka.create"/></title>         
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.operatorka.create"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${operatorka}">
            <div class="errors">
                <g:renderErrors bean="${operatorka}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="misto">Místo:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:misto,field:'misto','errors')}">
                                    <g:select optionKey="id" from="${Misto.list()}" name="misto.id" value="${operatorka?.misto?.id}" ></g:select>
                                </td>
                            </tr> 												
												
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vsechny_mista">Všechny místa:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:operatorka,field:'vsechny_mista','errors')}">
                                    <input type="text" id="vsechny_mista" name="vsechny_mista" value="${fieldValue(bean:operatorka,field:'vsechny_mista')}"/>
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
                    <span class="button"><input class="save" type="submit" value="<g:message code="tisa.create"/>" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
