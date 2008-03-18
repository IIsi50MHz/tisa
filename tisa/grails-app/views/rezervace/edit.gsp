

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Edit Rezervace</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Rezervace List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New Rezervace</g:link></span>
        </div>
        <div class="body">
            <h1>Edit Rezervace</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rezervace}">
            <div class="errors">
                <g:renderErrors bean="${rezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${rezervace?.id}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="akce">Akce:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'akce','errors')}">
                                    <g:select optionKey="id" from="${Akce.list()}" name="akce.id" value="${rezervace?.akce?.id}" ></g:select>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="mista">Mista:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'mista','errors')}">
                                    <input type="text" id="mista" name="mista" value="${fieldValue(bean:rezervace,field:'mista')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="rezervovano">Rezervovano:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'rezervovano','errors')}">
                                    <g:datePicker name="rezervovano" value="${rezervace?.rezervovano}" ></g:datePicker>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="prodano">Prodano:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:rezervace,field:'prodano','errors')}">
                                    <g:checkBox name="prodano" value="${rezervace?.prodano}" ></g:checkBox>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="Update" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
