<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="admin" />
        <title><g:message code="tisa.rezervace.edit"/></title>
    </head>
    <body>
        <div class="body">
            <h1><g:message code="tisa.rezervace.edit"/></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${rezervace}">
            <div class="errors">
                <g:renderErrors bean="${rezervace}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" action="edit" >
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
                        
												<g:if test="${rezervace?.akce?.id}">
                        <tr class="prop">
                            <td valign="top" class="name">Místa:</td>
                            <td valign="top" class="value">
																<div class="plan_salu">
																<p class="vysvetlivky">
																		<span class="taken"></span> zabrané místo, <br style="clear:both"/>
																		<span class="door"></span> dveře, <br style="clear:both"/>
																		<span class="stage"></span> jeviště/plátno
																</p>
																<br style="clear:both"/>
																<g:each var="row" status="r" in="${plan}">
																		<g:each var="cell" status="c" in="${row}">
																				<g:if test="${cell=='seat'}">
																						<input type="checkbox" name="seat[${r}_${c}]" />
																				</g:if>
																				<g:else>
																					<g:if test="${cell!='e'}">
																						<g:if test="${cell=='checked'}">
																								<input type="checkbox" name="seat[${r}_${c}]" checked="checked" />
																						</g:if>
																						<g:else>
																								<div class="${cell}"></div>
																						</g:else>
																					</g:if>
																					<g:else>
																						<div></div>
																					</g:else>
																				</g:else>
																		</g:each>
																		<br style="clear:both"/>
																</g:each>
																</div>
														</td>
                        </tr>
												</g:if>
                        
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
                    <span class="button"><g:actionSubmit class="save" value="${message(code:'tisa.save')}" /></span>
<span class="button"><g:actionSubmit class="delete" onclick="return confirm('${message(code:'tisa.are_you_sure')}');" value="${message(code:'tisa.delete')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
